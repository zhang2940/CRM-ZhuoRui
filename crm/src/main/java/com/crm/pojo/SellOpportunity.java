/**
 * 
 */
package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



/**
 * @author admin
 * @createTime 2020年12月2日下午7:29:46
 * @updateTime 2020年12月2日下午7:29:46 
 * @version 1.0.0
 */
public class SellOpportunity implements Serializable {
	private Integer sellId;
	private Integer accountId;
	private String opportunitySource;
	private String customerName;
    private Integer successProbability;
    private String  summary;
    private String contacts;
    private String contactsPhone;
    private String opportunityDescrible;
    private  String creator;
    private String creationTime;
    private Integer designatedPerson;
    private String designatedTime;
    private String distribution;
	
	
	
	public SellOpportunity(Integer sellId, Integer accountId, String opportunitySource, String customerName,
			Integer successProbability, String summary, String contacts, String contactsPhone,
			String opportunityDescrible, String creator, String creationTime, Integer designatedPerson,
			String designatedTime, String distribution) {
		super();
		this.sellId = sellId;
		this.accountId = accountId;
		this.opportunitySource = opportunitySource;
		this.customerName = customerName;
		this.successProbability = successProbability;
		this.summary = summary;
		this.contacts = contacts;
		this.contactsPhone = contactsPhone;
		this.opportunityDescrible = opportunityDescrible;
		this.creator = creator;
		this.creationTime = creationTime;
		this.designatedPerson = designatedPerson;
		this.designatedTime = designatedTime;
		this.distribution = distribution;
	}

	public Integer getSellId() {
		return sellId;
	}

	public void setSellId(Integer sellId) {
		this.sellId = sellId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getOpportunitySource() {
		return opportunitySource;
	}

	public void setOpportunitySource(String opportunitySource) {
		this.opportunitySource = opportunitySource;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getSuccessProbability() {
		return successProbability;
	}

	public void setSuccessProbability(Integer successProbability) {
		this.successProbability = successProbability;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getContactsPhone() {
		return contactsPhone;
	}

	public void setContactsPhone(String contactsPhone) {
		this.contactsPhone = contactsPhone;
	}

	public String getOpportunityDescrible() {
		return opportunityDescrible;
	}

	public void setOpportunityDescrible(String opportunityDescrible) {
		this.opportunityDescrible = opportunityDescrible;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
 
	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getDesignatedTime() {
		return designatedTime;
	}

	public void setDesignatedTime(String designatedTime) {
		this.designatedTime = designatedTime;
	}

	public Integer getDesignatedPerson() {
		return designatedPerson;
	}

	public void setDesignatedPerson(Integer designatedPerson) {
		this.designatedPerson = designatedPerson;
	}
	
	

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((contacts == null) ? 0 : contacts.hashCode());
		result = prime * result + ((contactsPhone == null) ? 0 : contactsPhone.hashCode());
		result = prime * result + ((creationTime == null) ? 0 : creationTime.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((designatedPerson == null) ? 0 : designatedPerson.hashCode());
		result = prime * result + ((designatedTime == null) ? 0 : designatedTime.hashCode());
		result = prime * result + ((distribution == null) ? 0 : distribution.hashCode());
		result = prime * result + ((opportunityDescrible == null) ? 0 : opportunityDescrible.hashCode());
		result = prime * result + ((opportunitySource == null) ? 0 : opportunitySource.hashCode());
		result = prime * result + ((sellId == null) ? 0 : sellId.hashCode());
		result = prime * result + ((successProbability == null) ? 0 : successProbability.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
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
		SellOpportunity other = (SellOpportunity) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (contacts == null) {
			if (other.contacts != null)
				return false;
		} else if (!contacts.equals(other.contacts))
			return false;
		if (contactsPhone == null) {
			if (other.contactsPhone != null)
				return false;
		} else if (!contactsPhone.equals(other.contactsPhone))
			return false;
		if (creationTime != other.creationTime)
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (designatedPerson == null) {
			if (other.designatedPerson != null)
				return false;
		} else if (!designatedPerson.equals(other.designatedPerson))
			return false;
		if (designatedTime != other.designatedTime)
			return false;
		if (distribution == null) {
			if (other.distribution != null)
				return false;
		} else if (!distribution.equals(other.distribution))
			return false;
		if (opportunityDescrible == null) {
			if (other.opportunityDescrible != null)
				return false;
		} else if (!opportunityDescrible.equals(other.opportunityDescrible))
			return false;
		if (opportunitySource == null) {
			if (other.opportunitySource != null)
				return false;
		} else if (!opportunitySource.equals(other.opportunitySource))
			return false;
		if (sellId == null) {
			if (other.sellId != null)
				return false;
		} else if (!sellId.equals(other.sellId))
			return false;
		if (successProbability == null) {
			if (other.successProbability != null)
				return false;
		} else if (!successProbability.equals(other.successProbability))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SellOpportunity [sellId=" + sellId + ", accountId=" + accountId + ", opportunitySource="
				+ opportunitySource + ", customerName=" + customerName + ", successProbability=" + successProbability
				+ ", summary=" + summary + ", contacts=" + contacts + ", contactsPhone=" + contactsPhone
				+ ", opportunityDescrible=" + opportunityDescrible + ", creator=" + creator + ", creationTime="
				+ creationTime + ", designatedPerson=" + designatedPerson + ", designatedTime=" + designatedTime
				+ ", distribution=" + distribution + "]";
	}
   


}