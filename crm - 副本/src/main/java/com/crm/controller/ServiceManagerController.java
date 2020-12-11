package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seervice")
public class ServiceManagerController {
	
	@RequestMapping("/produceservice.do")
	public String jump() {
		return "pages/serviceManage/serviceManage";
	}
}
