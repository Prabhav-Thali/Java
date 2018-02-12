package com.psl.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Vehicle> Vlist = new ArrayList<Vehicle>();
		List<FourWheeler> flist = new ArrayList<FourWheeler>();
		List<TwoWheeler> tlist = new ArrayList<TwoWheeler>();
		List<AudiQ7> alist = new ArrayList<AudiQ7>();
		List<Employee> elist = new ArrayList<Employee>();

		Vlist.add(new Vehicle());
		flist.add(new FourWheeler());
		tlist.add(new TwoWheeler());
		alist.add(new AudiQ7());

		showVehicle(Vlist);

		showVehicle(flist);
		showVehicle(tlist);
		showVehicle(alist);
		showVehicle(elist);

	}

	private static void showVehicle(List<? > vlist) {
		// TODO Auto-generated method stub

	}

}
