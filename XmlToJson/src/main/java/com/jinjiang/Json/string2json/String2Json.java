package com.jinjiang.Json.string2json;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class String2Json {
	public static void main(String[] args) {
		System.out.println("json字符串转java代码");
		String jsonStr = "{\"password\":\"111\",\"username\":\"张三\"}";
		JSONObject jsonObj = JSONObject.fromString(jsonStr);
		System.out.println(jsonObj);
		String username = jsonObj.getString("username");
		String password = jsonObj.optString("password");
		System.out.println("json--->java\n username=" + username + "\t password=" + password);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("java代码封装为json字符串");
		JSONObject jsonObj1 = new JSONObject();
		jsonObj1.put("username", "张三");
		jsonObj1.put("password", "321");
		System.out.println("java--->json \n" + jsonObj1.toString());
		
		System.out.println("----------------------------------------------------------------------------------");
		Map<String,String> map = new HashMap<>();
		map.put("name", "jerry");
		map.put("password", "312");
		JSONObject jsonObject = JSONObject.fromMap(map);
		System.out.println(jsonObject);
	}
}
