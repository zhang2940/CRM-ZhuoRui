/**
 * 
 */
package com.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.Impl.ClientServiceImpl;
import com.crm.pojo.Client;
import com.crm.pojo.ClientRecord;
import com.crm.pojo.Contacts;

/**
 * @author admin
 * @createTime 2020年12月7日下午6:19:24
 * @updateTime 2020年12月7日下午6:19:24
 * @version 1.0.0
 */

@Controller
@SessionAttributes({ "pageInfo", "kexin", "xiangxin", "lianxiren", "xiugai", "clientrecord", "xiugajl","showdingdan","pageInfo1","xiangxi","price","liushi","zanhuan","yuanyin" })
public class ClientController {
	@Resource
	private ClientServiceImpl cs;

	@RequestMapping("/kexinguan.do")
	// 展示相应客户经理对接的所有客户
	public String keXin(Model model, Integer accountId, Integer pageNum) {
		System.out.println("-----------" + accountId);
		return cs.keXin(model, accountId, pageNum);

	}

	// 根据条件查找客户经理对应的客户信息
	@RequestMapping("/kexincha.do")
	public String keXinCha(Model model, String clientName, String clientArea, String clientLegalPerson,
			Integer accountId, Integer pageNum) {
		model.addAttribute("clientName", clientName);
		model.addAttribute("clientArea", clientArea);
		model.addAttribute("contact", clientLegalPerson);
		return cs.keXinCha(model, clientName, clientArea, clientLegalPerson, accountId, pageNum);
	}

//根据id展示出详细信息
	@RequestMapping("/xiangxin.do")
	public String xiangXin(Model model, Integer clientId) {

		return cs.xiangXin(model, clientId);
	}

	// 修改客户信息
	@RequestMapping("/gaikexin.do")
	public String gaiKeXin(Model model, Client client) {
		return cs.gaiKeXin(model, client);

	}

	// 展示客户对应的联系人
	@RequestMapping("lianxiren.do")
	public String lianXiRen(Model model, Integer clientId) {

		return cs.lianXiRen(model, clientId);
	}

	// 新建联系人
	@RequestMapping("jianlianxiren.do")
	public String jianLXRen(Model model, Integer clientId, Contacts contacts) {

		return cs.jianLXRen(model, clientId, contacts);

	}

	// 删除联系人
	@RequestMapping("/shanlianxiren.do")
	public String shanLianXiRen(Model model, Integer contactsId, Integer clientId) {

		return cs.shanLianXiRen(model, contactsId, clientId);
	}

	@RequestMapping("/xiugai.do")
	public String xiuGai(Model model, Integer contactsId) {
		return cs.xiuGai(model, contactsId);

	}

	// 展示客户对应的交往记录
	@RequestMapping("/jiaowangjl.do")
	public String jiaoWangJiLu(Model model, Integer clientId) {
		return cs.jiaowangJiLu(model, clientId);

	}

	// 新建交往记录
	@RequestMapping("jianjiaowangjl.do")
	public String jianJiaoWangJL(Model model, ClientRecord clientRecord) {
		return cs.jianJiaoWangJL(model, clientRecord);
	}

	// 删除交往记录
	@RequestMapping("/shanjiaowangjl.do")
	public String shanJiaoWangJL(Model model, Integer record_id, Integer clientId) {
		return cs.shanJiaoWangJL(model, record_id, clientId);
	}

	// 修改交往记录
	@RequestMapping("xiugaijiaowang.do")
	public String xiuGaiJiaoWang(Model model, Integer record_id) {

		return cs.xiuGaiJiaoWang(model, record_id);
	}

	@RequestMapping("/xiugaijiaowangjl.do")
	public String xiuGaiJiaoWangJL(Model model, ClientRecord clientRecord) {
		return cs.xiuGaiJiaoWangJL(model, clientRecord);
	}

	// 查找客户订单和详细订单
	@RequestMapping("showlishidd.do")
	public String showLiShiDD(Model model, Integer clientId,Integer pageNum) {
		return cs.showLiShiDD(model, clientId,pageNum);
	}
	//查找指定的订单详细
	@RequestMapping("dingdanxiangxi.do")
	public String dingDanXiangXi(Model model,Integer order_id,Integer clientId) {
		
		return cs.dingDanXiangXi(model,order_id,clientId);
		}
	//客户流失管理
	@RequestMapping("/kehuliushi.do")
	public String keHuLiuShi(Model model,Integer accountId) {
		
		return cs.keHuLiuShi(model,accountId);
	}
	//暂缓客户流失
@RequestMapping("/zanhuanliushi.do")
public String zanHuanLiuShi(Model model,Integer loss_id,Integer client_id){
	return cs.zanHuanLiuShi(model,loss_id,client_id);
}
//保存原因
@RequestMapping("/zanhuanbao.do")
public String zanHuanBao(Model model,Integer loss_id,String reason)
{
	return cs.zanHuanBao(model,loss_id,reason);
}
//确认客户流失删除用户
@RequestMapping("/querenliusi.do")
public String queRenLiuShi(Model model,Integer client_id,Integer accountId) {
	
	return cs.queRenLiuShi(model,client_id,accountId);
	
}



}
