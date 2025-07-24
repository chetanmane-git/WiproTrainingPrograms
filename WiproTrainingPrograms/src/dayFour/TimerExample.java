package dayFour;

import java.util.Timer;
import java.util.TimerTask;

abstract class TaskRemainder {
	abstract void remaind();
}

class MyReminder extends TaskRemainder {
	@Override
	void remaind() {
		System.out.println(" Reminder: It's been 1 hour. Time to check your next task!");
	}
}

public class TimerExample {
	public static void main(String[] args) {
		MyReminder reminder = new MyReminder();
		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {					
			public void run() {
				reminder.remaind(); 
			}
		}, 0, 3600000); 
	}
}
