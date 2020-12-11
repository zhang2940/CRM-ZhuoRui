/**
 * 
 */
package com.crm.pojo;

import java.util.List;

/**
 * @author admin
 * @createTime 2020年12月9日下午2:26:37
 * @updateTime 2020年12月9日下午2:26:37 
 * @version 1.0.0
 */
public class ClientOrder {
	private Integer order_id;
	private Integer client_id;
	private String order_date;
	private String order_address;
	private String order_status;
	private List<GoodsInfo> list;
	
	public ClientOrder() {
		super();
	}
	public ClientOrder(Integer order_id, Integer client_id, String order_date, String order_address,
			String order_status, List<GoodsInfo> list) {
		super();
		this.order_id = order_id;
		this.client_id = client_id;
		this.order_date = order_date;
		this.order_address = order_address;
		this.order_status = order_status;
		this.list = list;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getClient_id() {
		return client_id;
	}
	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getOrder_address() {
		return order_address;
	}
	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public List<GoodsInfo> getList() {
		return list;
	}
	public void setList(List<GoodsInfo> list) {
		this.list = list;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client_id == null) ? 0 : client_id.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((order_address == null) ? 0 : order_address.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_status == null) ? 0 : order_status.hashCode());
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
		ClientOrder other = (ClientOrder) obj;
		if (client_id == null) {
			if (other.client_id != null)
				return false;
		} else if (!client_id.equals(other.client_id))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (order_address == null) {
			if (other.order_address != null)
				return false;
		} else if (!order_address.equals(other.order_address))
			return false;
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (order_status == null) {
			if (other.order_status != null)
				return false;
		} else if (!order_status.equals(other.order_status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClientOrder [order_id=" + order_id + ", client_id=" + client_id + ", order_date=" + order_date
				+ ", order_address=" + order_address + ", order_status=" + order_status + ", list=" + list + "]";
	}
	

}
