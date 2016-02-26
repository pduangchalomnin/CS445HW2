package unitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import button.PushdownButton;

public class PushdownButtonTest {

	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	PushdownButton btn;
	
	/**
	 * Move system print into stream.
	 */
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outString));
	}
	
	@Before
	public void createPushdownButton(){
		btn = new PushdownButton();
	}
	
	/**
	 * Clean up streams.
	 */
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void testFirstPush(){
		btn.pushButton();
		assertEquals("Lightbulb on\nButton switched to ON", outString.toString().trim());
	}
	
	@Test
	public void testSecoundPush(){
		btn.pushButton();
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		btn.pushButton();
		assertEquals("Lightbulb off.\nButton switched to OFF", outString.toString().trim());
	}

}
