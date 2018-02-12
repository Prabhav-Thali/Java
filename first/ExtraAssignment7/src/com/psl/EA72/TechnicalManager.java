package com.psl.EA72;

public class TechnicalManager {
	private int NoOfEmployeeReporting, promotionsTillDate, NoOfProjects;
	private String WorkPlace;

	public int getNoOfEmployeeReporting() {
		return NoOfEmployeeReporting;
	}

	public void setNoOfEmployeeReporting(int noOfEmployeeReporting) {
		NoOfEmployeeReporting = noOfEmployeeReporting;
	}

	public int getPromotionsTillDate() {
		return promotionsTillDate;
	}

	public void setPromotionsTillDate(int promotionsTillDate) {
		this.promotionsTillDate = promotionsTillDate;
	}

	public int getNoOfProjects() {
		return NoOfProjects;
	}

	public void setNoOfProjects(int noOfProjects) {
		NoOfProjects = noOfProjects;
	}

	public String getWorkPlace() {
		return WorkPlace;
	}

	public void setWorkPlace(String workPlace) {
		WorkPlace = workPlace;
	}

	public TechnicalManager() {
		// TODO Auto-generated constructor stub
		this.NoOfEmployeeReporting = 0;
		this.WorkPlace = null;
		this.promotionsTillDate = 0;
		this.NoOfProjects = 0;
	}

	TechnicalManager(int noOfEmp, String place, int noOfProm, int noOfProjs) {
		NoOfEmployeeReporting = noOfEmp;
		WorkPlace = place;
		promotionsTillDate = noOfProm;
		NoOfProjects = noOfProjs;
	}

	public static void main(String[] args) {
		TechnicalManager tm[] = new TechnicalManager[5];
		tm[0] = new TechnicalManager(10, "Verna", 14, 5);
		tm[1] = new TechnicalManager(15, "Panjim", 0, 2);
		tm[2] = new TechnicalManager(30, "Margao", 9, 7);
		tm[3] = new TechnicalManager(40, "Mumbai", 10, 10);
		tm[4] = new TechnicalManager(12, "Mapusa", 11, 1);

		for(int i=0;i<tm.length;i++){
			if(tm[i].promotionsTillDate==0||tm[i].NoOfProjects==0)
			{
				try {
					throw new  MyCustomException();
				} catch (MyCustomException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 if(tm[i].promotionsTillDate>10){
				System.out.println("\nDetails of managers are:"+"\nNo. of employees reporting: "+tm[i].NoOfEmployeeReporting+"\nNo. of Projects are: "+tm[i].NoOfProjects+"\nNo.of Promotions till date "+tm[i].promotionsTillDate+"\nWorkplace is: "+tm[i].WorkPlace);
			}
		}
	}

}
