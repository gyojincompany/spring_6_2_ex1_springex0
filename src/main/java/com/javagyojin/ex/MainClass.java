package com.javagyojin.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplcationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getAge());//20
		System.out.println(student1.getHobbys());//수영,운동,영화감상
		System.out.println(student1.getHeight());//170
		System.out.println(student1.getWeight());//70
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());//이순신
		System.out.println(student2.getAge());//40
		System.out.println(student2.getHobbys());//활쏘기, 일기쓰기
		System.out.println(student2.getHeight());//180
		System.out.println(student2.getWeight());//80
		
		ctx.close();
		
	}

}
