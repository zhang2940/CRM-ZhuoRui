/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月4日上午10:36:45
 * @updateTime 2020年12月4日上午10:36:45 
 * @version 1.0.0
 */
public class Account {
private Integer accountId;
private Integer roleId;
private  String accountName;
private  String accountPassword;
 private String accountGender;
 private String operTime;
public Account(Integer accountId, Integer roleId, String accountName, String accountPassword, String accountGender,
		String operTime) {
	super();
	this.accountId = accountId;
	this.roleId = roleId;
	this.accountName = accountName;
	this.accountPassword = accountPassword;
	this.accountGender = accountGender;
	this.operTime = operTime;
}
public Integer getAccountId() {
	return accountId;
}
public void setAccountId(Integer accountId) {
	this.accountId = accountId;
}
public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public String getAccountPassword() {
	return accountPassword;
}
public void setAccountPassword(String accountPassword) {
	this.accountPassword = accountPassword;
}
public String getAccountGender() {
	return accountGender;
}
public void setAccountGender(String accountGender) {
	this.accountGender = accountGender;
}
public String getOperTime() {
	return operTime;
}
public void setOperTime(String operTime) {
	this.operTime = operTime;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accountGender == null) ? 0 : accountGender.hashCode());
	result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
	result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
	result = prime * result + ((accountPassword == null) ? 0 : accountPassword.hashCode());
	result = prime * result + ((operTime == null) ? 0 : operTime.hashCode());
	result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
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
	Account other = (Account) obj;
	if (accountGender == null) {
		if (other.accountGender != null)
			return false;
	} else if (!accountGender.equals(other.accountGender))
		return false;
	if (accountId == null) {
		if (other.accountId != null)
			return false;
	} else if (!accountId.equals(other.accountId))
		return false;
	if (accountName == null) {
		if (other.accountName != null)
			return false;
	} else if (!accountName.equals(other.accountName))
		return false;
	if (accountPassword == null) {
		if (other.accountPassword != null)
			return false;
	} else if (!accountPassword.equals(other.accountPassword))
		return false;
	if (operTime == null) {
		if (other.operTime != null)
			return false;
	} else if (!operTime.equals(other.operTime))
		return false;
	if (roleId == null) {
		if (other.roleId != null)
			return false;
	} else if (!roleId.equals(other.roleId))
		return false;
	return true;
}
@Override
public String toString() {
	return "Account [accountId=" + accountId + ", roleId=" + roleId + ", accountName=" + accountName
			+ ", accountPassword=" + accountPassword + ", accountGender=" + accountGender + ", operTime=" + operTime
			+ "]";
}
 
}
