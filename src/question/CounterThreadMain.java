package question;

import static util.MyLogger.*;

public class CounterThreadMain{
	public static void main(String[] args){
		CounterThread counterThread = new CounterThread();
		counterThread.start();
	}

	static class CounterThread extends Thread{
		@Override
		public void run(){
			for (int i = 1; i <= 5; i++){
				log("value: " + i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}
