package com.crm.pojo;

/**
 * derc:数据字典持久类
 * @author wuxianfeng
 * @createTeime2020年12月4日 上午9:28:02
 * @updateTime 2020年12月4日 上午9:28:02
 * @version 1.0.0
 */
public class CrmDictionary {
	private Integer dictionaryId; //编号
	private String 	dictionaryType;//类型
	private String 	dictionaryEntry;//条目
	private Integer dictionaryValue;//值
	private String dictionaryCompile;//编辑
	public Integer getDictionaryId() {
		return dictionaryId;
	}
	public void setDictionaryId(Integer dictionaryId) {
		this.dictionaryId = dictionaryId;
	}
	public String getDictionaryType() {
		return dictionaryType;
	}
	public void setDictionaryType(String dictionaryType) {
		this.dictionaryType = dictionaryType;
	}
	public String getDictionaryEntry() {
		return dictionaryEntry;
	}
	public void setDictionaryEntry(String dictionaryEntry) {
		this.dictionaryEntry = dictionaryEntry;
	}
	public Integer getDictionaryValue() {
		return dictionaryValue;
	}
	public void setDictionaryValue(Integer dictionaryValue) {
		this.dictionaryValue = dictionaryValue;
	}
	public String getDictionaryCompile() {
		return dictionaryCompile;
	}
	public void setDictionaryCompile(String dictionaryCompile) {
		this.dictionaryCompile = dictionaryCompile;
	}
	@Override
	public String toString() {
		return "Dictionary [dictionaryId=" + dictionaryId + ", dictionaryType=" + dictionaryType + ", dictionaryEntry="
				+ dictionaryEntry + ", dictionaryValue=" + dictionaryValue + ", dictionaryCompile=" + dictionaryCompile
				+ "]";
	}
	
}
