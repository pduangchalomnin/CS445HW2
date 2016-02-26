package lightbulb;

import button.LightbulbInterface;

public class Lightbulb implements LightbulbInterface{
	
	public Lightbulb() {
		
	}
	
	public void on(){
		System.out.println("Lightbulb on");
	}

	public void off() {
		System.out.println("Lightbulb off.");
	}

}
