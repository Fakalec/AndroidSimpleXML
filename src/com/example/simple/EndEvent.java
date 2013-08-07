package com.example.simple;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

@Root(name="endEvent")
public class EndEvent {

	@Attribute(name="id",required=true)
	private String id;
	
	@Attribute(name="name",required=false)
	private String name;
	
	
	@ElementListUnion({
	      @ElementList(entry="incoming", type=String.class, inline=true, required=true),
	})
	
	private List<Object> list;
	
	/*@Element(name="incoming")
	private String incoming;*/	
}
