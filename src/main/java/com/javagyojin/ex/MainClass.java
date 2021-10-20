package com.javagyojin.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplcationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());//ȫ�浿
		System.out.println(student1.getAge());//20
		System.out.println(student1.getHobbys());//����,�,��ȭ����
		System.out.println(student1.getHeight());//170
		System.out.println(student1.getWeight());//70
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());//�̼���
		System.out.println(student2.getAge());//40
		System.out.println(student2.getHobbys());//Ȱ���, �ϱ⾲��
		System.out.println(student2.getHeight());//180
		System.out.println(student2.getWeight());//80
		
		ctx.close();
		
	}

}
