package com.techlabs.test;
import com.techlabs.rectangle.*;

public class RectangleTest {
	public static void main(String args[])
	{
		Rectangle big = new Rectangle();
		Rectangle small =new Rectangle();
		
		big.height =-10;
		big.width =50;
		
		small.height=5;
		small.width=10;
		
		System.out.println("height of big rectangle:"+big.height+" width of big rectangle:"+big.width);
		System.out.println("area of big reactangle:"+big.calculateArea());
		System.out.println("\nheight of small rectagle:"+small.height+" width of small rectangle:"+small.width);
		System.out.println("area of small reactangle:"+small.calculateArea());
		
		
	}
}
