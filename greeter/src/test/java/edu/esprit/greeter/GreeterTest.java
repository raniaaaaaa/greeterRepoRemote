package edu.esprit.greeter;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreeterTest {
	Greeter greeter;
	@Before
	public void Setup(){
		greeter=new Greeter();
	}
	@Test
	public void itShouldSayHelloWorld(){
		String result = greeter.sayHello("world");
		Assert.assertEquals("Helloworld", result);
	}
	@Test(expected=IllegalArgumentException.class)
	public void itshouldRaiseException(){
		String param= "MAN";
		greeter.sayHello(param);
	}
	@After 
	public void tearDown(){
		
	}
	
}
