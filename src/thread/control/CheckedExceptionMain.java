package thread.control;

import static util.ThreadUtils.*;

import util.ThreadUtils;

public class CheckedExceptionMain {
	public static void main(String[] args) throws Exception {
		throw new Exception();
	}

	static class CheckedRunnable implements Runnable {
		@Override
		public void run() {
			sleep(1000);
		}
	}
}
