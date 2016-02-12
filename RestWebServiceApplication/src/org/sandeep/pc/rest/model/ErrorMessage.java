package org.sandeep.pc.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String id;
	private String message;
	private String document;
	
	public ErrorMessage() {
		super();		
	}

	public ErrorMessage(String id, String message, String document) {
		super();
		this.id = id;
		this.message = message;
		this.document = document;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
	
	
}
