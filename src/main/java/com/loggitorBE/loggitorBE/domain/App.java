package com.loggitorBE.loggitorBE.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class App {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String name;
	String type;
	
	

    //private List<DefinedEvent> definedEvents = new ArrayList<DefinedEvent>();
	
	//empty constructor
	public App() {}



	public App(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}


	//getters and setters

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}





	
}
