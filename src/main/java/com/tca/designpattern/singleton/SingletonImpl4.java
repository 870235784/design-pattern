package com.tca.designpattern.singleton;

/**
 * 使用内部类
 * @author zhoua
 *
 */
public class SingletonImpl4 {

	private SingletonImpl4(){}
	
	private static class InstanceHolder {
		
		private static final SingletonImpl4 INSTANCE = new SingletonImpl4();
	}
	
	public static SingletonImpl4 getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
