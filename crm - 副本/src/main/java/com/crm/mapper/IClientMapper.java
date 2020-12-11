/**
 * 
 */
package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;

import com.crm.pojo.Client;
import com.crm.pojo.ClientLoss;
import com.crm.pojo.ClientOrder;
import com.crm.pojo.ClientRecord;
import com.crm.pojo.Contacts;
import com.crm.pojo.GoodsInfo;
import com.crm.pojo.LossReason;

/**
 * @author admin
 * @createTime 2020年12月7日下午6:31:45
 * @updateTime 2020年12月7日下午6:31:45 
 * @version 1.0.0
 */
public interface IClientMapper {

	/**
	 * @param keXin
	 * @param IClientMapper 
	 * @return List<Client>
	 * @throws 
	 */
	//查找所有对应客户经理的客户
	@Select("select* from crm_client where account_id=#{accountId}")
	List<Client> keXin(Integer accountId);

	/**
	 * @param keXinCha
	 * @param IClientMapper 
	 * @return List<Client>
	 * @throws 
	 */
	//根据条件查找相应的客户信息
	
	@Select("<script>" + "select * from crm_client" + "<where>"
			+ "<if test=\"clientName != '' and clientArea!=''\">"
			+ "and client_name=#{clientName} and client_area=#{clientArea} and account_id=#{accountId} " + "</if>"
			+ "<if test=\"clientName != '' and clientLegalPerson!=''\">"
			+ "and client_name=#{clientName} and client_legal_person=#{clientLegalPerson} and account_id=#{accountId} " + "</if>"
			+ "<if test=\"clientLegalPerson!='' and clientArea!=''\">"
			+ "and client_legal_person=#{clientLegalPerson} and client_area=#{clientArea} and account_id=#{accountId} " + "</if>"
			+ "<if test=\"clientName!=''\">" + "and client_name=#{clientName} and account_id=#{accountId} "
			+ "</if>" + "<if test=\" clientArea!=''\">" + "and client_area=#{clientArea} and account_id=#{accountId} "
			+ "</if>" + "<if test=\" clientLegalPerson!=''\">" + "and client_legal_person=#{clientLegalPerson} and account_id=#{accountId} "
			+ "</if>" + "<if test=\"clientLegalPerson!='' and clientArea!='' and clientName!='' \">"
			+ "and client_legal_person=#{clientLegalPerson} and client_area=#{clientArea} and account_id=#{accountId} and client_name=#{clientName}"
			+ "</if>" + "</where>" + "</script>")
	List<Client> keXinCha(@Param("clientName")String clientName,@Param("clientArea") String clientArea, @Param("clientLegalPerson")String clientLegalPerson, @Param("accountId")Integer accountId);

	/**
	 * @param xiangXin
	 * @param IClientMapper 
	 * @return Client
	 * @throws 
	 */
	@Select("select *from crm_client where client_id=#{clientId}")
	Client xiangXin(Integer clientId);

	/**
	 * @param gaiKeXin
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	//更改客户信息
	@Update("update crm_client set client_name=#{clientName}, client_area=#{clientArea},client_grade=#{clientGrade},client_satisfaction=#{clientSatisfaction},client_credit_status=#{clientCreditStatus},client_address=#{clientAddress},client_postal_code=#{clientPostalCode},"
			+ "client_phone_number=#{clientPhoneNumber},client_faxes=#{clientFaxes},client_website=#{clientWebsite},client_business_license=#{clientBusinessLicense},client_legal_person=#{clientLegalPerson},"
			+ "client_registered_fund=#{clientRegisteredFund},client_year_sales_volume=#{clientYearSalesVolume},client_bank_deposit=#{clientBankDeposit},client_bank_account=#{clientBankAccount},client_local_number=#{clientLocalNumber},client_national_number=#{clientNationalNumber} where client_id=#{clientId}")
	void gaiKeXin(Client client);

	/**
	 * @param lianXiRen
	 * @param IClientMapper 
	 * @return List<Contacts>
	 * @throws 
	 */
	@Results(id = "lianxiren", value = { @Result(property = "contactsId", column = "contacts_id", id = true),
			@Result(property = "clientId", column = "client_id"),
			@Result(property = "contactsName", column = "contacts_name"),
			@Result(property = "contactsGender", column = "contacts_gender"),
			@Result(property = "contactsPosition", column = "contacts_position"),
			@Result(property = "contactsOfficeNumber", column = "contacts_office_number"),
			@Result(property = "contactsPhoneNumber", column = "contacts_phone_number"),
			@Result(property = "contactsRemarks", column = "contacts_remarks")})
	@Select("select *from crm_contacts where client_id=#{clientId}")
	List<Contacts> lianXiRen(Integer clientId);

	/**
	 * @param jianLXRen
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	//新建联系人
	@Insert("insert into crm_contacts values(null,#{clientId},#{contacts.contactsName},#{contacts.contactsGender},#{contacts.contactsPosition},#{contacts.contactsOfficeNumber},"
			+ "#{contacts.contactsPosition},#{contacts.contactsRemarks})")
	void jianLXRen(@Param("clientId")Integer clientId, @Param("contacts")Contacts contacts);

	/**
	 * @param shanLianXiRen
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	//删除联系人
	@Delete("delete from crm_contacts where contacts_id=#{contactsId}")
	void shanLianXiRen(Integer contactsId);

	/**
	 * @param xiuGai
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	//查找出要修改的
	@Select("select*from crm_contacts where contacts_id=#{contactsId}")
	Contacts xiuGai(Integer contactsId);

	/**
	 * @param jiaoangJiLu
	 * @param IClientMapper 
	 * @return List<ClientRecord>
	 * @throws 
	 */
	@Select("select*from crm_client_contact_record where client_id=#{clientId}")
	List<ClientRecord> jiaoangJiLu(Integer clientId);

	/**
	 * @param jianJiaoWangJL
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	//新建交往记录
	@Insert("insert into crm_client_contact_record values(null,#{client_id},#{record_date},#{record_place},#{record_summary},#{record_detailed_information},#{record_remark})")
	void jianJiaoWangJL(ClientRecord clientRecord);

	/**
	 * @param shanJiaoWangJL
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	//删除交往记录
	@Delete("delete from crm_client_contact_record where record_id=#{record_id}")
	void shanJiaoWangJL(Integer record_id);

	/**
	 * @param xiuGaiJiaoWang
	 * @param IClientMapper 
	 * @return ClientRecord
	 * @throws 
	 */
	//回显要修改的数据
	@Select("select *from crm_client_contact_record where record_id=#{record_id}")
	ClientRecord xiuGaiJiaoWang(Integer record_id);

	/**
	 * @param xiuGaiJiaoWangJL
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	@Update("update crm_client_contact_record set record_date=#{record_date},record_place=#{record_place},record_summary=#{record_summary},record_detailed_information=#{record_detailed_information},record_remark=#{record_remark}"
			+ "where record_id=#{record_id} ")
	void xiuGaiJiaoWangJL(ClientRecord clientRecord);

	/**
	 * @param showLiShiD
	 * @param IClientMapper 
	 * @return List<ClientOrder>
	 * @throws 
	 */
	//展示所有的历史订单
	@Results(id="alllidd",value = {
			@Result(property="order_id",column ="order_id",id=true),
			@Result(property="list",column="order_id",many = @Many(select ="com.crm.mapper.IClientMapper.allGoods",fetchType = FetchType.LAZY))
			
	})
	@Select("select *from crm_client_order where client_id=#{clientId} order by order_date")
	List<ClientOrder> showLiShiD(Integer clientId);

	@Select("select *from crm_goods_info where order_id=#{order_id}")
	List<GoodsInfo> allGoods(Integer order_id);

	/**
	 * @param dingDanXiangXi
	 * @param IClientMapper 
	 * @return List<ClientOrder>
	 * @throws 
	 */
	@Results(id="alllidd1",value = {
			@Result(property="order_id",column ="order_id",id=true),
			@Result(property="list",column="order_id",many = @Many(select ="com.crm.mapper.IClientMapper.allGoods1",fetchType = FetchType.LAZY))
			
	})
	@Select("select *from crm_client_order where client_id=#{clientId} and order_id=#{order_id}")
	List<ClientOrder> dingDanXiangXi(@Param("order_id")Integer order_id,@Param("clientId")Integer clientId);
	@Select("select *from crm_goods_info where order_id=#{order_id}")
	List<GoodsInfo> allGoods1(Integer order_id);

	/**
	 * @param chajia
	 * @param IClientMapper 
	 * @return Integer
	 * @throws 
	 */
	//查总价格
	@Select("select sum(goods_totle_price) from crm_goods_info where order_id=#{order_id}")
	Integer chajia(Integer order_id);

	/**
	 * @param chaAllClient
	 * @param IClientMapper 
	 * @return List<Client>
	 * @throws 
	 */
	//查询所有的用户
	@Select("select *from crm_client")
	List<Client> chaAllClient();

	/**
	 * @param chaliushi
	 * @param IClientMapper 
	 * @return Object
	 * @throws 
	 */
	@Select("select *from crm_client_order where order_date between #{date} and #{date1}")
	List<ClientOrder> chaliushi(@Param("clientId")Integer clientId,@Param("date")String date,@Param("date1") String date1);

	/**
	 * @param insertLossClient
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	@Insert("insert into crm_client_loss values(null,#{clientId},#{clientArea},#{cloentAddress},null,'暂缓流失',#{accountId})")
	void insertLossClient(@Param("clientId")Integer clientId,@Param("clientName") String clientName,@Param("clientArea") String clientArea,@Param("clientAddress") String clientAddress,@Param("accountId")Integer accountId);

	/**
	 * @param keHuLiuShi
	 * @param IClientMapper 
	 * @return List<ClientLoss>
	 * @throws 
	 */
	//查找对应的流失客户
	@Select("select*from crm_client_loss where account_id=#{accountId}")
	List<ClientLoss> keHuLiuShi(Integer accountId);

	/**
	 * @param zanHuanLiuShi
	 * @param IClientMapper 
	 * @return ClientLoss
	 * @throws 
	 */
	@Select("select *from crm_client_loss where loss_id=#{loss_id}")
	ClientLoss zanHuanLiuShi(Integer loss_id);

	/**
	 * @param yuanYin
	 * @param IClientMapper 
	 * @return LossReason
	 * @throws 
	 */
	@Select("select *from crm_client_loss_reason where loss_id=#{loss_id}")
	List<LossReason> yuanYin(Integer loss_id);

	/**
	 * @param zanHuanBao
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	@Insert("insert into crm_client_loss_reason values(#{loss_id},#{reason})")
	void zanHuanBao(@Param("loss_id")Integer loss_id,@Param("reason") String reason);

	/**
	 * @param shanLoss
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	@Update("update crm_client_loss set loss_status='确认流失',loss_affirm_date=#{date} where client_id=#{client_id}")
	void shanLoss(@Param("client_id")Integer client_id,@Param("date")String date );

	/**
	 * @param shanclient
	 * @param IClientMapper 
	 * @return void
	 * @throws 
	 */
	@Delete("delete from crm_client where client_id=#{client_id}")
	void shanclient(Integer client_id);
}
