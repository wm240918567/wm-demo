package com.wm.demo.proxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxyFactory<T> implements MethodInterceptor {

	private T target;
	
	private CglibProxyFactory(T target){
		this.target = target;
	}
	
	public static <T> CglibProxyFactory<T> instance(T target){
		return new CglibProxyFactory<>(target);
	}
	
	//给目标对象创建一个代理对象
    @SuppressWarnings("unchecked")
	public T getProxy(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return (T) en.create();
    }
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy mp) throws Throwable {
		System.out.println("==========cglib代理前");
		Object invoke = method.invoke(target, args);
		System.out.println("cglib代理后==========");
		return invoke;
	}

}
