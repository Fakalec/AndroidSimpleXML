package com.example.simple;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Attribute;

@Root(name="exclusiveGateway")
public class ExclusiveGateway {
	
	@Attribute(name="gatewayDirection")
	private String gatewayDirection;
	
	@Attribute(name="id")
	private String id;	
	
	@Attribute(name="name")
	private String name;	
	
	//@ElementListUnion({
	//      @ElementList(entry="incoming", type=Incoming.class, inline=false,required=false),
	//      @ElementList(entry="outgoing", type=Outgoing.class, inline=false,required=false),
	//      @ElementList(entry="documentation", type=String.class, data=true, inline=true,required=false)
	//})
	//private List<Object> list;
	
	@ElementListUnion({
	      @ElementList(entry="incoming", type=String.class, inline=true,required=false),
	      @ElementList(entry="outgoing", type=String.class, inline=true,required=false),
	      @ElementList(entry="documentation", type=String.class, data=true, inline=true,required=false)
	})
	private List<Object> list;	
}
