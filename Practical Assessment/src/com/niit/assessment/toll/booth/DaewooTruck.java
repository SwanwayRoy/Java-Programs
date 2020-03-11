package com.niit.assessment.toll.booth;

public class DaewooTruck implements Truck
{

	private int noOfAxels;
	private float weight;

	public DaewooTruck(int noOfAxels, float weight)
	{

		this.noOfAxels = noOfAxels;
		this.weight = weight;
	}

	private static String company = "Daewoo";

	public static String getCompany()
	{
		return company;
	}

	public static void setCompany(String company)
	{
		DaewooTruck.company = company;
	}

	@Override
	public int getAxels()
	{
		// TODO Auto-generated method stub
		return this.noOfAxels;
	}

	@Override
	public float calWeight()
	{
		// TODO Auto-generated method stub
		return this.weight;
	}
}