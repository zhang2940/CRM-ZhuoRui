package com.crm.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IDictionaryMapper;
import com.crm.pojo.Account;
import com.crm.pojo.CrmDictionary;
import com.crm.service.IDictionaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * decs：数据字典管理实现类
 * @author wuxianfeng
 * @createTeime2020年12月4日 下午4:21:23
 * @updateTime 2020年12月4日 下午4:21:23
 * @version 1.0.0
 */
@Service
public class DictionaryServiceImpl implements IDictionaryService{
	
	//注入数据访问接口对象
	@Resource
	private IDictionaryMapper idictionaryMapper;
	
	@Override
	public String dictionary(Model model,Integer pageNum) {
		//判断是否获得页码
		pageNum = pageNum==null ? 1 : pageNum;
		//启动 页码
		PageHelper.startPage(pageNum, 10);
		//查询数据字典数据库表
	  List<CrmDictionary> list=idictionaryMapper.dictionary();
	  //获得分页
	  PageInfo<CrmDictionary> pageInfo = new PageInfo<CrmDictionary>(list,10);
	  model.addAttribute("list",list);
	  model.addAttribute("pageInfo", pageInfo);
		return "dictionary";
	}

	//查询数据
	@Override
	public String diction(Model model, String dictionaryType,String dictionaryEntry,Integer dictionaryValue,Integer pageNum) {
		//判断是否获得页码
				pageNum = pageNum==null ? 1 : pageNum;
				//启动 页码
				PageHelper.startPage(pageNum, 4);
				//查询数据
				//查询数据字典数据库表
		List<CrmDictionary> list=idictionaryMapper.diction(dictionaryType, dictionaryEntry, dictionaryValue);
		PageInfo<CrmDictionary> pageInfo = new PageInfo<CrmDictionary>(list,10);
		model.addAttribute("list",list);
		model.addAttribute("pageInfo", pageInfo);
		return "dictionary";
		
	}

	//新建
	@Override
	public String add(Model model, CrmDictionary crmd)throws Exception {
			idictionaryMapper.add(crmd);
			List<CrmDictionary> list=idictionaryMapper.dictionary();
			model.addAttribute("list",list);
			return "dictionary";
	}
	
	//删除
	@Override
	public String delete(Model model, Integer des)throws Exception{
		System.out.println("-----------"+des);
		idictionaryMapper.delete(des);
		List<CrmDictionary> list=idictionaryMapper.dictionary();
		model.addAttribute("list", list);
		return "dictionary";
		
	}

	
	
}
