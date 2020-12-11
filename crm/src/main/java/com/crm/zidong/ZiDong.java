/**
 * 
 */
package com.crm.zidong;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.Resource;

import com.crm.mapper.IClientMapper;
import com.crm.pojo.Client;

/**
 * @author admin
 * @createTime 2020年12月9日下午8:04:04
 * @updateTime 2020年12月9日下午8:04:04
 * @version 1.0.0
 */
//自动查询6个月没有下单的，添加到客户流失表中
public class ZiDong {
	@Resource
	private static IClientMapper icm;

	public static void main(String[] args) {
		Date date = new Date();
		Date date1 = new Date(date.getTime() + 180 * 24 * 60 * 60 * 1000L);
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 final String format = d.format(date);
		final String format1 = d.format(date1);

		new Timer("timer-").schedule(new TimerTask() {
			@Override
			public void run() {
				List<Client> allClient = icm.chaAllClient();
				for (int i = 0; i < allClient.size(); i++) {
					if (icm.chaliushi(allClient.get(i).getClientId(), format, format1)== null) {
             			  icm.insertLossClient(allClient.get(i).getClientId(),allClient.get(i).getClientName(),allClient.get(i).getClientArea(),allClient.get(i).getClientAddress(),allClient.get(i).getAccountId());	
					 }

				}

			}
		}, 10000, 10000);

	}

}
