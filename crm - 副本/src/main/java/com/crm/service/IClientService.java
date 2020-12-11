/**
 * 
 */
package com.crm.service;

import org.springframework.ui.Model;

import com.crm.pojo.Client;
import com.crm.pojo.ClientRecord;
import com.crm.pojo.Contacts;

/**
 * @author admin
 * @createTime 2020年12月7日下午6:30:48
 * @updateTime 2020年12月7日下午6:30:48 
 * @version 1.0.0
 */
public interface IClientService {
	public String keXin(Model model, Integer accountId, Integer pageNum);
	public String keXinCha(Model model, String clientName, String clientLegalArea, String clientLegalPerson,
			Integer accountId, Integer pageNum);
	public String xiangXin(Model model, Integer clientId);
	public String gaiKeXin(Model model, Client client);
	public String lianXiRen(Model model, Integer clientId);	
	public String jianLXRen(Model model, Integer clientId, Contacts contacts);
	public String shanLianXiRen(Model model, Integer contactsId,Integer clientId);
	public String xiuGai(Model model, Integer contactsId);
	public String jiaowangJiLu(Model model, Integer clientId);
	public String jianJiaoWangJL(Model model, ClientRecord clientRecord);
	public String shanJiaoWangJL(Model model, Integer record_id, Integer clientId);
	public String xiuGaiJiaoWang(Model model, Integer record_id);
	public String xiuGaiJiaoWangJL(Model model, ClientRecord clientRecord);
	public String showLiShiDD(Model model, Integer clientId,Integer pageNum);
	public String dingDanXiangXi(Model model, Integer order_id,Integer clientId);
	public String keHuLiuShi(Model model,Integer accountId);
	public String zanHuanLiuShi(Model model, Integer loss_id, Integer client_id);
	public String zanHuanBao(Model model, Integer loss_id,String reason);
	public String queRenLiuShi(Model model, Integer client_id,Integer accountId);
}
