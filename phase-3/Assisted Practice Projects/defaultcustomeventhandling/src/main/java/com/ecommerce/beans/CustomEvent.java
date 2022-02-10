package com.ecommerce.beans;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	public String tostring()
	{
		return "this is a custom event";
	}

}
