package com.example.simple;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

public class SequenceFlow {
	@Attribute(name="id")
	private String id;
	
	@Attribute(name="sourceRef")
	private String sourceRef;
	
	@Attribute(name="targetRef")
	private String targetRef;
	 
	@Attribute(name="name",required=false)
	private String name;
	
	public String GetSeqFlowName(){
		return name;
	}
	
	@ElementListUnion({
	      @ElementList(entry="documentation", type=String.class, data=true, inline=true,required=false),
	})
	private List<Object> list;
}
