package com.tca.designpattern.creation.singleton;

/**
 * 懒汉式 + volatile + double-check(推荐)
 * @author zhoua
 *
 */
public class SingletonImpl3 {
	
	private SingletonImpl3(){}
	
	private static volatile SingletonImpl3 instance = null;
	
	public static SingletonImpl3 getIntance() {
		if (instance == null) {
			synchronized (SingletonImpl3.class) {
				if (instance == null) {
					instance = new SingletonImpl3();
				}
			}
		}
		return instance;
	}
}
