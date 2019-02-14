package com.wm.demo.lock;

public class MyThread2 implements Runnable {

	private MyLockService service;
	
	private MyThread2(MyLockService service) {
		this.service = service;
	}
	
	public static MyThread2 instance(MyLockService service) {
		return new MyThread2(service);
	}
	
	@Override
	public void run() {
		service.method2();
	}

}
