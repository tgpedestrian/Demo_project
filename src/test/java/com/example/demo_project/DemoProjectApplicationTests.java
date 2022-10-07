package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.service.ifs.Active;
//import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
class DemoProjectApplicationTests {

	@Autowired // 取出Service的東西
	private PersonService personService;
	@Autowired
	private Active VVVV;

	@Test // 測試程式 要加Test
	public void contexLoad() {
		VVVV.fly("sf", 50);
	}

}
