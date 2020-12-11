package com.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.pojo.CrmDictionary;
import com.crm.service.IDictionaryService;

/**
 * desc:数据字典业务层
 * @author wuxianfeng
 * @createTeime2020年12月4日 上午9:43:47
 * @updateTime 2020年12月4日 上午9:43:47
 * @version 1.0.0
 */
@Controller
@SessionAttributes("list")
public class DictionaryController {
	
	//注入业务实现接口
	@Resource
	private IDictionaryService idictionaryService;
	
	/**
	 * desc:数据字典查询
	 * @param model
	 * @param dictionaryType
	 * @param dictionaryEntry
	 * @param dictionaryValue
	 * @return
	 */
	@RequestMapping("/dictionary.do")
	public String dictionary(Model model,Integer pageNum) {
	try {
		String nextPath = idictionaryService.dictionary(model,pageNum);
		return nextPath;
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		return "error";
	}
	
	/**
	 * desc:根据查询数据
	 * @param model
	 * @param dictionaryType
	 * @param dictionaryEntry
	 * @param dictionaryValue
	 * @return
	 */
	@RequestMapping("/diction.do")
	public String diction(Model model, String dictionaryType,String dictionaryEntry,Integer dictionaryValue,Integer pageNum) {
		try {
		String nextPath = idictionaryService.diction(model,dictionaryType,dictionaryEntry,dictionaryValue,pageNum);
			return nextPath;
	} catch(Exception e) {
		e.printStackTrace();
	}
		return "error";
		
	}
	
	@RequestMapping("/dictionary1.do")
	public String add(Model model,CrmDictionary crmd) {
			try {
				String nextPath=idictionaryService.add(model, crmd);
				return nextPath;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "error";
	}
	@RequestMapping("/dictionary2.do")
	public String delete(Model model,Integer dicid) {
		System.out.println("sdaaaaaa"+dicid);
		try {
			String nextPath=idictionaryService.delete(model, dicid);
			return nextPath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	
}
