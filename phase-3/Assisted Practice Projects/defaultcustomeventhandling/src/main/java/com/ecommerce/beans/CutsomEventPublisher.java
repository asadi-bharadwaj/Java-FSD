package com.ecommerce.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CutsomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		// TODO Auto-generated method stub
		
	}
	public void publish(){
		CustomEvent ce=new CustomEvent(this);
		publisher.publishEvent(ce);
		
	}

}
