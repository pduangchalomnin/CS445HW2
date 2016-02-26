package unitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import button.LightbulbInterface;
import lightbulb.Lightbulb;

public class LightbulbTest {

	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	LightbulbInterface lightbulb;
	
	/**
	 * Move system print into stream.
	 */
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outString));
	}
	
	@Before
	public void createLightbulb(){
		lightbulb = new Lightbulb();
	}
	
	/**
	 * Clean up streams.
	 */
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void testOn() {
		lightbulb.on();
		assertEquals(outString.toString().trim(), "Lightbulb on");
	}

	@Test
	public void testOff(){
		lightbulb.off();
		assertEquals(outString.toString().trim(), "Lightbulb off.");
	}
}
