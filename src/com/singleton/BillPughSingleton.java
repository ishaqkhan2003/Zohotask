package com.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable {
	private BillPughSingleton() {
		if(BillPughHolder.instance!= null) {
			throw new RuntimeException();
		}
	
	}
	private static class BillPughHolder {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	public static BillPughSingleton getInstanceOfBillPugh() {
		return BillPughHolder.instance;
	}
	protected Object readResolve() {
		return getInstanceOfBillPugh();
	}
}
