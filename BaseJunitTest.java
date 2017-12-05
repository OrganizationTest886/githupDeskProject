
/**  
* @Title: AssessCostServiceTest.java
* @Package: com.bs.etxc.chargingsoft.service
* @Description: TODO
* @author: bskj81
* @date: 2016年10月13日 上午11:30:24
* @version: V1.0  
*/ 
package com.zhbc.base;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhht.app.entity.AppBalance;
import com.zhht.app.service.AppBalanceService;

/**
 * 单元测试基础类
 * @moudle: BaseJunitTest 
 * @version:v1.0
 * @Description: TODO
 * @author: xubin
 * @date: 2016年10月13日 上午11:30:24
 *
 */
@RunWith(JUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration({"classpath*:spring-mvc.xml"})  
public class BaseJunitTest extends AbstractJUnit4SpringContextTests{
    
    /*@Test
    public void test(){
        logger.info("单元测试启动...");
    }*/
    
    @Autowired  
	private AppBalanceService appBalanceService; 
	
	Map<String, Object> map = new HashMap<String, Object>();
	int pageNum =1;
	int pageSize=10;
	@Test
	public void test() throws Exception {
		/*List<AppBalance> queryList = appBalanceService.queryList(map, pageNum, pageSize);
		System.out.println("========"+queryList.size());*/
		// 获得用户帐号的余额
		Map<String, Object> bmap = new HashMap<String, Object>();
		bmap.put("appUserId", "d9793e87_7d20_11e5_a40d_44a8422565ee");
		AppBalance selectOne = appBalanceService.queryOne(bmap);
		System.out.println("-------------"+selectOne.getMoney());
		//System.in.read(); 
	}
    
   
}
