/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月9日下午2:27:00
 * @updateTime 2020年12月9日下午2:27:00 
 * @version 1.0.0
 */
public class GoodsInfo {
	private Integer goods_id;
	private Integer order_id;
	private Integer goods_number;
	private String goods_units;
	private Double goods_unit_price; 
	private Double goods_totle_price;
	private String goods_name;
	
	public GoodsInfo() {
		super();
	}
	@Override
	public String toString() {
		return "GoodsInfo [goods_id=" + goods_id + ", order_id=" + order_id + ", goods_number=" + goods_number
				+ ", goods_units=" + goods_units + ", goods_unit_price=" + goods_unit_price + ", goods_totle_price="
				+ goods_totle_price + ", goods_name=" + goods_name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods_id == null) ? 0 : goods_id.hashCode());
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + ((goods_number == null) ? 0 : goods_number.hashCode());
		result = prime * result + ((goods_totle_price == null) ? 0 : goods_totle_price.hashCode());
		result = prime * result + ((goods_unit_price == null) ? 0 : goods_unit_price.hashCode());
		result = prime * result + ((goods_units == null) ? 0 : goods_units.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodsInfo other = (GoodsInfo) obj;
		if (goods_id == null) {
			if (other.goods_id != null)
				return false;
		} else if (!goods_id.equals(other.goods_id))
			return false;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
			return false;
		if (goods_number == null) {
			if (other.goods_number != null)
				return false;
		} else if (!goods_number.equals(other.goods_number))
			return false;
		if (goods_totle_price == null) {
			if (other.goods_totle_price != null)
				return false;
		} else if (!goods_totle_price.equals(other.goods_totle_price))
			return false;
		if (goods_unit_price == null) {
			if (other.goods_unit_price != null)
				return false;
		} else if (!goods_unit_price.equals(other.goods_unit_price))
			return false;
		if (goods_units == null) {
			if (other.goods_units != null)
				return false;
		} else if (!goods_units.equals(other.goods_units))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		return true;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getGoods_number() {
		return goods_number;
	}
	public void setGoods_number(Integer goods_number) {
		this.goods_number = goods_number;
	}
	public String getGoods_units() {
		return goods_units;
	}
	public void setGoods_units(String goods_units) {
		this.goods_units = goods_units;
	}
	public Double getGoods_unit_price() {
		return goods_unit_price;
	}
	public void setGoods_unit_price(Double goods_unit_price) {
		this.goods_unit_price = goods_unit_price;
	}
	public Double getGoods_totle_price() {
		return goods_totle_price;
	}
	public void setGoods_totle_price(Double goods_totle_price) {
		this.goods_totle_price = goods_totle_price;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public GoodsInfo(Integer goods_id, Integer order_id, Integer goods_number, String goods_units,
			Double goods_unit_price, Double goods_totle_price, String goods_name) {
		super();
		this.goods_id = goods_id;
		this.order_id = order_id;
		this.goods_number = goods_number;
		this.goods_units = goods_units;
		this.goods_unit_price = goods_unit_price;
		this.goods_totle_price = goods_totle_price;
		this.goods_name = goods_name;
	}

}
