package unitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import button.Button;

public class ButtonTest {

	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	Button btn;
	
	/**
	 * Move system print into stream.
	 */
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outString));
	}
	
	@Before
	public void createButton(){
		btn = new Button();
	}
	
	/**
	 * Clean up streams.
	 */
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void testSwitchOnNormalCase(){
		btn.switchOn();
		assertEquals("Lightbulb on\nButton switched to ON", outString.toString().trim());
	}
	
	@Test
	public void testSwitchOnWhileStillOn(){
		btn.switchOn();
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		btn.switchOn();
		assertEquals("", outString.toString().trim());
	}
	
	@Test
	public void testSwitchOffNormalCase(){
		btn.switchOn();
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		btn.switchOff();
		assertEquals("Lightbulb off.\nButton switched to OFF", outString.toString().trim());
	}
	
	@Test
	public void testSwitchOffWhileStillOff(){
		btn.switchOff();
		assertEquals("", outString.toString().trim());
	}
}
