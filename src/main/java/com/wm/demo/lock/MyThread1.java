package com.wm.demo.lock;

public class MyThread1 implements Runnable {

	private MyLockService service;
	
	private MyThread1(MyLockService service) {
		this.service = service;
	}
	
	public static MyThread1 instance(MyLockService service) {
		return new MyThread1(service);
	}
	
	@Override
	public void run() {
		service.method1();
	}

}
