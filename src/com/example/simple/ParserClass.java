package com.example.simple;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;;

@Root(name="definitions",strict=false) 
public class ParserClass {
    
    @Element(name="process",required=true)
    private Process process;
    
    public Process GetProcess(){
		return process;
    }
}
