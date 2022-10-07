package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Person;

public interface PersonService {

	public Person getPersonInfo(String id);
	public String getPersonId(); //"ABC"
	public int getPersonAge();     //20
   //  定義 int  string 只能一個值  person的話就可以取得4個

	
	

}
