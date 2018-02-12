package com.psl.interfaceDemo;

import com.psl.employee.Dev;
import com.psl.vehicle.Fwheeler;

public class Client {
	public static void main(String[] args) {
Printable p=new Dev();
p.print();

p=new Fwheeler();
p.print();
	}
}
