/**
 * 
 */
package com.crm.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IClientMapper;
import com.crm.pojo.Client;
import com.crm.pojo.ClientLoss;
import com.crm.pojo.ClientOrder;
import com.crm.pojo.ClientRecord;
import com.crm.pojo.Contacts;
import com.crm.pojo.LossReason;
import com.crm.service.IClientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author admin
 * @createTime 2020年12月7日下午6:31:08
 * @updateTime 2020年12月7日下午6:31:08
 * @version 1.0.0
 */
@Service
public class ClientServiceImpl implements IClientService {
	@Resource
	private IClientMapper icm;

	/**
	 * @param keXin @param ClientServiceImpl @return String @throws
	 */
	public String keXin(Model model, Integer accountId, Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		// 查询角色数据
		List<Client> list = icm.keXin(accountId);
		PageInfo<Client> pageInfo = new PageInfo<Client>(list, 5);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("kexin", list);
		return "kehuxinxiguanli";
	}

	/**
	 * @param keXinCha
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String keXinCha(Model model, String clientName, String clientArea, String clientLegalPerson,
			Integer accountId, Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		// 查询角色数据
		List<Client> list = icm.keXinCha(clientName, clientArea, clientLegalPerson, accountId);
		PageInfo<Client> pageInfo = new PageInfo<Client>(list, 5);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("kexin", list);
		return "kehuxinxiguanli";}

	/**
	 * @param xiangXin
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String xiangXin(Model model, Integer clientId) {
		Client client=icm.xiangXin(clientId);
		model.addAttribute("xiangxin",client);
		return "kehuxinxi";
	}

	/**
	 * @param gaiKeXin
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String gaiKeXin(Model model, Client client) {
	  icm.gaiKeXin(client);
	  Client client1=icm.xiangXin(client.getClientId());
	  model.addAttribute("xiangxin",client1);
	  return "kehuxinxi";
		
	}

	/**
	 * @param lianXiRen
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String lianXiRen(Model model, Integer clientId) {
	 List<Contacts> list=icm.lianXiRen(clientId);
	 model.addAttribute("lianxiren",list);
	  return "lianxiren";
	}

	/**
	 * @param jianLXRen
	 * @param ClientServiceImpl 
	 * @return void
	 * @throws 
	 */
	public String jianLXRen(Model model, Integer clientId, Contacts contacts) {
		icm.jianLXRen(clientId,contacts);
		
		return "xinjianlianxiren";
	}

	/**
	 * @param shanLianXiRen
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String shanLianXiRen(Model model, Integer contactsId,Integer clientId) {
		icm.shanLianXiRen(contactsId);
		 List<Contacts> list=icm.lianXiRen(clientId);
		 model.addAttribute("lianxiren",list);
		  return "lianxiren";
		
	}

	/**
	 * @param xiuGai
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String xiuGai(Model model, Integer contactsId) {
	 
    Contacts c= icm.xiuGai(contactsId);
    model.addAttribute("xiugai",c);
		return "xiugailianxiren";
	}

	/**
	 * @param jiaowangJiLu
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String jiaowangJiLu(Model model, Integer clientId) {
		 List<ClientRecord> list=icm.jiaoangJiLu(clientId);
		  model.addAttribute("clientrecord",list);
		return "jiaowangjilu";
	}

	/**
	 * @param jianJiaoWangJL
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String jianJiaoWangJL(Model model, ClientRecord clientRecord) {
		icm.jianJiaoWangJL(clientRecord);
		return "xinjianjiaowangjilu";
	}

	/**
	 * @param shanJiaoWangJL
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String shanJiaoWangJL(Model model, Integer record_id, Integer clientId) {
          icm.shanJiaoWangJL(record_id);
          List<ClientRecord> list=icm.jiaoangJiLu(clientId);
		  model.addAttribute("clientrecord",list);
		return "jiaowangjilu";
	}

	/**
	 * @param xiuGaiJiaoWang
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String xiuGaiJiaoWang(Model model, Integer record_id) {
		 ClientRecord list=icm.xiuGaiJiaoWang(record_id);
		 model.addAttribute("xiugajl",list);
		return "xiugaijiaowangjilu";
	}

	/**
	 * @param xiuGaiJiaoWangJL
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String xiuGaiJiaoWangJL(Model model, ClientRecord clientRecord) {
		icm.xiuGaiJiaoWangJL(clientRecord);
		ClientRecord list=icm.xiuGaiJiaoWang(clientRecord.getRecord_id());
		 model.addAttribute("xiugajl",list);
		return "xiugaijiaowangjilu";
	}

	/**
	 * @param showLiShiDD
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String showLiShiDD(Model model, Integer clientId,Integer pageNum) {
		pageNum = pageNum == null ? 1 : pageNum;
		// 启用分页
		PageHelper.startPage(pageNum, 5);
		// 查询角色数据
	   List<ClientOrder> list=icm.showLiShiD(clientId);
	   PageInfo<ClientOrder> list1=new PageInfo<ClientOrder>(list,5);
		model.addAttribute("showdingdan",list);
		model.addAttribute("pageInfo1",list1);
		
		return "lishidingdan";
	}

	/**
	 * @param dingDanXiangXi
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String dingDanXiangXi(Model model, Integer order_id,Integer clientId) {
	    List<ClientOrder> list=icm.dingDanXiangXi(order_id,clientId);  
		model.addAttribute("xiangxi",list);
		Integer price=icm.chajia(order_id);
		model.addAttribute("price",price);
		return "dingdanxiangxi";
	}

	public String keHuLiuShi(Model model,Integer accountId) {
		
		List<ClientLoss> list=icm.keHuLiuShi(accountId);
		model.addAttribute("liushi",list);
		return "kehuliushi";
		
	}

	/**
	 * @param zanHuanLiuShi
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String zanHuanLiuShi(Model model, Integer loss_id, Integer client_id) {
		ClientLoss list= icm.zanHuanLiuShi(loss_id);
		model.addAttribute("zanhuan",list);
		List<LossReason> list1=icm.yuanYin(loss_id);
		model.addAttribute("yuanyin",list1);
		return "zanhuanliushi";
	}

	/**
	 * @param zanHuanBao
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String zanHuanBao(Model model, Integer loss_id,String reason) {
		ClientLoss list= icm.zanHuanLiuShi(loss_id);
		model.addAttribute("zanhuan",list);
		icm.zanHuanBao(loss_id,reason);
		List<LossReason> list1=icm.yuanYin(loss_id);
		model.addAttribute("yuanyin",list1);
		return "zanhuanliushi";
	}

	/**
	 * @param queRenLiuShi
	 * @param ClientServiceImpl 
	 * @return String
	 * @throws 
	 */
	public String queRenLiuShi(Model model, Integer client_id,Integer accountId) {
		Date date=new Date();
		     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		     String format = simpleDateFormat.format(date);
		icm.shanLoss(client_id,format);
		icm.shanclient(client_id);
		List<ClientLoss> list=icm.keHuLiuShi(accountId);
		model.addAttribute("liushi",list);
		return "kehuliushi";
		
	}
}
