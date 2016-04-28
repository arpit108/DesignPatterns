package com.dp.creational.singelton;

public class Singelton2 {

	/*instance need to be volatile so that half read doesnt take place and read and write take place at same time*/
	private static volatile Singelton2 instance;
	
	private Singelton2()
	{
		
	}
	/*Double Locking Singelton */
	public static Singelton2 getInstance()
	{
		
		if(instance==null)
		{
			synchronized(Singelton2.class)
			{
				if(instance==null)
				{
					instance=new Singelton2();
					
				}
			}
			
			
		}
		
		
		return instance;
		
		
	}
	
	
	
	
}
