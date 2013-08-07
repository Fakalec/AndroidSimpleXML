package com.example.simple;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Entry {

   @Attribute
   private String key;

   @Element
   private String value;



   public String getValue() {
      return value;
   }
}
