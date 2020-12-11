package com.crm.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.crm.mapper.IIformationMapper;
import com.crm.pojo.CrmInformation;
import com.crm.service.IInformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * decs:查询产品信息实现类
 * @author wuxianfeng
 * @createTeime2020年12月6日 上午1:16:34
 * @updateTime 2020年12月6日 上午1:16:34
 * @version 1.0.0
 */
@Service
public class InformationServiceImpl implements IInformationService{
	//注入数据访问接口对象
	@Resource
	private IIformationMapper iiformtionMapper;
	
	@Override
	public String inquire(Model model,Integer pageNum) {
		//判断是否获得页码
		pageNum = pageNum==null ? 1 : pageNum;
		//启动 页码
		PageHelper.startPage(pageNum, 4);
		//查询数据
		List<CrmInformation> list =iiformtionMapper.inquire();
		PageInfo<CrmInformation> pageInfo = new PageInfo<CrmInformation>(list,10);
		model.addAttribute("list",list);
		model.addAttribute("pageInfo", pageInfo);
		return "information";
	}
	@Override
	public String inquir(Model model,String informationName,String informationModel,String informationBatch,Integer pageNum) {
		//判断是否获得页码
		pageNum = pageNum==null ? 1 : pageNum;
		//启动 页码
		PageHelper.startPage(pageNum, 4);
		//查询名称，型号， 等级/批次获得对象
		List<CrmInformation> list =iiformtionMapper.iquir(informationName, informationModel, informationBatch);
		PageInfo<CrmInformation> pageInfo = new PageInfo<CrmInformation>(list,10);
		model.addAttribute("list",list);
		model.addAttribute("pageInfo", pageInfo);
		return "information";
	}
	
	
}
