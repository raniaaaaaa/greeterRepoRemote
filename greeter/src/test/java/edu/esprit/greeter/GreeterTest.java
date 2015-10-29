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
	public void itShouldSayHelloJAVA(){
		String result = greeter.sayHello("JAVA");
		Assert.assertEquals("Hello java1", result);
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
