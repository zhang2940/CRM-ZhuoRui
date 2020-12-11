package com.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.service.IInventoryService;

/**
 * desc：查询库存
 * @author wuxianfeng
 * @createTeime2020年12月6日 下午11:29:46
 * @updateTime 2020年12月6日 下午11:29:46
 * @version 1.0.0
 */
@Controller
@SessionAttributes("list")
public class InventoryController {
	//注入业务层Bean接口
	@Resource
	private IInventoryService iinventoryService;
	
	@RequestMapping("/inventory.do")
	public String inventory(Model model,Integer pageNum) {
		try {
			String nextPath=iinventoryService.inventory(model,pageNum);
			return nextPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	@RequestMapping("/inventor.do")
	public String inventor(Model model,String inventoryProduct,String inventoryWarehouse,Integer pageNum) {
		try {
			String nextPath=iinventoryService.inventor(model,inventoryProduct,inventoryWarehouse,pageNum);
			return nextPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
}
