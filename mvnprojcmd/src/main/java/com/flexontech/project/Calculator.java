package com.flexontech.project;

public class Calculator {
	public static Integer sum(Integer x,Integer y) {
		if(x==null || y==null) {
			return null;
		}
		else {
			return x+y;
		}
	}
	
	public static Integer sub(Integer x, Integer y) {
		if(x==null || y==null) {
			return null;
		}
		else {
			return x-y;
		}
	}
	
	public static Integer mul(Integer x, Integer y) {
		if(x==null || y==null) {
			return null;
		}
		else {
			return x*y;
		}
	}
	
	public static Integer div(Integer x, Integer y) {
		if(x==null || y==null) {
			return null;
		}
		else {
			return x/y;
		}
	}
	
	public static Integer rem(Integer x, Integer y) {
		if(x==null || y==null) {
			return null;
		}
		else {
			return x%y;
		}
	}
	
	
	
	
}
