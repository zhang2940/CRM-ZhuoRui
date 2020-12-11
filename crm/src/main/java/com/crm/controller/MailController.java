package com.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.pojo.CrmAccount;
import com.crm.pojo.CrmMail;
import com.crm.service.IMailService;

/** 
 * @classComment 邮件管理
 * @author yangyongtao
 * @createTime 2020-11-30 上午9:48:50
 * @updateTime 2020-11-30 上午9:48:50
 * @version 1.0.0.0
 */
@Controller
@RequestMapping("/mail")
@SessionAttributes({"userInfo"})
public class MailController {

	@Resource
	private IMailService imailService;
	@RequestMapping("/read")
	public String mailLogin() {
		return "pages/mail/readMessage";
		
	}
	
	@RequestMapping("/receive")
	public String receive(Model model, @SessionAttribute CrmAccount userInfo, Integer pageNum) {
		try {
			String nextPath = imailService.queryReceive(model, userInfo.getAccountId(), pageNum);
			return nextPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	@RequestMapping("/send")
	public String send(Model model, @SessionAttribute CrmAccount userInfo, Integer pageNum) {
		try {
			String nextPath = imailService.querySend(model, userInfo.getAccountId(), pageNum);
			return nextPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
		
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "pages/mail/deleted_message_list";
		
	}
	
	@RequestMapping("/write")
	public String write(Model model) {
		try {
			String nextPath = imailService.queryUser(model);
			return nextPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
		
	}
	
	@RequestMapping("/sendmessage")
	public String sendmessage(Model model, String mailSubject) {
		try {
			System.out.println(mailSubject);
//			System.out.println(crmMail.getMailContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
		
	}
}

