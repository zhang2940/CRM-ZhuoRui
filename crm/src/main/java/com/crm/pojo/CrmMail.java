package com.crm.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @classComment 邮件持久化类
 * @author yangyongtao
 * @createTime 2020-12-07 下午9:09:33
 * @updateTime 2020-12-07 下午9:09:33
 * @version 1.0.0.0
 */
@SuppressWarnings("serial")
public class CrmMail implements Serializable {

	private Integer mailId;// ID
	private CrmAccount mailfrom;// 发件人ID
	private CrmAccount mailto;// 收件人ID
	private String mailSubject;// 标题
	private String mailContent;// 主体内容
	private String mailAttachment;// 文件地址
	private Integer mailStatus; // 状态
	private Timestamp mailCreatetime; // 创建时间

	public Integer getMailId() {
		return mailId;
	}

	public void setMailId(Integer mailId) {
		this.mailId = mailId;
	}


	public CrmAccount getMailfrom() {
		return mailfrom;
	}

	public void setMailfrom(CrmAccount mailfrom) {
		this.mailfrom = mailfrom;
	}

	public CrmAccount getMailto() {
		return mailto;
	}

	public void setMailto(CrmAccount mailto) {
		this.mailto = mailto;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	public String getMailAttachment() {
		return mailAttachment;
	}

	public void setMailAttachment(String mailAttachment) {
		this.mailAttachment = mailAttachment;
	}

	public Integer getMailStatus() {
		return mailStatus;
	}

	public void setMailStatus(Integer mailStatus) {
		this.mailStatus = mailStatus;
	}

	public Timestamp getMailCreatetime() {
		return mailCreatetime;
	}

	public void setMailCreatetime(Timestamp mailCreatetime) {
		this.mailCreatetime = mailCreatetime;
	}

}
