package com.psl.Generics;

public class Generics<T> {
	private T obj;
public Generics(T obj) {
	// TODO Auto-generated constructor stub
this.obj=obj;
}

public void setObj(T obj) {
	this.obj = obj;
}

public T getObj() {
	return obj;
}

public static void main(String[] args) {
	Generics<String> obj1=new Generics<String>(new String("Psl"));
	Generics<Integer> obj2=new Generics<Integer>(new Integer(10));
	String str=obj1.getObj();//Upcasting
	System.out.println(str);
	Integer str1=obj2.getObj();
	System.out.println(str1);//not possible as typecasting can be done in same family so
}
}
