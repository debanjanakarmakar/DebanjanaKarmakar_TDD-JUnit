package com.tdd.tddunittest;
import java.util.Scanner;
public class ManipulateString {

	public static String Manipulate(String s)
	{
		if(s.length()==1)
		{
			if(s.charAt(0)=='a')
			{
				return "";
			}
			else
			{
				return s;
			}
		}
		if(s.length()==0)
		{
			return s;
		}
		if(s.charAt(0)=='a')
		{
			s=s.substring(1);
			if(s.charAt(0)=='a')
				s=s.substring(1);
			return s;
		}
		if(s.charAt(1)=='a')
		{
			s=s.substring(0,1)+s.substring(2);
		}
		return s;
		
	}
	public static void main(String args[])
	{
		String s;
		System.out.println("Enter a string");
		Scanner sn=new Scanner(System.in);
		s=sn.next();
		sn.close();
		
	}
}
