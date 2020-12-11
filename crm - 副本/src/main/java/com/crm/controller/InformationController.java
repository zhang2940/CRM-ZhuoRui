package com.crm.controller;
/**
 * desc:查询产品业务层
 * @author wuxianfeng
 * @createTeime2020年12月6日 上午1:49:51
 * @updateTime 2020年12月6日 上午1:49:51
 * @version 1.0.0
 */

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.service.IInformationService;

/**
 * desc:查询产品业务层
 * @author wuxianfeng
 * @createTeime2020年12月6日 上午2:01:15
 * @updateTime 2020年12月6日 上午2:01:15
 * @version 1.0.0
 */
@Controller
@SessionAttributes("list")
public class InformationController {

	//注入业务层Bean接口
	@Resource
	private IInformationService iinformationService;
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/information.do")
	public String inquire(Model model,Integer pageNum) {
	try {
		String nextPath = iinformationService.inquire(model,pageNum);
		return nextPath;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return "error";
	}
	
	
	@RequestMapping("/informa.do")
	public String inquir(Model model,String informationName,String informationModel,String informationBatch,Integer pageNum) {
	try {
		String nextPath = iinformationService.inquir(model,informationName,informationModel,informationBatch,pageNum);
		return nextPath;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return "error";
	}
	
}
