package com.restapi.restapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "To Donts")
public class ToDont {
	@Id
	String id;
	String name;
	String toDont;

	// ask Dr. Smith why Spring would require an additional dummy constructor
	public ToDont() {
	}
	
	public ToDont(String name, String toDont) {
		this.name = name;
		this.toDont = toDont;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getToDont() {
		return toDont;
	}

	public void setID(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setToDont(String toDont) {
		this.toDont = toDont;
	}

}
