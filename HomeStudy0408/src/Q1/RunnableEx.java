package Q1;

import java.awt.Toolkit;

public class RunnableEx {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				Toolkit beep = Toolkit.getDefaultToolkit();

				for (int i = 0; i < 5; i++) {

					beep.beep();

					try {Thread.sleep(2000);} catch (InterruptedException e) {}

				}

			}
		});

		thread.start();

		for (int i = 0; i < 5; i++) {

			System.out.println("띵 - - ");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}
}
