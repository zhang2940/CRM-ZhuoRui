/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月10日上午9:22:54
 * @updateTime 2020年12月10日上午9:22:54 
 * @version 1.0.0
 */
public class LossReason {
private Integer loss_id;
private String reason;
public LossReason(Integer loss_id, String reason) {
	super();
	this.loss_id = loss_id;
	this.reason = reason;
}
public Integer getLoss_id() {
	return loss_id;
}
public void setLoss_id(Integer loss_id) {
	this.loss_id = loss_id;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((loss_id == null) ? 0 : loss_id.hashCode());
	result = prime * result + ((reason == null) ? 0 : reason.hashCode());
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
	LossReason other = (LossReason) obj;
	if (loss_id == null) {
		if (other.loss_id != null)
			return false;
	} else if (!loss_id.equals(other.loss_id))
		return false;
	if (reason == null) {
		if (other.reason != null)
			return false;
	} else if (!reason.equals(other.reason))
		return false;
	return true;
}
@Override
public String toString() {
	return "LossReason [loss_id=" + loss_id + ", reason=" + reason + "]";
}

}
