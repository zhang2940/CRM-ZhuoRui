/**
 * 
 */
package com.crm.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.pojo.SellOpportunity;

/**
 * @author admin
 * @createTime 2020年12月2日上午9:03:42
 * @updateTime 2020年12月2日上午9:03:42
 * @version 1.0.0
 */
public interface IYingXiaoService {

	public String showChance(Model model, Integer accountId, Integer pageNum);

	public String chaChance(Model model, String clientName, String summary, String contact, Integer accountId,
			Integer pageNum);

	public void xiaoshan(Integer sellId);

	public String chaAccount(Model model);

	public String jianXiao(Model model, SellOpportunity sellOpportunity);

	public String chaXiuXiao(Model model, Integer sellId);

	public String gaixiao(Model model, SellOpportunity sellOpportunity);

	public String kekai(Model model, Integer pageNum);

	public String kechaChance(Model model, String clientName, String summary, String contact, Integer accountId,
			Integer pageNum);

	public String zhiJi(Model model, Integer sellId);

	public String jiHuaXiang(Model model, String planDate, String planProject, Integer sellId);

	public String shanJiHua(Model model, Integer planId, Integer sellId);

	public String jianZhiXing(Model model, Integer planId, String palnImplementationEffect, Integer sellId);

	public String kaiSuccess(Model model, Integer sellId);
}
