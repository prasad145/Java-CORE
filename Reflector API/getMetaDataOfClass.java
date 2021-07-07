package com.mypackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class Emp
{
	int empid;
	String name;
	
	Emp(int empid, String name)
	{
		this.empid = empid;
		this.name = name;
	}
	
	void ShowInfo()
	{
		System.out.println(empid + " "+ name);
	}
	
}
public class getMetaDataOfClass {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class name = Class.forName("com.mypackage.Emp");
		System.out.println(name.getName());
		System.out.println(name.getPackageName());
		System.out.println(name.getTypeName());
		
		System.out.println();
		
		System.out.println("Constructors Declared");
		Arrays.stream(name.getDeclaredConstructors()).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Methods Declared");
		Arrays.stream(name.getDeclaredMethods()).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Fields Declared");
		Arrays.stream(name.getDeclaredFields()).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Get Fields Metadata");
		Field[] f = name.getDeclaredFields();
		for(Field i: f)
		{
			System.out.println("------------------");
			System.out.println("type: "+ i.getType()+ "\n" +"name: " + i.getName() + "\n" + "Modifiers: "
		+ i.getModifiers());
		}
		
		System.out.println();
		
		System.out.println("Get Methods Metadata");
		Method[] m = name.getDeclaredMethods();
		for(Method i: m)
		{
			System.out.println("------------------");
			System.out.println(i.getName());
			System.out.println(i.getDefaultValue());
			System.out.println(i.getModifiers());
			System.out.println(i.getParameterCount());
			System.out.println(i.getReturnType());
		}
		
		System.out.println();
		
		System.out.println("Get Constructor Metadata");
		Constructor[] c = name.getDeclaredConstructors();
		for(Constructor i: c)
		{
			System.out.println("------------------");
			System.out.println(i.getName());
			System.out.println(i.getModifiers());
			System.out.println(i.getParameterCount());
			System.out.println(i.getDeclaringClass());
			
			System.out.println("\t~~~~~~~~~~~~~~~");
			System.out.println("\tPramenters");
			Parameter[] p = i.getParameters();
			for(Parameter j: p)
			{
				System.out.println("\t"+j);
			}
			
			System.out.println("\t~~~~~~~~~~~~~~~");
			System.out.println("\tParam Types");
			Class[] cc = i.getParameterTypes();
			for(Class j: cc)
			{
				System.out.println("\t"+j);
			}
		}
	}
}
