//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.11.08 ʱ�� 09:56:43 AM CST 
//

package com.jinjiang.xmlToClass.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * anonymous complex type�� Java �ࡣ
 * 
 * <p>
 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="employee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adress" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "employee" })
@XmlRootElement(name = "employees")
public class Employees {

	protected List<Employees.Employee> employee;

	/**
	 * Gets the value of the employee property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the employee property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEmployee().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Employees.Employee }
	 * 
	 * 
	 */
	public List<Employees.Employee> getEmployee() {
		if (employee == null) {
			employee = new ArrayList<Employees.Employee>();
		}
		return this.employee;
	}

	/**
	 * <p>
	 * anonymous complex type�� Java �ࡣ
	 * 
	 * <p>
	 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="adress" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "name", "sex", "age", "adress" })
	public static class Employee {

		@Override
		public String toString() {
			return "Employee [name=" + name + ", sex=" + sex + ", age=" + age + ", adress=" + adress + "]";
		}

		protected String name;
		protected String sex;
		protected String age;
		protected List<Employees.Employee.Adress> adress;

		/**
		 * ��ȡname���Ե�ֵ��
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getName() {
			return name;
		}

		/**
		 * ����name���Ե�ֵ��
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * ��ȡsex���Ե�ֵ��
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSex() {
			return sex;
		}

		/**
		 * ����sex���Ե�ֵ��
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSex(String value) {
			this.sex = value;
		}

		/**
		 * ��ȡage���Ե�ֵ��
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAge() {
			return age;
		}

		/**
		 * ����age���Ե�ֵ��
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAge(String value) {
			this.age = value;
		}

		/**
		 * Gets the value of the adress property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the adress property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAdress().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Employees.Employee.Adress }
		 * 
		 * 
		 */
		public List<Employees.Employee.Adress> getAdress() {
			if (adress == null) {
				adress = new ArrayList<Employees.Employee.Adress>();
			}
			return this.adress;
		}

		/**
		 * <p>
		 * anonymous complex type�� Java �ࡣ
		 * 
		 * <p>
		 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "country", "city", "street" })
		public static class Adress {

			protected String country;
			protected String city;
			protected String street;

			/**
			 * ��ȡcountry���Ե�ֵ��
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCountry() {
				return country;
			}

			/**
			 * ����country���Ե�ֵ��
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCountry(String value) {
				this.country = value;
			}

			/**
			 * ��ȡcity���Ե�ֵ��
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCity() {
				return city;
			}

			/**
			 * ����city���Ե�ֵ��
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCity(String value) {
				this.city = value;
			}

			/**
			 * ��ȡstreet���Ե�ֵ��
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getStreet() {
				return street;
			}

			/**
			 * ����street���Ե�ֵ��
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setStreet(String value) {
				this.street = value;
			}

			@Override
			public String toString() {
				return "Adress [country=" + country + ", city=" + city + ", street=" + street + "]";
			}

		}

	}

	@Override
	public String toString() {
		return "Employees [employee=" + employee + "]";
	}

}
