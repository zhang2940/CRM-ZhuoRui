package com.crm.pojo;

/**
 * desc:查询产品信息持久类
 * @author wuxianfeng
 * @createTeime2020年12月6日 下午11:24:06
 * @updateTime 2020年12月6日 下午11:24:06
 * @version 1.0.0
 */
public class CrmInformation {
    private Integer informationId;//编号
    private String  informationName;//名称
    private String	informationModel;//型号
    private String  informationBatch;//等级/批次
    private String  informationUnits;//单位
    private String  informationPrice;//单价
    private	String	informationRemark;//备注
	public Integer getInformationId() {
		return informationId;
	}
	public void setInformationId(Integer informationId) {
		this.informationId = informationId;
	}
	public String getInformationName() {
		return informationName;
	}
	public void setInformationName(String informationName) {
		this.informationName = informationName;
	}
	public String getInformationModel() {
		return informationModel;
	}
	public void setInformationModel(String informationModel) {
		this.informationModel = informationModel;
	}
	public String getInformationBatch() {
		return informationBatch;
	}
	public void setInformationBatch(String informationBatch) {
		this.informationBatch = informationBatch;
	}
	public String getInformationUnits() {
		return informationUnits;
	}
	public void setInformationUnits(String informationUnits) {
		this.informationUnits = informationUnits;
	}
	public String getInformationPrice() {
		return informationPrice;
	}
	public void setInformationPrice(String informationPrice) {
		this.informationPrice = informationPrice;
	}
	public String getInformationRemark() {
		return informationRemark;
	}
	public void setInformationRemark(String informationRemark) {
		this.informationRemark = informationRemark;
	}
	@Override
	public String toString() {
		return "Information [informationId=" + informationId + ", informationName=" + informationName
				+ ", informationModel=" + informationModel + ", informationBatch=" + informationBatch
				+ ", informationUnits=" + informationUnits + ", informationPrice=" + informationPrice
				+ ", informationRemark=" + informationRemark + "]";
	}
    
}
