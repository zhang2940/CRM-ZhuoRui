/**
 * 
 */
package com.crm.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author admin
 * @createTime 2020年12月2日上午9:03:42
 * @updateTime 2020年12月2日上午9:03:42 
 * @version 1.0.0
 */
public interface IYingXiaoService {

	public String showChance(Model model,String accountId,Integer pageNum);
}
