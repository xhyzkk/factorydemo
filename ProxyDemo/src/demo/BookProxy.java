package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookProxy implements InvocationHandler {
	
	private Object target;
	public Object bind(Object target){
		this.target = target;
		//ȡ�ô������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}

	//���÷���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("����ʼ");
		//ִ�з���
		result = method.invoke(target, args);
		System.out.println("�������");
		return result;
	}

}
