package com.crm.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IMailMapper;
import com.crm.mapper.IUserMapper;
import com.crm.pojo.CrmAccount;
import com.crm.pojo.CrmMail;
import com.crm.service.IMailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @classComment 邮件管理业务实现类
 * @author yangyongtao
 * @createTime 2020-12-08 上午10:56:29
 * @updateTime 2020-12-08 上午10:56:29
 * @version 1.0.0.0
 */
@Service
public class MailServiceImpl implements IMailService {

	@Resource
	private IMailMapper imailMapper;
	@Resource
	private IUserMapper iuserMapper;

	@Override
	public String queryReceive(Model model, Integer receiveId, Integer pageNum) throws Exception {
		// 判断是否获得页码
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 10);
		// 查询角色数据
		List<CrmMail> list = imailMapper.queryReceive(receiveId);
		// 获得分页相关信息
		PageInfo<CrmMail> pageInfo = new PageInfo<CrmMail>(list, 10);
		// 封装模型数据
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		return "pages/mail/receive";
	}

	@Override
	public String querySend(Model model, Integer sendId, Integer pageNum) throws Exception {
		// 判断是否获得页码
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 10);
		// 查询角色数据
		List<CrmMail> list = imailMapper.querySend(sendId);
		// 获得分页相关信息
		PageInfo<CrmMail> pageInfo = new PageInfo<CrmMail>(list, 10);
		// 封装模型数据
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		return "pages/mail/send";
	}

	@Override
	public String queryUser(Model model) throws Exception {
		List<CrmAccount> list = iuserMapper.queryAll(null);
		model.addAttribute("list", list);
		return "pages/mail/wr";
	}

}
