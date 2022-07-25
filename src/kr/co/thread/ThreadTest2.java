package kr.co.thread;

public class ThreadTest2 implements Runnable {
	
	@Override
	public void run() {
		this.getAlpha();
	}

	private void getAlpha() {
		
		for(int i = 'a'; i < 'z' + 1; i++) {
			System.out.println((char)i);
			
			try {
				Thread.sleep(501);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
