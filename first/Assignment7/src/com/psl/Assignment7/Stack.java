package com.psl.Assignment7;

public class Stack extends Contact {
	int max = 3, top = -1, v = 0;
	Contact c[] = new Contact[3];

	public void pop() {
		// TODO Auto-generated method stub
		int t = top;
		try {

			if (t == -1) {
				throw new stackUnderflow();
			}
		} catch (stackUnderflow u) {
			u.printStackTrace();
		}
		if (c[t] == null) {
			try {
				throw new nullexception();
			} catch (nullexception e) {
				// TODO Auto-generated catch block
				System.out.println("initialise the objects");
			}
		} else {
			top--;
			System.out.println(top);
		}

	}

	public void push() {
		// TODO Auto-generated method stub
		top = top + 1;
		try {
			c[top] = new Contact();
			if (c[top] == null) {
				top--;
				throw new nullexception();
			} else {
				v = c[top].checkEmpty();
				if (v >= 1) {
					top--;
					System.out.println("not valid");
				} else
					System.out.println("pushed");
			}
		} catch (nullexception n) {
			System.out.println("initialise the objects");
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push();
		s.push();
		s.pop();
	}

}
