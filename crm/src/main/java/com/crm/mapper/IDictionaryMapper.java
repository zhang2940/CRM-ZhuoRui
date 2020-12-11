package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.ui.Model;

import com.crm.pojo.CrmDictionary;

/**
 * desc：数据词典访问接口
 * 
 * @author wuxianfeng
 * @createTeime2020年12月4日 上午11:06:34
 * @updateTime 2020年12月4日 上午11:06:34
 * @version 1.0.0
 * @param <TDemoRole>
 */
public interface IDictionaryMapper {
	@Results(id = "accountResults", value = { @Result(property = "dictionaryId", column = "dictionary_id", id = true),
			@Result(property = "dictionaryType", column = "dictionary_type"),
			@Result(property = "dictionaryEntry", column = "dictionary_entry"),
			@Result(property = "dictionaryValue", column = "dictionary_value"),
			@Result(property = "dictionaryCompile", column = "dictionary_compile") })
	// 查询全部
	@Select("select * from crm_dictionary ")
	List<CrmDictionary> dictionary();
	CrmDictionary getdiccountByLogin(Model model);

	@ResultMap("accountResults")
	// 根据条件查询
	@Select("<script>" 
			+ "select * from crm_dictionary" 
			+ "<where>" 
			+ "<choose>"
			+ "<when test=\"dictionaryType!=''\">" 
			+ "and dictionary_type=#{dictionaryType}" 
			+ "</when>"
			+ "<when test=\"dictionaryEntry!='' \">" 
			+ "and dictionary_entry=#{dictionaryEntry}" 
			+ "</when>"
			+ "<when  test=\"dictionaryValue!='' and dictionaryValue!=null\">"
			+ "and dictionary_value=#{dictionaryValue}" 
			+ "</when>" 
			+ "<when test=\"dictionaryType!='' and dictionaryEntry!=''\">"
			+ "and dictionary_type=#{dictionaryType} and dictionary_entry=#{dictionaryEntry}" 
			+ "</when>"
			+ "<when test=\"dictionaryType!='' and dictionaryValue!=''\">"
			+ "and dictionary_type=#{dictionaryType} and dictionary_value=#{dictionaryValue}" 
			+ "</when>"
			+ "<when test=\"dictionaryValue!='' and dictionaryEntry!=''\">"
			+ "and dictionary_entry=#{dictionaryEntry} and  dictionary_value=#{dictionaryValue} " 
			+ "</when>"
			+ "<when test=\"dictionaryType!='' and dictionaryEntry!='' and dictionaryValue!='' and dictionaryValue!=null\">"
			+ "and dictionary_type=#{dictionaryType} and dictionary_entry=#{dictionaryEntry} and dictionary_value=#{dictionaryValue}"
			+ "</when>" 
			+ "</choose>"
			+ "</where>" 
			+ "</script>")
	public List<CrmDictionary> diction(@Param("dictionaryType") String dictionaryType,
			@Param("dictionaryEntry") String dictionaryEntry, @Param("dictionaryValue") Integer dictionaryValue);

	
	// 新建
	@Insert("INSERT INTO crm_dictionary(dictionary_type,dictionary_entry,dictionary_value,dictionary_compile) values(#{dictionaryType},#{dictionaryEntry},#{dictionaryValue},#{dictionaryCompile}) ")
	public void add(CrmDictionary crmd) throws Exception;
	
	//删除
	@Delete("delete FROM crm_dictionary WHERE dictionary_id=#{des}" )
	public void delete(Integer des) throws Exception;

}
