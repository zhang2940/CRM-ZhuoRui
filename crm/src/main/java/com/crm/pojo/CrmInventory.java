package com.crm.pojo;
/**
 * desc：查询库存持久类
 * @author wuxianfeng
 * @createTeime2020年12月6日 下午11:23:46
 * @updateTime 2020年12月6日 下午11:23:46
 * @version 1.0.0
 */
public class CrmInventory {
	private Integer inventoryId;//序号
	private String inventoryProduct;//产品
	private String inventoryWarehouse;//仓库
	private String inventoryAllocation;//货位
	private Integer inventorynNumber;//件数
	private String inventoryRemark;//备注
	public Integer getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInventoryProduct() {
		return inventoryProduct;
	}
	public void setInventoryProduct(String inventoryProduct) {
		this.inventoryProduct = inventoryProduct;
	}
	public String getInventoryWarehouse() {
		return inventoryWarehouse;
	}
	public void setInventoryWarehouse(String inventoryWarehouse) {
		this.inventoryWarehouse = inventoryWarehouse;
	}
	public String getInventoryAllocation() {
		return inventoryAllocation;
	}
	public void setInventoryAllocation(String inventoryAllocation) {
		this.inventoryAllocation = inventoryAllocation;
	}
	public Integer getInventorynNumber() {
		return inventorynNumber;
	}
	public void setInventorynNumber(Integer inventorynNumber) {
		this.inventorynNumber = inventorynNumber;
	}
	public String getInventoryRemark() {
		return inventoryRemark;
	}
	public void setInventoryRemark(String inventoryRemark) {
		this.inventoryRemark = inventoryRemark;
	}
	@Override
	public String toString() {
		return "CrmInventory [inventoryId=" + inventoryId + ", inventoryProduct=" + inventoryProduct
				+ ", inventoryWarehouse=" + inventoryWarehouse + ", inventoryAllocation=" + inventoryAllocation
				+ ", inventorynNumber=" + inventorynNumber + ", inventoryRemark=" + inventoryRemark + "]";
	}
	
	
}
