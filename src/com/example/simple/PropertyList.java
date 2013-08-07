package com.example.simple;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;



@Root
public class PropertyList {

   @ElementList(type=PropertyList.class)
   private List<Entry> list;

   @Attribute
   private String name;

   public String getName() {
      return name;
   }
   

   public List<Entry> getProperties() {
      return list;
   }
}


