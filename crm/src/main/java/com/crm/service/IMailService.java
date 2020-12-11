package com.crm.service;

import org.springframework.ui.Model;

/** 
 * @classComment 邮件管理业务接口
 * @author yangyongtao
 * @createTime 2020-12-08 上午10:04:04
 * @updateTime 2020-12-08 上午10:04:04
 * @version 1.0.0.0
 */
public interface IMailService {

	/**
	 * 查询收件箱
	 * @param model
	 * @param receiveId
	 * @param pageNum
	 * @return
	 * @throws Exception
	 */
	public String queryReceive(Model model, Integer receiveId, Integer pageNum) throws Exception;
	
	/**
	 * 查询发件箱
	 * @param model
	 * @param sendId
	 * @param pageNum
	 * @return
	 * @throws Exception
	 */
	public String querySend(Model model, Integer sendId, Integer pageNum) throws Exception;

	/**
	 * 查询所有用户
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public String queryUser(Model model) throws Exception;
}

