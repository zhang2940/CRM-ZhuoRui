package com.crm.service;

import java.util.List;

import org.springframework.ui.Model;

import com.crm.pojo.CrmInformation;

/**
 * desc：查询产品业务接口
 * @author wuxianfeng
 * @createTeime2020年12月6日 上午1:19:09
 * @updateTime 2020年12月6日 上午1:19:09
 * @version 1.0.0
 */
public interface IInformationService {
	/**
	 * desc:查询产品
	 * @param model
	 * @return
	 * @throws Exception
	 */
	String inquire(Model model,Integer pageNum)throws Exception;

	/**
	 * desc：根据条件查询
	 * @param model
	 * @param informationName
	 * @param informationModel
	 * @param informationBatch
	 * @return
	 */
	String inquir(Model model, String informationName, String informationModel, String informationBatch,Integer pageNum);

	
}
