package com.wm.demo.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestLock {

	public static void main(String[] args) {
		MyLockService myLockService = new MyLockService();
		MyThread1 m1 = MyThread1.instance(myLockService);
		MyThread2 m2 = MyThread2.instance(myLockService);
		
		new Thread(m1).start();
		new Thread(m2).start();
		
	
		
	}
}
