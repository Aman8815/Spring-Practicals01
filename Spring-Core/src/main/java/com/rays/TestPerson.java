
package com.rays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("multi.xml"));

		Employee p = (Employee) factory.getBean("employee");

		System.out.println("person's Empname: " + p.getEmpName());
		System.out.println("person's salary: " + p.getSalary());
				System.out.println("-----");
		
		Person p1 = (Person) factory.getBean("Person");
		System.out.println("Person's id:" + p1.getId());
		System.out.println("person's name: " + p1.getName());
		System.out.println("person's address: " + p1.getSalary());
		
		System.out.println("------------");
		
		Doctor d =(Doctor) factory.getBean("Doctor");
		System.out.println("Doctor's id :"+d.getId());
		System.out.println("Doctor's name:"+d.getName());
		System.out.println("Doctor's S[ecilities:"+d.getSpecilites());
		
		System.out.println("--------");
		Patient p2 = (Patient) factory.getBean("patient");
		System.out.println("Patient id :"+p2.getId());
		System.out.println("Patient name:"+p2.getName());
		System.out.println("Patient Disease:"+p2.getDisease());
		

	}

}

