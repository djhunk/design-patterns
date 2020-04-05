package com.myproject.designpatterns.singleton;

/**
 * Singleton design patterns :
 * - Ensure a class has only one instance, and provide a global point of access to it.
 * - lazy initialization and global access are necessary.
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {}

	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
