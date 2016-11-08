package com.jinjiang.Json.string2json;

import net.sf.json.JSONObject;

public class String2Json {
	public static void main(String[] args) {
		System.out.println("json字符串转java代码");
		String jsonStr = "{\"password\":\"\",\"username\":\"张三\"}";		
		JSONObject jsonObj = JSONObject.fromString(jsonStr);
		System.out.println(jsonObj);
		String username = jsonObj.getString("username");
		String password = jsonObj.optString("password");
		System.out.println("json--->java\n username=" + username
		+ "\t password=" + password);
		}
}
