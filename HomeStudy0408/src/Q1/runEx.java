package Q1;

import java.awt.Toolkit;

public class runEx extends Thread {

	@Override

	public void run() {

		Toolkit beep = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {

			beep.beep();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
