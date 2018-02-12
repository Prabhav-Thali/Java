package com.psl.InnerclassDemo;

public class OuterClass {
	private int a = 10;

	void display() {
		// TODO Auto-generated method stub

		System.out.println("Outer class display" + a);
		InnerClass iobj = new InnerClass();
		iobj.display();
	}

	class InnerClass {

		void display() {
			// TODO Auto-generated method stub

			System.out.println("Inner class display" + a);
		}
	}

	public static void main(String[] args) {

		// OuterClass oc = new OuterClass();
		// oc.display();
		//
		// OuterClass.InnerClass iobj = oc.new InnerClass();// to create object
		// of
		// // inner class

		// OuterClass.InnerClass iobj=new OuterClass.InnerClass();
		// iobj.display();

		//

		OuterClass obj = new OuterClass() {
			@Override
			void display() {
				// TODO Auto-generated method stub
				System.out.println("anonymous");

			}
		};
		obj.display();

		MyInterface iobj = new MyInterface() {

			@Override
			public void Mydisplay() {
				// TODO Auto-generated method stub
				System.out.println("helloSsSsss");

			}
		};
		iobj.Mydisplay();
		// iobj is not an object of interface but it is a object of anonymos
		// inner class
	}
}
