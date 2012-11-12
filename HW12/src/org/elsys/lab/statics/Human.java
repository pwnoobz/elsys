package org.elsys.lab.statics;

public class Human {
	private String name;
	private String gender;
	
	public Human(String aname, String agender){
		name = aname;
		gender = agender;
	}
	public String getGender(){
		return gender;
	}
	public String getName(){
		return name;
	}
}
