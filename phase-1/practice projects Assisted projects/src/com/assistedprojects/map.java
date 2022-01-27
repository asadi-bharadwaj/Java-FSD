package com.assistedprojects;

import java.util.*;
import java.util.HashMap;
public class map {
	public static void main(String[] args) {
		//creating HashMap
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"bike");
		map1.put(2, "car");
		map1.put(3, "plane");
		System.out.println(map1);
		//hashtable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"bharat");  
	      ht.put(5,"bharat1");  
	      ht.put(6,"super");  
	      

	      System.out.println(ht);  
      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"pulsar");    
	      map.put(9,"apache");    
	      map.put(10,"ram");       
	      
	      System.out.println(map);  
	      

	         
	      }

		
	   }  
