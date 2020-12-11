package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.ui.Model;

import com.crm.pojo.CrmInventory;

/**
 * desc：查询库存数据访问接口
 * @author wuxianfeng
 * @createTeime2020年12月6日 下午11:31:08
 * @updateTime 2020年12月6日 下午11:31:08
 * @version 1.0.0
 */
public interface IInventoryMapper {
	@Results(id="accountResults", value = {
			@Result(property = "inventoryId", column = "inventory_id", id = true), 
			@Result(property = "inventoryProduct", column = "inventory_product"), 
			@Result(property = "inventoryWarehouse", column = "inventory_warehouse"), 
			@Result(property = "inventoryAllocation", column = "inventory_allocation"), 
			@Result(property = "inventorynNumber", column = "inventory_number"),
			@Result(property = "inventoryRemark", column = "inventory_remark")})
		//查询库存
		@Select("select * from crm_inventory")
		List<CrmInventory> inventory();
		CrmInventory getsiccountByLogin(Model model);
		
		@ResultMap("accountResults")
		// 根据条件查询
		@Select("<script>" 
				+ "select * from crm_inventory" 
				+ "<where>" 
				+ "<choose>"
				+ "<when test=\"inventoryProduct!='' and inventoryWarehouse!=''\">"
				+ "and inventory_product=#{inventoryProduct} and inventory_warehouse=#{inventoryWarehouse}" 
				+ "</when>"
				+ "<when test=\"inventoryProduct!=''\">" 
				+ "and inventory_product=#{inventoryProduct}" 
				+ "</when>"
				+ "<when test=\"inventoryWarehouse!='' \">" 
				+ "and inventory_warehouse=#{inventoryWarehouse}" 
				+ "</when>"
				+ "</choose>"
				+ "</where>" 
				+ "</script>")
				public List<CrmInventory> inventor(@Param("inventoryProduct") String inventoryProduct,@Param("inventoryWarehouse") String inventoryWarehouse);
}
