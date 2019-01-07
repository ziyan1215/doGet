package com.xz.unit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
* @author 作者
* @version 创建时间：2019年1月7日 下午2:18:37
* 类说明
*/
class HttpClientUtilTest {

	@Test
	void test() {
		HttpClientUtil http = new HttpClientUtil();
		Map<String, Object> hsm =new HashMap<String,Object>();
		//String userId = null;
		//String password = null;
		hsm.put("userId", "admin");
		hsm.put("password", "1");
		System.out.println(hsm.size());
		
	HttpClientUtil.doPost("http://192.168.2.117:8081/auth/login.do?login=",hsm,"UTF-8", false);
	}

}
