/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月7日下午2:50:00
 * @updateTime 2020年12月7日下午2:50:00 
 * @version 1.0.0
 */
public class Contacts {
	private Integer contactsId;
	private Integer clientId;
	private String  contactsName;
	private String  contactsGender;
	private String  contactsPosition;
	private String  contactsOfficeNumber;
	private String  contactsPhoneNumber;
	private String  contactsRemarks;
	public Contacts(Integer contactsId, Integer clientId, String contactsName, String contactsGender,
			String contactsPosition, String contactsOfficeNumber, String contactsPhoneNumber, String contactsRemarks) {
		super();
		this.contactsId = contactsId;
		this.clientId = clientId;
		this.contactsName = contactsName;
		this.contactsGender = contactsGender;
		this.contactsPosition = contactsPosition;
		this.contactsOfficeNumber = contactsOfficeNumber;
		this.contactsPhoneNumber = contactsPhoneNumber;
		this.contactsRemarks = contactsRemarks;
	}
	public Integer getContactsId() {
		return contactsId;
	}
	public void setContactsId(Integer contactsId) {
		this.contactsId = contactsId;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getContactsName() {
		return contactsName;
	}
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	public String getContactsGender() {
		return contactsGender;
	}
	public void setContactsGender(String contactsGender) {
		this.contactsGender = contactsGender;
	}
	public String getContactsPosition() {
		return contactsPosition;
	}
	public void setContactsPosition(String contactsPosition) {
		this.contactsPosition = contactsPosition;
	}
	public String getContactsOfficeNumber() {
		return contactsOfficeNumber;
	}
	public void setContactsOfficeNumber(String contactsOfficeNumber) {
		this.contactsOfficeNumber = contactsOfficeNumber;
	}
	public String getContactsPhoneNumber() {
		return contactsPhoneNumber;
	}
	public void setContactsPhoneNumber(String contactsPhoneNumber) {
		this.contactsPhoneNumber = contactsPhoneNumber;
	}
	public String getContactsRemarks() {
		return contactsRemarks;
	}
	public void setContactsRemarks(String contactsRemarks) {
		this.contactsRemarks = contactsRemarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((contactsGender == null) ? 0 : contactsGender.hashCode());
		result = prime * result + ((contactsId == null) ? 0 : contactsId.hashCode());
		result = prime * result + ((contactsName == null) ? 0 : contactsName.hashCode());
		result = prime * result + ((contactsOfficeNumber == null) ? 0 : contactsOfficeNumber.hashCode());
		result = prime * result + ((contactsPhoneNumber == null) ? 0 : contactsPhoneNumber.hashCode());
		result = prime * result + ((contactsPosition == null) ? 0 : contactsPosition.hashCode());
		result = prime * result + ((contactsRemarks == null) ? 0 : contactsRemarks.hashCode());
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
		Contacts other = (Contacts) obj;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (contactsGender == null) {
			if (other.contactsGender != null)
				return false;
		} else if (!contactsGender.equals(other.contactsGender))
			return false;
		if (contactsId == null) {
			if (other.contactsId != null)
				return false;
		} else if (!contactsId.equals(other.contactsId))
			return false;
		if (contactsName == null) {
			if (other.contactsName != null)
				return false;
		} else if (!contactsName.equals(other.contactsName))
			return false;
		if (contactsOfficeNumber == null) {
			if (other.contactsOfficeNumber != null)
				return false;
		} else if (!contactsOfficeNumber.equals(other.contactsOfficeNumber))
			return false;
		if (contactsPhoneNumber == null) {
			if (other.contactsPhoneNumber != null)
				return false;
		} else if (!contactsPhoneNumber.equals(other.contactsPhoneNumber))
			return false;
		if (contactsPosition == null) {
			if (other.contactsPosition != null)
				return false;
		} else if (!contactsPosition.equals(other.contactsPosition))
			return false;
		if (contactsRemarks == null) {
			if (other.contactsRemarks != null)
				return false;
		} else if (!contactsRemarks.equals(other.contactsRemarks))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Contacts [contactsId=" + contactsId + ", clientId=" + clientId + ", contactsName=" + contactsName
				+ ", contactsGender=" + contactsGender + ", contactsPosition=" + contactsPosition
				+ ", contactsOfficeNumber=" + contactsOfficeNumber + ", contactsPhoneNumber=" + contactsPhoneNumber
				+ ", contactsRemarks=" + contactsRemarks + "]";
	}
	
}
