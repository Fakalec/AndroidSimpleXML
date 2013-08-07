package com.example.simple;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Attribute;

@Root(name="task")
public class Task {
	
	public Task(){
		
	}

	@Attribute
	private String id;
	
	@Attribute
	private String name;
	
	@Attribute
	private String completionQuantity;
	 
	@Attribute
	private String isForCompensation; 

	@Attribute
	private String startQuantity;
			 
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@ElementListUnion({
	      @ElementList(entry="incoming", type=String.class, inline=true,required=false),
	      @ElementList(entry="outgoing", type=String.class, inline=true,required=false),
	      @ElementList(entry="documentation", type=String.class, data=true, inline=true,required=false)
	})
	private List<Object> list;
	
	
	//@ElementList(name="docu",data=true,required=false)
	//private List<Documentation> listdocu;
			
	//@Element(name="documentation",data=true,required=false)
	//private String text;	
}
