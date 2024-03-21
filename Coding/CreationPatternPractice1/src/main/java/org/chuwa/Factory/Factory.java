package org.chuwa.Factory;

public class Factory {
	public Obj ObjFactory(String type) {
		Obj obj = null;
		if ("ObjA".equals(type)) {
			obj = new ObjA();
		} else if ("ObjB".equals(type)) {
			obj = new ObjB();
		} else throw new RuntimeException("Invalid type");
		return obj;
	}
}
