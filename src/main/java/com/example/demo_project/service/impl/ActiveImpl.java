package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.service.ifs.Active;

@Service
public class ActiveImpl implements Active {
	private Active active;

	@Override
	public void fly(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println("���a���a�p�p�t�z ");
		System.out.println("�W�l :" + name);
		System.out.println("�X�� :" + age);

	}
}
