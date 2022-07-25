package kr.co.thread;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() {
		this.getNum();
	}
	
	private void getNum() {
		
		for(int i = 0; i < 26; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
