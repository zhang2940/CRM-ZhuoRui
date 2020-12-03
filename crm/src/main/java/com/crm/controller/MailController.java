package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @classComment 邮件管理
 * @author yangyongtao
 * @createTime 2020-11-30 上午9:48:50
 * @updateTime 2020-11-30 上午9:48:50
 * @version 1.0.0.0
 */
@Controller
@RequestMapping("/mail")
public class MailController {

	@RequestMapping("/maillogin")
	public String mailLogin() {
		return "pages/mail/readMessage";
		
	}
	
	@RequestMapping("/receive")
	public String receive() {
		return "pages/mail/receive_message_list";
		
	}
	
	@RequestMapping("/send")
	public String send() {
		return "pages/mail/send_message_list";
		
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "pages/mail/deleted_message_list";
		
	}
	
	@RequestMapping("/write")
	public String write() {
		return "pages/mail/send";
		
	}
}

