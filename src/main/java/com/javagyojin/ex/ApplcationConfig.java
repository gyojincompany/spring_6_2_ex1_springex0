package com.javagyojin.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplcationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("�");
		hobbys.add("��ȭ����");
		
		Student student = new Student("ȫ�浿",20,hobbys);
		
		student.setHeight(170);
		student.setWeight(70);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("Ȱ���");
		hobbys.add("�ϱ⾲��");		
		
		Student student = new Student("�̼���",40,hobbys);
		
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}

	

}