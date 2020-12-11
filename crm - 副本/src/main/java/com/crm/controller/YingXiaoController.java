/**
 * 
 */
package com.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.Impl.YingXiaoServiceImpl;
import com.crm.pojo.Account;
import com.crm.pojo.SellOpportunity;

/**
 * @author admin
 * @createTime 2020年12月1日下午7:47:10
 * @updateTime 2020年12月1日下午7:47:10
 * @version 1.0.0
 */
@Controller
@SessionAttributes({ "showlist", "chaxiu", "chaxiuaccount", "pageInfo", "accountlist", "clientName", "summary",
		"contact", "chaaccount", "kekai", "pageInfo1", "zhiji", "chaj", "jihuaxiang" })
public class YingXiaoController {
	@Resource
	YingXiaoServiceImpl yx;

	// 展示出销售机会列表
	@RequestMapping("/show.do")
	public String showChance(Model model, Integer accountId, Integer pageNum) {
		return yx.showChance(model, accountId, pageNum);
	}

//根据条件对销售机会列表进行查找	
	@RequestMapping("/xiaocha.do")
	public String chaChance(Model model, String clientName, String summary, String contact, Integer accountId,
			Integer pageNum) {
		model.addAttribute("clientName", clientName);
		model.addAttribute("summary", summary);
		model.addAttribute("contact", contact);
		return yx.chaChance(model, clientName, summary, contact, accountId, pageNum);
	}

//删除销售机会记录
	@RequestMapping("/xiaoshan.do")
	public String xiaoShan(Model model, Integer sellId, Integer accountId, Integer pageNum, String biaoshi,
			String clientName, String summary, String contact) {
		yx.xiaoshan(sellId);
		System.out.println("当前页数------------------------------" + pageNum);
		if (biaoshi.equals("biaoshi")) {
			return yx.chaChance(model, clientName, summary, contact, accountId, pageNum);
		} else {
			return showChance(model, accountId, pageNum);
		}
	}

//查询客户经理
	@RequestMapping("/chaaccount.do")
	public String chaAccount(Model model) {
		return yx.chaAccount(model);

	}

//新建销售机会
	@RequestMapping("/jianxiao.do")
	public String jianXiao(Model model, SellOpportunity sellOpportunity) {
		Integer sellId = sellOpportunity.getSellId() == null ? null : sellOpportunity.getSellId();
		Integer accountId = sellOpportunity.getAccountId() == null ? null : sellOpportunity.getAccountId();
		String opportunitySource = sellOpportunity.getOpportunitySource() == null ? null
				: sellOpportunity.getOpportunitySource();
		String customerName = sellOpportunity.getCustomerName() == null ? null : sellOpportunity.getCustomerName();
		Integer successProbability = sellOpportunity.getSuccessProbability() == null ? null
				: sellOpportunity.getSuccessProbability();
		String summary = sellOpportunity.getSummary() == null ? null : sellOpportunity.getSummary();
		String contacts = sellOpportunity.getContacts() == null ? null : sellOpportunity.getContacts();
		String contactsPhone = sellOpportunity.getContactsPhone() == null ? null : sellOpportunity.getContactsPhone();
		String opportunityDescrible = sellOpportunity.getOpportunityDescrible() == null ? null
				: sellOpportunity.getOpportunityDescrible();
		String creator = sellOpportunity.getCreator() == null ? null : sellOpportunity.getCreator();
		String creationTime = sellOpportunity.getCreationTime() == null ? null : sellOpportunity.getCreationTime();
		Integer designatedPerson = sellOpportunity.getDesignatedPerson() == null ? null
				: sellOpportunity.getDesignatedPerson();
		String designatedTime = sellOpportunity.getDesignatedTime() == null ? null
				: sellOpportunity.getDesignatedTime();
		String distribution = sellOpportunity.getDesignatedPerson() == null ? "未指派" : "已指派";
		SellOpportunity sellOpportunity1 = new SellOpportunity(sellId, accountId, opportunitySource, customerName,
				successProbability, summary, contacts, contactsPhone, opportunityDescrible, creator, creationTime,
				designatedPerson, designatedTime, distribution);
		return yx.jianXiao(model, sellOpportunity1);

	}
//根据id查找要修改的销售记录

	@RequestMapping("/chaxiuxiao.do")

	public String chaXiuXiao(Model model, @RequestParam("sellId") Integer sellId) {
		return yx.chaXiuXiao(model, sellId);

	}

//ajax来拿客户经理数据
	@RequestMapping("/acha.do")
	@ResponseBody
	public List<Account> acha(Model model) {
		List<Account> list = yx.acha(model);
		return list;

	}

//修改销售机会
	@RequestMapping("gaixiao.do")
	public String gaixiao(Model model, SellOpportunity sellOpportunity) {
		return yx.gaixiao(model, sellOpportunity);

	}

//客户开发计划展示所有的销售计划项
	@RequestMapping("/kekai.do")
	public String keKai(Model model, Integer pageNum) {
		return yx.kekai(model, pageNum);

	}

//根据条件对销售机会列表进行查找客户开发计划中
	@RequestMapping("/kexiaocha.do")
	public String kechaChance(Model model, String clientName, String summary, String contact, Integer accountId,
			Integer pageNum) {
		System.out.println("---------" + clientName);
		model.addAttribute("clientName", clientName);
		model.addAttribute("summary", summary);
		model.addAttribute("contact", contact);
		return yx.kechaChance(model, clientName, summary, contact, accountId, pageNum);
	}

	// 根据id查找客户开发的具体销售记录
	@RequestMapping("/zhiji.do")
	public String zhiJi(Model model, Integer sellId) {

		return yx.zhiJi(model, sellId);

	}

	// 根据id添加制定客户计划项
	@RequestMapping("/jihuaxiang.do")
	public String jiHuaXiang(Model model, String planDate, String planProject, Integer sellId) {

		return yx.jiHuaXiang(model, planDate, planProject, sellId);

	}

	// 根据id删除计划
	@RequestMapping("/shanjihua.do")
	public String shanJiHua(Model model, Integer planId, Integer sellId) {

		return yx.shanJiHua(model, planId, sellId);

	}

	// 保存执行效果
	@RequestMapping("/jianzhixing.do")
	public String jianZhiXing(Model model, Integer planId, String palnImplementationEffect, Integer sellId) {

		return yx.jianZhiXing(model, planId, palnImplementationEffect, sellId);
	}

	// 更改状态，状态为开发成功
	@RequestMapping("/kaisuccess.do")
	public String kaiSuccess(Model model, Integer sellId) {
		return yx.kaiSuccess(model, sellId);

	}
}
