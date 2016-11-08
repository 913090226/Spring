package com.jinjiang.xmlToClass.dto;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.sf.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xml转换成bean  
        try {  
            File file = new File("./src/main/resources/files/text.xml");  
            JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);  
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
            Employees a = (Employees) jaxbUnmarshaller.unmarshal(file);  
            System.out.println(a.toString());  
            
            //转为json对象
            JSONObject json = JSONObject.fromObject(a);
            System.out.println(json.toString());
        } catch (JAXBException e) {  
            e.printStackTrace();  
        }  
	}
}
