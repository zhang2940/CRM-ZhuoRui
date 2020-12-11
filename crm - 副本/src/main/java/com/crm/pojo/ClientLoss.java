/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月9日下午10:21:09
 * @updateTime 2020年12月9日下午10:21:09 
 * @version 1.0.0
 */
public class ClientLoss {
	private Integer loss_id;
	private Integer client_id;
	private String loss_client_name;
	private String loss_client_area;
	private String loss_client_address;
	private String loss_affirm_date;
	private String loss_status;
	private Integer account_id;
	public ClientLoss(Integer loss_id, Integer client_id, String loss_client_name, String loss_client_area,
			String loss_client_address, String loss_affirm_date, String loss_status, Integer account_id) {
		super();
		this.loss_id = loss_id;
		this.client_id = client_id;
		this.loss_client_name = loss_client_name;
		this.loss_client_area = loss_client_area;
		this.loss_client_address = loss_client_address;
		this.loss_affirm_date = loss_affirm_date;
		this.loss_status = loss_status;
		this.account_id = account_id;
	}
	public Integer getLoss_id() {
		return loss_id;
	}
	public void setLoss_id(Integer loss_id) {
		this.loss_id = loss_id;
	}
	public Integer getClient_id() {
		return client_id;
	}
	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}
	public String getLoss_client_name() {
		return loss_client_name;
	}
	public void setLoss_client_name(String loss_client_name) {
		this.loss_client_name = loss_client_name;
	}
	public String getLoss_client_area() {
		return loss_client_area;
	}
	public void setLoss_client_area(String loss_client_area) {
		this.loss_client_area = loss_client_area;
	}
	public String getLoss_client_address() {
		return loss_client_address;
	}
	public void setLoss_client_address(String loss_client_address) {
		this.loss_client_address = loss_client_address;
	}
	public String getLoss_affirm_date() {
		return loss_affirm_date;
	}
	public void setLoss_affirm_date(String loss_affirm_date) {
		this.loss_affirm_date = loss_affirm_date;
	}
	public String getLoss_status() {
		return loss_status;
	}
	public void setLoss_status(String loss_status) {
		this.loss_status = loss_status;
	}
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account_id == null) ? 0 : account_id.hashCode());
		result = prime * result + ((client_id == null) ? 0 : client_id.hashCode());
		result = prime * result + ((loss_affirm_date == null) ? 0 : loss_affirm_date.hashCode());
		result = prime * result + ((loss_client_address == null) ? 0 : loss_client_address.hashCode());
		result = prime * result + ((loss_client_area == null) ? 0 : loss_client_area.hashCode());
		result = prime * result + ((loss_client_name == null) ? 0 : loss_client_name.hashCode());
		result = prime * result + ((loss_id == null) ? 0 : loss_id.hashCode());
		result = prime * result + ((loss_status == null) ? 0 : loss_status.hashCode());
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
		ClientLoss other = (ClientLoss) obj;
		if (account_id == null) {
			if (other.account_id != null)
				return false;
		} else if (!account_id.equals(other.account_id))
			return false;
		if (client_id == null) {
			if (other.client_id != null)
				return false;
		} else if (!client_id.equals(other.client_id))
			return false;
		if (loss_affirm_date == null) {
			if (other.loss_affirm_date != null)
				return false;
		} else if (!loss_affirm_date.equals(other.loss_affirm_date))
			return false;
		if (loss_client_address == null) {
			if (other.loss_client_address != null)
				return false;
		} else if (!loss_client_address.equals(other.loss_client_address))
			return false;
		if (loss_client_area == null) {
			if (other.loss_client_area != null)
				return false;
		} else if (!loss_client_area.equals(other.loss_client_area))
			return false;
		if (loss_client_name == null) {
			if (other.loss_client_name != null)
				return false;
		} else if (!loss_client_name.equals(other.loss_client_name))
			return false;
		if (loss_id == null) {
			if (other.loss_id != null)
				return false;
		} else if (!loss_id.equals(other.loss_id))
			return false;
		if (loss_status == null) {
			if (other.loss_status != null)
				return false;
		} else if (!loss_status.equals(other.loss_status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClientLoss [loss_id=" + loss_id + ", client_id=" + client_id + ", loss_client_name=" + loss_client_name
				+ ", loss_client_area=" + loss_client_area + ", loss_client_address=" + loss_client_address
				+ ", loss_affirm_date=" + loss_affirm_date + ", loss_status=" + loss_status + ", account_id="
				+ account_id + "]";
	}
	

}
