package com.dp.creational.singelton;

/*Lazy Initialization and Thread Safe*/

public class Singelton {

	private Singelton()
	{
		
	}
	
	private static class Inner
	{
		private static final Singelton instance=new Singelton();
	}
	
	public static Singelton getInstance()
	{
		return Singelton.Inner.instance;
	}
}
