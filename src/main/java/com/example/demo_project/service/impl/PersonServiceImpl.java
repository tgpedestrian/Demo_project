package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.ifs.PersonService;

@Service /// АUКо PersonServiceImpl
public class PersonServiceImpl implements PersonService {

//	@Autowired
	private Active active;

	@Override
	public Person getPersonInfo(String id) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setAge(20);
		person.setCity("tainan");
		person.setName("poop");
		person.setId("123456");
		return person;
	}

	public String getPersonId(Person person) {
		return person.getId();
	}

	public String getPersonName(Person person) {
		return person.getName();
	}

	public String getPersonCity(Person person) {
		return person.getCity();
	}

	public String getPersonAge(Person person) {
		return person.getName();
	}

	public void printPersonAttributes(Person person) {
//		Person per = new Person();
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println(person.getCity());
		System.out.println(person.getId());
	}
//
//
//	@Override
//	public String getPersonId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public int getPersonAge() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public String getPersonId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPersonAge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
