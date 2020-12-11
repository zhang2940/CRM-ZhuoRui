/**
 * 
 */
package com.crm.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.ui.Model;

import com.crm.pojo.Account;
import com.crm.pojo.Client;
import com.crm.pojo.Plan;
import com.crm.pojo.SellOpportunity;

/**
 * @author admin
 * @createTime 2020年12月2日上午9:06:35
 * @updateTime 2020年12月2日上午9:06:35
 * @version 1.0.0
 */

public interface IYingXiaoMapper {
	// 展示营销机会列表
	@Results(id = "showchance", value = { @Result(property = "sellId", column = "sell_id", id = true),
			@Result(property = "accountId", column = "account_id"),
			@Result(property = "opportunitySource", column = "sell_opportunity_source"),
			@Result(property = "customerName", column = "sell_customer_name"),
			@Result(property = "successProbability", column = "sell_success_probability"),
			@Result(property = "summary", column = "sell_summary"),
			@Result(property = "contacts", column = "sell_contacts"),
			@Result(property = "contactsPhone", column = "sell_contacts_phone"),
			@Result(property = "opportunityDescrible", column = "sell_opportunity_describe"),
			@Result(property = "creator", column = "sell_creator"),
			@Result(property = "creationTime", column = "sell_creation_time"),
			@Result(property = "designatedPerson", column = "sell_designated_person"),
			@Result(property = "designatedTime", column = "sell_designated_time"),
			@Result(property = "distribution", column = "sell_distribution") })

	@Select("select*from crm_sell_opportunity where account_id=#{accountId}")
	public List<SellOpportunity> showChance(@Param("accountId") Integer accountId);

	// 根据条件查找销售机会列表

	@Select("<script>" + "select * from crm_sell_opportunity" + "<where>"
			+ "<choose>"
			+ "<when test=\"clientName!=''\">"
			+ "and sell_customer_name=#{clientName} and account_id=#{accountId} "
			+ "</when>"
			+ "<when test=\" summary!=''\">"
			+ "and sell_summary=#{summary} and account_id=#{accountId} "
			+ "</when>"
			+ "<when test=\" contact!=''\">"
			+ "and sell_contacts=#{contact} and account_id=#{accountId}  "
			+ "</when>"
			+ "<when test=\"clientName != '' and summary!=''\">"
			+ " and sell_customer_name=#{clientName} and sell_summary=#{summary} and account_id=#{accountId} "
			+ "</when>"
			+ "<when test=\"clientName != '' and contact!=''\">"
			+ "and sell_customer_name=#{clientName} and sell_contacts=#{contact} and account_id=#{accountId} "
			+ "</when>"
			+ "<when test=\"contact!='' and summary!=''\">"
			+ "and sell_contacts=#{contact} and sell_summary=#{summary} and account_id=#{accountId} "
			+ "</when>"
			+ "<when test=\"contact=!'' and summary=!'' and clientName=!'' \">"
			+ "and sell_contacts=#{contact} and sell_summary=#{summary} and account_id=#{accountId} and sell_customer_name=#{clientName}"
			+ "</when>"
			+ "</choose>"
			+ "</where>" + "</script>")
	public List<SellOpportunity> chaChance(@Param("clientName") String clientName, @Param("summary") String summary,
			@Param("contact") String contact, @Param("accountId") Integer accountId);

	// 根据sellId进行删除
	@Delete("delete from  crm_sell_opportunity where sell_id=#{sellId}")
	public void xiaoshan(Integer sellId);

	@Results(id = "chaaccount", value = { @Result(property = "accountId", column = "account_id", id = true),
			@Result(property = "roleId", column = "account_id"),
			@Result(property = "accountName", column = "account_name"),
			@Result(property = "accountPassword", column = "account_password"),
			@Result(property = "accountGender", column = "account_gender"),
			@Result(property = "operTime", column = "oper_time") })
	// 查找客户经理
	@Select("select *from crm_account where role_id=3")

	public List<Account> chaAccount(Model model);

	// 新建销售记录信息
	@Insert("insert into crm_sell_opportunity values(#{sellId},#{accountId},#{opportunitySource},#{customerName},#{successProbability},#{summary},#{contacts},#{contactsPhone},#{opportunityDescrible},#{creator},#{creationTime}"
			+ ",#{designatedPerson},#{designatedTime},#{distribution})")
	public void jianXiao(@Param("sellId") Integer sellId, @Param("accountId") Integer accountId,
			@Param("opportunitySource") String opportunitySource, @Param("customerName") String customerName,
			@Param("successProbability") Integer successProbability, @Param("summary") String summary,
			@Param("contacts") String contacts, @Param("contactsPhone") String contactsPhone,
			@Param("opportunityDescrible") String opportunityDescrible, @Param("creator") String creator,
			@Param("creationTime") String creationTime, @Param("designatedPerson") Integer designatedPerson,
			@Param("designatedTime") String designatedTime, @Param("distribution") String distribution);

	// 根据id查找出修改销售机会

	@Select("select *from crm_sell_opportunity where sell_id=#{sellId}")
	public List<SellOpportunity> chaXiuXiao(Integer sellId);

	// 查找出指派人回显姓名
	@Select("select*from crm_account where account_id=#{accountId}")
	public List<Account> chaAcount(Integer accountId);

	// 修改销售机会
	@Update("update crm_sell_opportunity set sell_id=#{sellId},sell_opportunity_source=#{opportunitySource},sell_customer_name=#{customerName},sell_success_probability=#{successProbability},sell_summary=#{summary},"
			+ "sell_contacts=#{contacts},sell_contacts_phone=#{contactsPhone},sell_opportunity_describe=#{opportunityDescrible},sell_creator=#{creator},sell_creation_time=#{creationTime},sell_designated_person=#{designatedPerson},sell_designated_time=#{designatedTime} where sell_id=#{sellId}")
	public void gaixiao(SellOpportunity sellOpportunity);

	/**
	 * @param kekai @param IYingXiaoMapper @return void @throws
	 */
	// 客户开发计划中查找所有的销售机会
	@Select("select*from crm_sell_opportunity where sell_designated_person>0")
	public List<SellOpportunity> kekai();

	// 客户计划中展示销售机会
	@Select("<script>" + "select *from crm_sell_opportunity" + "<where>"
	       +"<choose>"
	       + "<when test=\"clientName!=''\">"
			+ "and sell_customer_name=#{clientName} and account_id=#{accountId} and sell_designated_person>0 "
			+"</when>"
			+ "<when test=\" summary!=''\">"
			+ "and sell_summary=#{summary} and account_id=#{accountId} and sell_designated_person>0 " 
			+ "</when>"
			+ "<when test=\" contact!=''\">"
			+ "and sell_contacts=#{contact} and account_id=#{accountId} and sell_designated_person>0" 
			+ "</when>"
			+ "<when test=\"clientName != '' and summary!=''\">"
			+ "and sell_customer_name=#{clientName} and sell_summary=#{summary} and account_id=#{accountId} and sell_designated_person>0"
			+ "</when>"
			+ "<when test=\"clientName != '' and contact!=''\">"
			+ "and sell_customer_name=#{clientName} and sell_contacts=#{contact} and account_id=#{accountId} and sell_designated_person>0 "
			+ "</when>" 
			+ "<when test=\"contact!='' and summary!=''\">"
			+ "and sell_contacts=#{contact} and sell_summary=#{summary} and account_id=#{accountId} and sell_designated_person>0"
			+ "</when>"
			+ "<when test=\"contact!='' and summary!='' and clientName!='' \">"
			+ "and sell_contacts=#{contact} and sell_summary=#{summary} and account_id=#{accountId} and sell_customer_name=#{clientName} and sell_designated_person>0"
			+ "</when>"
			+ "</choose>" 
			+ "</where>" + "</script>")
	public List<SellOpportunity> kechaChance(@Param("clientName") String clientName, @Param("summary") String summary,
			@Param("contact") String contact, @Param("accountId") Integer accountId);

	// 根据id查找销售计划
	@Select("select*from crm_sell_opportunity where sell_id=#{sellId}")
	public List<SellOpportunity> zhiJi(Integer sellId);

	/**
	 * @param jiHUaXiang @param IYingXiaoMapper @return void @throws
	 */
	// 添加计划项
	@Insert("insert into crm_plan values(null,#{sellId},#{planDate},#{planProject},null)")
	public void jiHUaXiang(@Param("planDate") String planDate, @Param("planProject") String planProject,
			@Param("sellId") Integer sellId);

	/**
	 * @param chaJiHua @param IYingXiaoMapper @return List<Plan> @throws
	 */
	// 展示计划项
	@Results(id = "jihuaxiang", value = { @Result(property = "planId", column = "plan_id", id = true),
			@Result(property = "sellId", column = "sell_id"), @Result(property = "planDate", column = "plan_date"),
			@Result(property = "planProject", column = "plan_project"),
			@Result(property = "palnImplementationEffect", column = "plan_implementation_effect") })
	@Select("select *from crm_plan where sell_id=#{sellId}")
	public List<Plan> chaJiHua(Integer sellId);

	/**
	 * @param shanJiHua @param IYingXiaoMapper @return void @throws
	 */
	// 删除计划
	@Delete("delete from crm_plan where plan_id=#{planId}")
	public void shanJiHua(Integer planId);

	/**
	 * @param jianZhiXing @param IYingXiaoMapper @return void @throws
	 */
	// 保存执行效果
	@Update("update crm_plan set plan_implementation_effect=#{palnImplementationEffect} where plan_id=#{planId}")
	public void jianZhiXing(@Param("planId") Integer planId,
			@Param("palnImplementationEffect") String palnImplementationEffect);

	/**
	 * @param gaiStatus @param IYingXiaoMapper @return void @throws
	 */
	// 更改销售机会的状态
	@Update("update crm_sell_opportunity set sell_distribution='已开发' where sell_id=#{sellId}")
	public void gaiStatus(Integer sellId);

	/**
	 * @param zhuanKe @param IYingXiaoMapper @return void @throws
	 */
	// 把销售机会中已开发的用户添加到客户表中
	@Insert("insert into crm_client values(null,#{accountId},#{sellOpportunity.sellId},#{sellOpportunity.customerName},null,#{accountName},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null)")
	public void zhuanKe(@Param("sellOpportunity") SellOpportunity sellOpportunity,
			@Param("accountId") Integer accountId, @Param("accountName") String accountName);

	/**
	 * @param chazhang @param IYingXiaoMapper @return List<Account> @throws
	 */
	// 查找客户经理名字
	@Select("select *from crm_account where account_id=#{designatedPerson}")
	public List<Account> chazhang(Integer designatedPerson);

	/**
	 * @param chake @param IYingXiaoMapper @return List<Client> @throws
	 */
	// 根据sellid查找客户信息
	@Results(id = "chake", value = { @Result(property = "sellId", column = "client_id", id = true),
			@Result(property = "accountId", column = "account_id"),
			@Result(property = "sellId", column = "sell_id"),
			@Result(property = "clientName", column = "client_name"),
			@Result(property = "clientArea", column = "client_area"),
			@Result(property = "manager", column = "client_manager"),
			@Result(property = "clientGrade", column = "client_grade"),
			@Result(property = "clientSatisfaction", column = "client_satisfaction"),
			@Result(property = "clientCreditStatus", column = "client_credit_status"),
			@Result(property = "clientAddress", column = "client_address"),
			@Result(property = "clientPostalCode", column = "client_postal_code"),
			@Result(property = "clientPhoneNumber", column= "client_phone_number"),
			@Result(property = " clientFaxes", column = "client_faxes"),
			@Result(property = "clientWebsite", column = "client_website"),
			@Result(property = "clientBusinessLicense", column = "client_business_license"),
			@Result(property = " clientLegalPerson", column = "client_legal_person"),
			@Result(property = "clientRegisteredFund", column = "client_registered_fund"),
			@Result(property = "clientYearSalesVolume", column = "client_year_sales_volume"),
			@Result(property = "clientBankDeposit", column = "client_bank_deposit"),
			@Result(property = " clientBankAccount", column = "client_bank_account"),
			@Result(property = "clientLocalNumber", column = "client_local_number"),
			@Result(property = "clientNationalNumber", column = "client_national_number") })
	@Select("select *from crm_client where sell_id=#{ssellId}")
	public List<Client> chake(Integer sellId);

	/**
	 * @param tianke @param IYingXiaoMapper @return void @throws
	 */
	// 添加客户的联系人
	@Insert("insert into crm_contacts values(null,#{clientId},#{contacts},null,null,null,#{contactsPhone},null)")
	public void tianke(@Param("contacts") String contacts, @Param("contactsPhone") String contactsPhone,
			@Param("clientId") Integer clientId);

}
