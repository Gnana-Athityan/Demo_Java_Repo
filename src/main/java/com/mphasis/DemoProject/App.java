package com.mphasis.DemoProject;

/**
 * Hello world!
 *
 */

interface Test{
	void Test1();
}
class A implements Test{
	public void Test1() {
		{
	        System.out.println( "Hello World!" );
	    }
	}
}
public class App 
{
	public static void addData(String Data) {
		System.out.println("Data "+Data);
		if (Data.equals("Mphasis")){
			System.out.println("Welcome");
		}
	}
	

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		System.out.println("Hello World Dev2");
    }
}
