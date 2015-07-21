package com.zhangk.webtest.requeststring;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.zhangk.webtest.httpclient.HttpHelper;
import com.zhangk.webtest.httpclient.ResponseContent;

public class Test {
	public static void main(String[] args) {
		testUploadFile();
	}

	public static void testUploadFile() {
		try {
			String url = "http://localhost:8010/babysitter/UpoadServlet";
			Map<String, Object> paramsMap = new HashMap<String, Object>();
			paramsMap.put("filePath", new File("e:\\a.jpg"));
			ResponseContent ret = HttpHelper.postEntity(url, paramsMap);
			System.out.println(ret.getContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
