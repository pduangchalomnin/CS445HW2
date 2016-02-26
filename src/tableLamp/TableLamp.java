package tableLamp;

import button.Button;
import button.PushdownButton;

public class TableLamp {

	public static void main(String[] args) {
		
		Button btn = new Button();
		PushdownButton pushBtn = new PushdownButton();

		btn.switchOn();
		btn.switchOff();
		
		pushBtn.pushButton();
		pushBtn.pushButton();
		

	}

}
