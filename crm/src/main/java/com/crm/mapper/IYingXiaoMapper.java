/**
 * 
 */
package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.crm.pojo.SellOpportunity;

/**
 * @author admin
 * @createTime 2020年12月2日上午9:06:35
 * @updateTime 2020年12月2日上午9:06:35 
 * @version 1.0.0
 */

public interface IYingXiaoMapper {
	//展示营销机会列表
	@Results(id="showchance", value = {
			@Result(property = "sellId", column = "sell_id", id = true), 
			@Result(property = "accountId", column = "account_id"), 
			@Result(property = "opportunitySource", column = "sell_opportunity_source"), 
			@Result(property = "customerName", column = "sell_customer_name"), 
			@Result(property = "successProbability", column = "sell_success_probability"),
			@Result(property = "summary", column = "sell_summary"),
			@Result(property = "contacts", column = "sell_contacts"),
			@Result(property = "contactsPhone", column = "sell_contacts_phone"),
			@Result(property = "opportunityDescrible", column = "sell_opportunity_describe"),
			@Result(property = "creator",column = "sell_creator"),
			@Result(property = "creationTime",column = "sell_creation_time"),
			@Result(property = "designatedPerson", column = "sell_designated_person"),
			@Result(property = "designatedTime", column = "sell_appointed_time"),
			@Result(property = "distribution", column = "sell_distribution")
		})
	
	@Select("select*from crm_sell_opportunity where account_id=#{accountId}")
	public List<SellOpportunity> showChance(@Param("accountId") String accountId);  

}
