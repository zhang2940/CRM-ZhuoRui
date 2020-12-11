package com.crm.mapper;
/** 
 * @classComment 邮件数据访问接口
 * @author yangyongtao
 * @createTime 2020-12-08 上午10:10:49
 * @updateTime 2020-12-08 上午10:10:49
 * @version 1.0.0.0
 */

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.crm.pojo.CrmMail;

public interface IMailMapper {

	@Results(id = "mailResults", value = { @Result(property = "mailId", column = "mail_id", id = true),
			@Result(property = "mailSubject", column = "mail_subject"),
			@Result(property = "mailContent", column = "mail_content"),
			@Result(property = "mailAttachment", column = "mail_attachment"),
			@Result(property = "mailStatus", column = "mail_status"),
			@Result(property = "mailCreatetime", column = "mail_createtime"),
			@Result(property = "mailfrom", column = "mail_from_id", one = @One(
					resultMap = "com.crm.mapper.IAccountMapper.accountResults")),
			@Result(property = "mailto", column = "mail_to_id", one = @One(
					resultMap = "com.crm.mapper.IAccountMapper.accountResults"))
	})
	@Select("SELECT mail_id, mail_from_id, mail_to_id, mail_subject, mail_content, mail_createtime, mail_status, mail_attachment,account_name"
			+ " from crm_mail m join crm_account a on m.mail_from_id = a.account_id"
			+ " WHERE mail_to_id = #{receiveId}")
	public List<CrmMail> queryReceive(Integer receiveId) throws Exception;
	
	@ResultMap("mailResults")
	@Select("SELECT mail_id, mail_from_id, mail_to_id, mail_subject, mail_content, mail_createtime, mail_status, mail_attachment,account_name"
			+ " from crm_mail m join crm_account a on m.mail_from_id = a.account_id"
			+ " WHERE mail_from_id = #{sendId}")
	public List<CrmMail> querySend(Integer sendId) throws Exception;
	
}

