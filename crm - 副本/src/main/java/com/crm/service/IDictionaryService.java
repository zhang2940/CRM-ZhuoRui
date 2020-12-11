package com.crm.service;

import org.springframework.ui.Model;

import com.crm.pojo.Account;
import com.crm.pojo.CrmDictionary;

/**
 * desc:数据字典业务接口
 * @author wuxianfeng
 * @createTeime2020年12月4日 上午10:24:56
 * @updateTime 2020年12月4日 上午10:24:56
 * @version 1.0.0
 */
public interface IDictionaryService {
	/**
	 * desc:查询表的所以信息
	 * @param model
	 * @param pageNum 
	 * @param dictionaryType 
	 * @return
	 * @throws Exception
	 */
	String dictionary(Model model, Integer pageNum) throws Exception;

	/**
	 * desc:根据查询类型 条目 值查询
	 * @param model 
	 * @param dictionaryEntry 
	 * @param dictionaryType 
	 * @param dictionaryType
	 * @param dictionaryEntry
	 * @param dictionaryValue
	 * @return
	 */
	String diction(Model model, String dictionaryType, String dictionaryEntry, Integer dictionaryValue,Integer pageNum);
	
	/**
	 * desc:新建
	 * @param model
	 * @param dictionaryType
	 * @param dictionaryEntry
	 * @param dictionaryValue
	 * @return
	 * @throws Exception 
	 */
	 String add(Model model, CrmDictionary crmd)throws Exception;

	 /**
	  * desc:删除
	  * @param model
	  * @param id
	  * @return
	  * @throws Exception
	  */
	String delete(Model model, Integer des) throws Exception;
	
	/**
	 * desc：展示修改视图数据
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	
}
