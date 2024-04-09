package com.mythread;


public class PlayerThread extends Thread{

	public PlayerThread(ThreadGroup tg , String name) {
		super(tg,name);
	}
	
	@Override
	public void run() {
	for (int match = 0; match < 10; match++) {
		String msg = getName();
		msg += " -> played match" + match;
		System.out.println(msg);
	}
	}
	public static void main(String[] args) {
		ThreadGroup team = new ThreadGroup("team India");
		Thread t1 = new  Thread(team , "virat");
		Thread t2 = new  Thread(team , "rohit");
			
		t1.start();
		t2.start();
		System.out.println("ThreadGroup Info");
		System.out.println("Name : "+team.getName());
	System.out.println("Active Count : "+ team.activeCount());
	System.out.println(team.activeGroupCount());
	
	
	}
}
