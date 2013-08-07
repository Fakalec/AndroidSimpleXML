package com.example.simple;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

@Root(name="process")
public class Process {

	public Process() {
		super();
		//this.tasks = null;
		//this.exclusiveGateways = null;
	}  
		
	
	@Attribute(name="exporter",required=false)
	private String exporter;
		
	@Attribute(name="exporterVersion",required=false)
	private String exporterVersion;
	
	@Attribute(name="expressionLanguage",required=false)
	private String expressionLanguage;
	
	@Attribute(name="name",required=false)
	private String name;
	
	@Attribute(name="targetNamespace",required=false)
	private String targetNamespace;
	
	@Attribute(name="typeLanguage",required=false)
	private String typeLanguage;
		
	@Attribute(name="schemaLocation",required=false)
	private String schemaLocation;
	
	@Attribute(name="id",required=false)
	private String id;
	
	@Attribute(name="isClosed",required=false)
	private String isClosed;
	
	@Attribute(name="isExecutable",required=false)
	private String isExecutable;
	
	@Attribute(name="processType",required=false)
	private String processType;
	
		
	@Element(name="startEvent",required=true)
	private StartEvent startEvent;
	   
	public StartEvent getStartEvent() {
		return startEvent;           
	}	
	
	@Element(name="endEvent",required=true)
	private EndEvent endEvent;
	   
	public EndEvent getEndEvent() {
		return endEvent;           
	}		
	
	@ElementListUnion({
	      @ElementList(entry="task", type=Task.class, inline=true,required=false),
	      @ElementList(entry="exclusiveGateway", type=ExclusiveGateway.class, inline=true,required=false),
	      @ElementList(entry="sequenceFlow", type=SequenceFlow.class, inline=true,required=false),
	})
	private List<Object> list;
	
	public List<Object> getList() {
		return list;           
	}		
}
