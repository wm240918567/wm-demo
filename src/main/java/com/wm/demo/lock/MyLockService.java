package com.wm.demo.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLockService {

	private Lock lock = new ReentrantLock();
	
	public void method1() {
		
		System.out.println("method1 start threadName:"+Thread.currentThread().getName());
		
		try {
			lock.lock();
			for(int i=0;i<5;i++) {
				System.out.println("threadname:"+Thread.currentThread().getName()+"--"+i);
				Thread.sleep(1000);
			}
			System.out.println("method1 end threadName:"+Thread.currentThread().getName());

		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
		
	}
	
	public void method2() {
		System.out.println("method2 start threadName:"+Thread.currentThread().getName());

		
		try {
			lock.lock();
			for(int i=0;i<5;i++) {
				System.out.println("threadname:"+Thread.currentThread().getName()+"--"+i);
				Thread.sleep(1000);
			}
			
			System.out.println("method2 end threadName:"+Thread.currentThread().getName());

		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
		
	}
	
}
