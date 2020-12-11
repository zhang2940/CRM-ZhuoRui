/**
 * 
 */
package com.crm.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IYingXiaoMapper;
import com.crm.pojo.Account;
import com.crm.pojo.Client;
import com.crm.pojo.Plan;
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


	public String showChance(Model model, Integer accountId, Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		// 查询角色数据
		List list = yxm.showChance(accountId);
		// 获得分页相关信息
		PageInfo<SellOpportunity> pageInfo = new PageInfo(list, 5);
		model.addAttribute("showlist", list);
		model.addAttribute("pageInfo", pageInfo);
		return "xiaoshoujihui";
	}

	/**
	 * @param chaChance @param YingXiaoServiceImpl @return String @throws
	 */
	public String chaChance(Model model, String clientName, String summary, String contact, Integer accountId,
			Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		// 查询角色数据
		List<SellOpportunity> list = yxm.chaChance(clientName, summary, contact, accountId);
		// 获得分页相关信息
		PageInfo<SellOpportunity> pageInfo = new PageInfo(list, 5);
		model.addAttribute("showlist", list);
		model.addAttribute("biaoshi", "biaoshi");
		model.addAttribute("pageInfo", pageInfo);
		return "xiaoshoujihui";
	}

	/**
	 * @param xiaoshan @param YingXiaoServiceImpl @return void @throws
	 */
	public void xiaoshan(Integer sellId) {

		yxm.xiaoshan(sellId);

	}


	public String chaAccount(Model model) {
		List<Account> list = yxm.chaAccount(model);
		model.addAttribute("accountlist", list);
		return "xinjianxiaoshou";

	}

	/**
	 * @param jianXiao @param YingXiaoServiceImpl @return String @throws
	 */
	public String jianXiao(Model model, SellOpportunity sellOpportunity) {

		yxm.jianXiao(sellOpportunity.getSellId(), sellOpportunity.getAccountId(),
				sellOpportunity.getOpportunitySource(), sellOpportunity.getCustomerName(),
				sellOpportunity.getSuccessProbability(), sellOpportunity.getSummary(), sellOpportunity.getContacts(),
				sellOpportunity.getContactsPhone(), sellOpportunity.getOpportunityDescrible(),
				sellOpportunity.getCreator(), sellOpportunity.getCreationTime(), sellOpportunity.getDesignatedPerson(),
				sellOpportunity.getDesignatedTime(), sellOpportunity.getDistribution());
		return "xinjianxiaoshou";
	}

	/**
	 * @param hcaXiuXiao @param YingXiaoServiceImpl @return String @throws
	 */
	public String chaXiuXiao(Model model, Integer sellId) {
		List<SellOpportunity> cha = yxm.chaXiuXiao(sellId);
		model.addAttribute("chaxiu", cha);
		List<Account> cha1 = yxm.chaAcount(cha.get(0).getAccountId());
		model.addAttribute("chaxiuaccount", cha1);
		List<Account> list2 = yxm.chaAccount(model);
		model.addAttribute("chaaccount", list2);
		return "xiugaixiaoshou";
	}

	/**
	 * @param acha @param YingXiaoServiceImpl @return
	 *             com.crm.controller.List<com.crm.controller.Account> @throws
	 */
	public List<Account> acha(Model model) {
		// TODO Auto-generated method stub
		return yxm.chaAccount(model);
	}

	/**
	 * @param gaixiao @param YingXiaoServiceImpl @return String @throws
	 */
	public String gaixiao(Model model, SellOpportunity sellOpportunity) {
		yxm.gaixiao(sellOpportunity);
		chaXiuXiao(model, sellOpportunity.getSellId());

		return "xiugaixiaoshou";
	}

	/**
	 * @param kekai @param YingXiaoServiceImpl @return void @throws
	 */
	public String kekai(Model model, Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		List<SellOpportunity> list = yxm.kekai();
		PageInfo<SellOpportunity> pageInfo1 = new PageInfo<SellOpportunity>(list);
		model.addAttribute("pageInfo1", pageInfo1);
		model.addAttribute("kekai", list);
		return "zhidingkaifa";

	}

	/**
	 * @param kechaChance @param YingXiaoServiceImpl @return String @throws
	 */
	public String kechaChance(Model model, String clientName, String summary, String contact, Integer accountId,
			Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		// 查询角色数据
		List<SellOpportunity> list = yxm.kechaChance(clientName, summary, contact, accountId);
		// 获得分页相关信息
		PageInfo<SellOpportunity> pageInfo1 = new PageInfo(list, 5);
		model.addAttribute("kekai", list);
		model.addAttribute("biaoshi", "biaoshi");
		model.addAttribute("pageInfo1", pageInfo1);
		return "zhidingkaifa";
	}

	/**
	 * @param zhiJi @param YingXiaoServiceImpl @return String @throws
	 */
	public String zhiJi(Model model, Integer sellId) {
		List<Account> list1 = yxm.chaAccount(model);
		model.addAttribute("chaj", list1);
		List<SellOpportunity> list = yxm.zhiJi(sellId);
		model.addAttribute("zhiji", list);
		List<Plan> list2 = yxm.chaJiHua(sellId);
		model.addAttribute("jihuaxiang", list2);
		return "zhidingjihua";
	}

	/**
	 * @param jiHuaXiang @param YingXiaoServiceImpl @return String @throws
	 */
	public String jiHuaXiang(Model model, String planDate, String planProject, Integer sellId) {
		yxm.jiHUaXiang(planDate, planProject, sellId);
		List<Plan> list = yxm.chaJiHua(sellId);
		model.addAttribute("jihuaxiang", list);
		return "zhidingjihua";
	}

	/**
	 * @param shanJiHua @param YingXiaoServiceImpl @return String @throws
	 */
	public String shanJiHua(Model model, Integer planId, Integer sellId) {

		yxm.shanJiHua(planId);
		List<Plan> list = yxm.chaJiHua(sellId);
		model.addAttribute("jihuaxiang", list);
		return "zhidingjihua";
	}

	/**
	 * @param jianZhiXing @param YingXiaoServiceImpl @return String @throws
	 */
	public String jianZhiXing(Model model, Integer planId, String palnImplementationEffect, Integer sellId) {
		yxm.jianZhiXing(planId, palnImplementationEffect);
		List<Plan> list = yxm.chaJiHua(sellId);
		model.addAttribute("jihuaxiang", list);
		return "zhixingjihua";
	}

	/**
	 * @param kaiSuccess @param YingXiaoServiceImpl @return String @throws
	 */
	public String kaiSuccess(Model model, Integer sellId) {
		//更改状态
		yxm.gaiStatus(sellId);
		//根据id查询出要添加到客户表的数据
		List<SellOpportunity> list = yxm.zhiJi(sellId);
		//通过指派人id查找到账号表的数据
		List<Account> list1 = yxm.chazhang(list.get(0).getDesignatedPerson());
		//把数据添加到客户表中
		try {
		yxm.zhuanKe(list.get(0), list1.get(0).getAccountId(), list1.get(0).getAccountName());}
		catch (Exception e) {
			return "zhixingjihua";
		}
		//根据id查找到客户表的数据
		List<Client> list2 = yxm.chake(sellId);
		//拿到客户表中客户id,根据客户id添加客户的联系人
        yxm.tianke(list.get(0).getContacts(),list.get(0).getContactsPhone(),list2.get(0).getClientId()); 
		
		model.addAttribute("zhiji", list);

		return "zhixingjihua";
	}

}
