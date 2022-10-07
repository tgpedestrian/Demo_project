package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.service.ifs.Active;

@Service
public class ActiveImpl implements Active {
	private Active active;

	@Override
	public void fly(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println("飛吧飛吧小小宇宙 ");
		System.out.println("名子 :" + name);
		System.out.println("幾歲 :" + age);

	}
}
