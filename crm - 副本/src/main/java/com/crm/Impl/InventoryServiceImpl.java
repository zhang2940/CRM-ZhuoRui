package com.crm.Impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IInventoryMapper;
import com.crm.pojo.CrmInventory;
import com.crm.service.IInventoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * desc:查询库存业务实现类
 * @author wuxianfeng
 * @createTeime2020年12月6日 下午11:27:08
 * @updateTime 2020年12月6日 下午11:27:08
 * @version 1.0.0
 */
@Service
public class InventoryServiceImpl implements IInventoryService{

	//注入数据访问接口对象
	@Resource
	private IInventoryMapper iinventoryMapper;
	
	@Override
	public String inventory(Model model,Integer pageNum) {
		//判断是否获得页码
		pageNum = pageNum==null ? 1 : pageNum;
		//启动 页码
		PageHelper.startPage(pageNum, 4);
		List<CrmInventory> list=iinventoryMapper.inventory();
		//获得分页
		PageInfo<CrmInventory> pageInfo = new PageInfo<CrmInventory>(list,10);
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		return "inventory";
	}
	@Override
	public String inventor(Model model,String inventoryProduct,String inventoryWarehouse,Integer pageNum) {
		//判断是否获得页码
		pageNum = pageNum==null ? 1 : pageNum;
		//启动 页码
		PageHelper.startPage(pageNum, 4);
		List<CrmInventory> list=iinventoryMapper.inventor(inventoryProduct, inventoryWarehouse);
		//获得分页
		PageInfo<CrmInventory> pageInfo = new PageInfo<CrmInventory>(list,10);
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		return "inventory";
	}
}
