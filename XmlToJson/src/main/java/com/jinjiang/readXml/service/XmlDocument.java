package com.jinjiang.readXml.service;


/**
 * 
 * @author jerry.zhang
 *
 */
public interface XmlDocument {
	
	/**
	 * 建立xml文档
	 * @param fileName
	 */
	public void createXml(String fileName);
	
	/**
	 * 解析xml文档
	 * @param fileName
	 */
	public void parserXml(String fileName);
	
}
