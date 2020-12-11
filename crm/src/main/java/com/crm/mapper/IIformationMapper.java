package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.ui.Model;

import com.crm.pojo.CrmInformation;
/**
 * desc:查询产品访问接口
 * @author wuxianfeng
 * @createTeime2020年12月6日 上午2:19:21
 * @updateTime 2020年12月6日 上午2:19:21
 * @version 1.0.0
 */
public interface IIformationMapper {
	@Results(id="accountResults", value = {
			@Result(property = "informationId", column = "information_id", id = true), 
			@Result(property = "informationName", column = "information_name"), 
			@Result(property = "informationModel", column = "information_model"), 
			@Result(property = "informationBatch", column = "information_batch"), 
			@Result(property = "informationUnits", column = "information_units"),
			@Result(property = "informationPrice", column = "information_price"),
			@Result(property = "informationRemark",column = "information_remark")})
	//查询产品
	@Select("select * from crm_information")
	List<CrmInformation> inquire();
	CrmInformation getdiccountByLogin(Model model);
	
	//根据名称，型号，批次获得查询
	@ResultMap("accountResults")
	// 根据条件查询
	@Select("<script>" 
			+ "select * from crm_information" 
			+ "<where>" 
			+ "<choose>"
			+ "<when test=\"informationName!='' and informationModel!=''\">"
			+ "and information_name=#{informationName} and information_model=#{informationModel}" 
			+ "</when>"
			+ "<when test=\"informationName!='' and informationBatch!=''\">"
			+ "and information_name=#{informationName} and information_batch=#{informationBatch}" 
			+ "</when>"
			+ "<when test=\"informationModel!='' and informationBatch!=''\">"
			+ "and information_model=#{informationModel} and  information_batch=#{informationBatch} " 
			+ "</when>"
			+ "<when test=\"informationName!=''\">" 
			+ "and information_name=#{informationName}" 
			+ "</when>"
			+ "<when test=\"informationModel!='' \">" 
			+ "and information_model=#{informationModel}" 
			+ "</when>"
			+ "<when  test=\"informationBatch!='' and informationBatch!=null\">"
			+ "and information_batch=#{informationBatch}" 
			+ "</when>"
			+ "<when test=\"informationName!='' and informationModel!='' and informationBatch!='' and informationBatch!=null\">"
			+ "and information_name=#{informationName} and information_model=#{informationModel} and information_batch=#{informationBatch}"
			+ "</when>" 
			+ "</choose>"
			+ "</where>" 
			+ "</script>")
	public List<CrmInformation> iquir(@Param("informationName") String informationName, @Param("informationModel") String informationModel,
			@Param("informationBatch") String informationBatch);
}
