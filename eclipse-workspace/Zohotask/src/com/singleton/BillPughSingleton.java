package com.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {}
	private static class BillPughHolder{
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	public static BillPughSingleton getInstaceOfBillPugh() {
		return BillPughHolder.instance;
	}
	
}
