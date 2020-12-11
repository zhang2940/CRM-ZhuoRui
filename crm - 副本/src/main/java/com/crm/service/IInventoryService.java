package com.crm.service;

import org.springframework.ui.Model;

/**
 * 查询库存业务接口
 * @author wuxianfeng
 * @createTeime2020年12月6日 下午11:32:15
 * @updateTime 2020年12月6日 下午11:32:15
 * @version 1.0.0
 */
public interface IInventoryService {

	/**
	 * 查询全部库存
	 * @param model
	 * @return
	 */
	String inventory(Model model,Integer pageNum);

	/**
	 * desc:根据产品，仓库查询
	 * @param model
	 * @param inventoryProduct
	 * @param inventoryWarehouse
	 * @return
	 */
	String inventor(Model model, String inventoryProduct, String inventoryWarehouse,Integer pageNum);

}
