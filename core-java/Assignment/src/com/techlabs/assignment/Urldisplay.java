package com.techlabs.assignment;

public class Urldisplay {
	public static void main(String args[]) 
	{
    	System.out.println(args[0]);
    	String[] split = args[0].split("[.?&]");
    	System.out.println(split[3]);
    	System.out.println(split[4]);
    	System.out.println("domain= "+split[1]);
	}
}
