/**
 * 
 */
package com.crm.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IYingXiaoMapper;
import com.crm.pojo.SellOpportunity;
import com.crm.service.IYingXiaoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * @author admin
 * @createTime 2020年12月2日上午9:04:01
 * @updateTime 2020年12月2日上午9:04:01 
 * @version 1.0.0
 */
@Service
public class YingXiaoServiceImpl implements IYingXiaoService {
   @Resource 
   private IYingXiaoMapper yxm;
	
	@Override
	public String showChance(Model model, String accountId,Integer pageNum) {
		 pageNum = pageNum==null ? 1 : pageNum;
		//启用分页
			PageHelper.startPage(pageNum, 5);
			//查询角色数据
			 List list=yxm.showChance(accountId);
			//获得分页相关信息
			PageInfo<SellOpportunity> pageInfo = new PageInfo(list, 5);
		     model.addAttribute("showlist",list);
		     model.addAttribute("pageInfo",pageInfo);
		     return "xiaoshoujihui";
	}
	

}
