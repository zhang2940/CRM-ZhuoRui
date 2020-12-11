/**
 * 
 */
package com.crm.pojo;

/**
 * @author admin
 * @createTime 2020年12月7日上午10:07:03
 * @updateTime 2020年12月7日上午10:07:03 
 * @version 1.0.0
 */
public class Client {
	private Integer clientId; 
	private Integer accountId;
    private Integer sellId;
    private String  clientName;
    private String  clientArea;
    private String  manager;
    private String  clientGrade;
    private String  clientSatisfaction;
    private String  clientCreditStatus;
    private String  clientAddress;
    private String  clientPostalCode;
    private String  clientPhoneNumber;
    private String  clientFaxes;
    private String  clientWebsite;
    private String  clientBusinessLicense; 
    private String  clientLegalPerson;
    private Double  clientRegisteredFund; 
    private Double  clientYearSalesVolume;
    private String  clientBankDeposit;  
    private String  clientBankAccount;
    private String  clientLocalNumber;
    private String  clientNationalNumber;
	public Client(Integer clientId, Integer accountId, Integer sellId, String clientName, String clientArea,
			String manager, String clientGrade, String clientSatisfaction, String clientCreditStatus,
			String clientAddress, String clientPostalCode, String clientPhoneNumber, String clientFaxes,
			String clientWebsite, String clientBusinessLicense, String clientLegalPerson, Double clientRegisteredFund,
			Double clientYearSalesVolume, String clientBankDeposit, String clientBankAccount, String clientLocalNumber,
			String clientNationalNumber) {
		super();
		this.clientId = clientId;
		this.accountId = accountId;
		this.sellId = sellId;
		this.clientName = clientName;
		this.clientArea = clientArea;
		this.manager = manager;
		this.clientGrade = clientGrade;
		this.clientSatisfaction = clientSatisfaction;
		this.clientCreditStatus = clientCreditStatus;
		this.clientAddress = clientAddress;
		this.clientPostalCode = clientPostalCode;
		this.clientPhoneNumber = clientPhoneNumber;
		this.clientFaxes = clientFaxes;
		this.clientWebsite = clientWebsite;
		this.clientBusinessLicense = clientBusinessLicense;
		this.clientLegalPerson = clientLegalPerson;
		this.clientRegisteredFund = clientRegisteredFund;
		this.clientYearSalesVolume = clientYearSalesVolume;
		this.clientBankDeposit = clientBankDeposit;
		this.clientBankAccount = clientBankAccount;
		this.clientLocalNumber = clientLocalNumber;
		this.clientNationalNumber = clientNationalNumber;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getSellId() {
		return sellId;
	}
	public void setSellId(Integer sellId) {
		this.sellId = sellId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientArea() {
		return clientArea;
	}
	public void setClientArea(String clientArea) {
		this.clientArea = clientArea;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getClientGrade() {
		return clientGrade;
	}
	public void setClientGrade(String clientGrade) {
		this.clientGrade = clientGrade;
	}
	public String getClientSatisfaction() {
		return clientSatisfaction;
	}
	public void setClientSatisfaction(String clientSatisfaction) {
		this.clientSatisfaction = clientSatisfaction;
	}
	public String getClientCreditStatus() {
		return clientCreditStatus;
	}
	public void setClientCreditStatus(String clientCreditStatus) {
		this.clientCreditStatus = clientCreditStatus;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientPostalCode() {
		return clientPostalCode;
	}
	public void setClientPostalCode(String clientPostalCode) {
		this.clientPostalCode = clientPostalCode;
	}
	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}
	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}
	public String getClientFaxes() {
		return clientFaxes;
	}
	public void setClientFaxes(String clientFaxes) {
		this.clientFaxes = clientFaxes;
	}
	public String getClientWebsite() {
		return clientWebsite;
	}
	public void setClientWebsite(String clientWebsite) {
		this.clientWebsite = clientWebsite;
	}
	public String getClientBusinessLicense() {
		return clientBusinessLicense;
	}
	public void setClientBusinessLicense(String clientBusinessLicense) {
		this.clientBusinessLicense = clientBusinessLicense;
	}
	public String getClientLegalPerson() {
		return clientLegalPerson;
	}
	public void setClientLegalPerson(String clientLegalPerson) {
		this.clientLegalPerson = clientLegalPerson;
	}
	public Double getClientRegisteredFund() {
		return clientRegisteredFund;
	}
	public void setClientRegisteredFund(Double clientRegisteredFund) {
		this.clientRegisteredFund = clientRegisteredFund;
	}
	public Double getClientYearSalesVolume() {
		return clientYearSalesVolume;
	}
	public void setClientYearSalesVolume(Double clientYearSalesVolume) {
		this.clientYearSalesVolume = clientYearSalesVolume;
	}
	public String getClientBankDeposit() {
		return clientBankDeposit;
	}
	public void setClientBankDeposit(String clientBankDeposit) {
		this.clientBankDeposit = clientBankDeposit;
	}
	public String getClientBankAccount() {
		return clientBankAccount;
	}
	public void setClientBankAccount(String clientBankAccount) {
		this.clientBankAccount = clientBankAccount;
	}
	public String getClientLocalNumber() {
		return clientLocalNumber;
	}
	public void setClientLocalNumber(String clientLocalNumber) {
		this.clientLocalNumber = clientLocalNumber;
	}
	public String getClientNationalNumber() {
		return clientNationalNumber;
	}
	public void setClientNationalNumber(String clientNationalNumber) {
		this.clientNationalNumber = clientNationalNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((clientAddress == null) ? 0 : clientAddress.hashCode());
		result = prime * result + ((clientArea == null) ? 0 : clientArea.hashCode());
		result = prime * result + ((clientBankAccount == null) ? 0 : clientBankAccount.hashCode());
		result = prime * result + ((clientBankDeposit == null) ? 0 : clientBankDeposit.hashCode());
		result = prime * result + ((clientBusinessLicense == null) ? 0 : clientBusinessLicense.hashCode());
		result = prime * result + ((clientCreditStatus == null) ? 0 : clientCreditStatus.hashCode());
		result = prime * result + ((clientFaxes == null) ? 0 : clientFaxes.hashCode());
		result = prime * result + ((clientGrade == null) ? 0 : clientGrade.hashCode());
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((clientLegalPerson == null) ? 0 : clientLegalPerson.hashCode());
		result = prime * result + ((clientLocalNumber == null) ? 0 : clientLocalNumber.hashCode());
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((clientNationalNumber == null) ? 0 : clientNationalNumber.hashCode());
		result = prime * result + ((clientPhoneNumber == null) ? 0 : clientPhoneNumber.hashCode());
		result = prime * result + ((clientPostalCode == null) ? 0 : clientPostalCode.hashCode());
		result = prime * result + ((clientRegisteredFund == null) ? 0 : clientRegisteredFund.hashCode());
		result = prime * result + ((clientSatisfaction == null) ? 0 : clientSatisfaction.hashCode());
		result = prime * result + ((clientWebsite == null) ? 0 : clientWebsite.hashCode());
		result = prime * result + ((clientYearSalesVolume == null) ? 0 : clientYearSalesVolume.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((sellId == null) ? 0 : sellId.hashCode());
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
		Client other = (Client) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (clientAddress == null) {
			if (other.clientAddress != null)
				return false;
		} else if (!clientAddress.equals(other.clientAddress))
			return false;
		if (clientArea == null) {
			if (other.clientArea != null)
				return false;
		} else if (!clientArea.equals(other.clientArea))
			return false;
		if (clientBankAccount == null) {
			if (other.clientBankAccount != null)
				return false;
		} else if (!clientBankAccount.equals(other.clientBankAccount))
			return false;
		if (clientBankDeposit == null) {
			if (other.clientBankDeposit != null)
				return false;
		} else if (!clientBankDeposit.equals(other.clientBankDeposit))
			return false;
		if (clientBusinessLicense == null) {
			if (other.clientBusinessLicense != null)
				return false;
		} else if (!clientBusinessLicense.equals(other.clientBusinessLicense))
			return false;
		if (clientCreditStatus == null) {
			if (other.clientCreditStatus != null)
				return false;
		} else if (!clientCreditStatus.equals(other.clientCreditStatus))
			return false;
		if (clientFaxes == null) {
			if (other.clientFaxes != null)
				return false;
		} else if (!clientFaxes.equals(other.clientFaxes))
			return false;
		if (clientGrade == null) {
			if (other.clientGrade != null)
				return false;
		} else if (!clientGrade.equals(other.clientGrade))
			return false;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (clientLegalPerson == null) {
			if (other.clientLegalPerson != null)
				return false;
		} else if (!clientLegalPerson.equals(other.clientLegalPerson))
			return false;
		if (clientLocalNumber == null) {
			if (other.clientLocalNumber != null)
				return false;
		} else if (!clientLocalNumber.equals(other.clientLocalNumber))
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (clientNationalNumber == null) {
			if (other.clientNationalNumber != null)
				return false;
		} else if (!clientNationalNumber.equals(other.clientNationalNumber))
			return false;
		if (clientPhoneNumber == null) {
			if (other.clientPhoneNumber != null)
				return false;
		} else if (!clientPhoneNumber.equals(other.clientPhoneNumber))
			return false;
		if (clientPostalCode == null) {
			if (other.clientPostalCode != null)
				return false;
		} else if (!clientPostalCode.equals(other.clientPostalCode))
			return false;
		if (clientRegisteredFund == null) {
			if (other.clientRegisteredFund != null)
				return false;
		} else if (!clientRegisteredFund.equals(other.clientRegisteredFund))
			return false;
		if (clientSatisfaction == null) {
			if (other.clientSatisfaction != null)
				return false;
		} else if (!clientSatisfaction.equals(other.clientSatisfaction))
			return false;
		if (clientWebsite == null) {
			if (other.clientWebsite != null)
				return false;
		} else if (!clientWebsite.equals(other.clientWebsite))
			return false;
		if (clientYearSalesVolume == null) {
			if (other.clientYearSalesVolume != null)
				return false;
		} else if (!clientYearSalesVolume.equals(other.clientYearSalesVolume))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (sellId == null) {
			if (other.sellId != null)
				return false;
		} else if (!sellId.equals(other.sellId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", accountId=" + accountId + ", sellId=" + sellId + ", clientName="
				+ clientName + ", clientArea=" + clientArea + ", manager=" + manager + ", clientGrade=" + clientGrade
				+ ", clientSatisfaction=" + clientSatisfaction + ", clientCreditStatus=" + clientCreditStatus
				+ ", clientAddress=" + clientAddress + ", clientPostalCode=" + clientPostalCode + ", clientPhoneNumber="
				+ clientPhoneNumber + ", clientFaxes=" + clientFaxes + ", clientWebsite=" + clientWebsite
				+ ", clientBusinessLicense=" + clientBusinessLicense + ", clientLegalPerson=" + clientLegalPerson
				+ ", clientRegisteredFund=" + clientRegisteredFund + ", clientYearSalesVolume=" + clientYearSalesVolume
				+ ", clientBankDeposit=" + clientBankDeposit + ", clientBankAccount=" + clientBankAccount
				+ ", clientLocalNumber=" + clientLocalNumber + ", clientNationalNumber=" + clientNationalNumber + "]";
	}
    
  
           





}
