/**
 * 
 */
package com.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.Impl.YingXiaoServiceImpl;


/**
 * @author admin
 * @createTime 2020年12月1日下午7:47:10
 * @updateTime 2020年12月1日下午7:47:10 
 * @version 1.0.0
 */
@Controller
@SessionAttributes({"showlist","pageInfo"})
public class YingXiaoController {
	@Resource
	YingXiaoServiceImpl yx;
	//展示出销售机会列表
	@RequestMapping("/show.do")
	public String showChance(Model model,@RequestParam("accountId") String accountId,Integer pageNum) {
		return yx.showChance(model, accountId,pageNum);
		}
	
	

}
