package com.example.simple;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Attribute;

public class StartEvent {

	@Attribute(name="id",required=false)
	private String id;

	@Attribute(name="name",required=false)
	private String name;
	
	@Attribute(name="isInterrupting",required=false)
	private String isInterrupting;
	
	@Attribute(name="parallelMultiple",required=false)
	private String parallelMultiple;
	
	@Element(name="documentation",required=false)
	private String documentation;

	@Element(name="outgoing",required=true)
	private String outgoing;	

}
