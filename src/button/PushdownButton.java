package button;

import lightbulb.Lightbulb;

public class PushdownButton {

	private boolean switchStatus;
	private LightbulbInterface lightBulb;
	
	public PushdownButton() {
		switchStatus = false;
		lightBulb = new Lightbulb();
	}
	
	public void pushButton(){
		if(switchStatus)
		{
			lightBulb.off();
			System.out.println("Button switched to OFF");
			switchStatus = false;
		}
		else
		{
			lightBulb.on();
			System.out.println("Button switched to ON");
			switchStatus = true;
		}
	}
}
