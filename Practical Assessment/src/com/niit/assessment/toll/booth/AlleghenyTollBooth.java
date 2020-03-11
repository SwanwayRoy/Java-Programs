package com.niit.assessment.toll.booth;

public class AlleghenyTollBooth implements TollBooth {

	static private double totalReciepts = 0;
	static private int noOfTrucks = 0;

	public double getTotalReciepts()
	{
		return totalReciepts;
	}

	public int getNoOfTrucks()
	{
		return noOfTrucks;
	}

	@Override
	public float clacToll(Truck t)
	{
		float total = (t.getAxels() * 5) + ((t.calWeight() / 1000) * 10);
		this.noOfTrucks += 1;
		this.totalReciepts += total;
		return total;
	}

	@Override
	public void displayData()
	{
		System.out.println("Total Collection :" + this.totalReciepts);
		System.out.println("Total No of Trucks :" + this.noOfTrucks);

	}

	public void cashDrawerRemoved()
	{
		System.out.println("--Empting CashBox--");
		System.out.println("Total Collection was : " + this.totalReciepts);
		System.out.println("Total No of Trucks was : " + this.noOfTrucks);
		this.noOfTrucks = 0;
		this.totalReciepts = 0;
	}
}