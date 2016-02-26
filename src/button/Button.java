package button;

import lightbulb.Lightbulb;

public class Button {

	private boolean btnStatus;
	private LightbulbInterface lightBulb;
	
	public Button(){
		btnStatus = false;
		lightBulb = new Lightbulb();
	}
	
	public void switchOn(){
		if(!btnStatus)
		{
			lightBulb.on();
			btnStatus = true;
			System.out.println("Button switched to ON");
		}
	}
	
	public void switchOff(){
		if(btnStatus)
		{
			lightBulb.off();
			btnStatus = false;
			System.out.println("Button switched to OFF");
		}
	}
	
}
