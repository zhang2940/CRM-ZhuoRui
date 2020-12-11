/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月9日上午9:00:38
 * @updateTime 2020年12月9日上午9:00:38 
 * @version 1.0.0
 */
public class ClientRecord {
private Integer record_id;
private Integer client_id;
private  String record_date;
private String record_place;
private String record_summary;
private String record_detailed_information;
private String record_remark;
public ClientRecord(Integer record_id, Integer client_id, String record_date, String record_place,
		String record_summary, String record_detailed_information, String record_remark) {
	super();
	this.record_id = record_id;
	this.client_id = client_id;
	this.record_date = record_date;
	this.record_place = record_place;
	this.record_summary = record_summary;
	this.record_detailed_information = record_detailed_information;
	this.record_remark = record_remark;
}
public Integer getRecord_id() {
	return record_id;
}
public void setRecord_id(Integer record_id) {
	this.record_id = record_id;
}
public Integer getClient_id() {
	return client_id;
}
public void setClient_id(Integer client_id) {
	this.client_id = client_id;
}
public String getRecord_date() {
	return record_date;
}
public void setRecord_date(String record_date) {
	this.record_date = record_date;
}
public String getRecord_place() {
	return record_place;
}
public void setRecord_place(String record_place) {
	this.record_place = record_place;
}
public String getRecord_summary() {
	return record_summary;
}
public void setRecord_summary(String record_summary) {
	this.record_summary = record_summary;
}
public String getRecord_detailed_information() {
	return record_detailed_information;
}
public void setRecord_detailed_information(String record_detailed_information) {
	this.record_detailed_information = record_detailed_information;
}
public String getRecord_remark() {
	return record_remark;
}
public void setRecord_remark(String record_remark) {
	this.record_remark = record_remark;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((client_id == null) ? 0 : client_id.hashCode());
	result = prime * result + ((record_date == null) ? 0 : record_date.hashCode());
	result = prime * result + ((record_detailed_information == null) ? 0 : record_detailed_information.hashCode());
	result = prime * result + ((record_id == null) ? 0 : record_id.hashCode());
	result = prime * result + ((record_place == null) ? 0 : record_place.hashCode());
	result = prime * result + ((record_remark == null) ? 0 : record_remark.hashCode());
	result = prime * result + ((record_summary == null) ? 0 : record_summary.hashCode());
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
	ClientRecord other = (ClientRecord) obj;
	if (client_id == null) {
		if (other.client_id != null)
			return false;
	} else if (!client_id.equals(other.client_id))
		return false;
	if (record_date == null) {
		if (other.record_date != null)
			return false;
	} else if (!record_date.equals(other.record_date))
		return false;
	if (record_detailed_information == null) {
		if (other.record_detailed_information != null)
			return false;
	} else if (!record_detailed_information.equals(other.record_detailed_information))
		return false;
	if (record_id == null) {
		if (other.record_id != null)
			return false;
	} else if (!record_id.equals(other.record_id))
		return false;
	if (record_place == null) {
		if (other.record_place != null)
			return false;
	} else if (!record_place.equals(other.record_place))
		return false;
	if (record_remark == null) {
		if (other.record_remark != null)
			return false;
	} else if (!record_remark.equals(other.record_remark))
		return false;
	if (record_summary == null) {
		if (other.record_summary != null)
			return false;
	} else if (!record_summary.equals(other.record_summary))
		return false;
	return true;
}
@Override
public String toString() {
	return "ClientRecord [record_id=" + record_id + ", client_id=" + client_id + ", record_date=" + record_date
			+ ", record_place=" + record_place + ", record_summary=" + record_summary + ", record_detailed_information="
			+ record_detailed_information + ", record_remark=" + record_remark + "]";
}

}
