package com.wm.demo.proxy.dynamicproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理工厂
 * @ClassName: com.wm.demo.proxy.dynamicproxy.ProxyFactory
 * @author: wm
 * @date: 2019年2月12日 上午9:16:02
 * @version : 1.0
 */
public class ProxyFactory<T> {

	private T target;
	
	public ProxyFactory(T target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), (Object proxy, Method method, Object[] args)->{
					System.out.println("==========JDK动态代理==========前");
					Object invoke = method.invoke(target, args);
					System.out.println("==========JDK动态代理==========后");
					return invoke;
				});
	}
	
}
