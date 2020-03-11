package com.niit.assessment.toll.booth;

public class NissanTruck implements Truck
{

	private int noOfAxels;
	private float weight;

	public NissanTruck(int noOfAxels, float weight)
	{

		this.noOfAxels = noOfAxels;
		this.weight = weight;
	}

	private static String company = "Nissan";

	public static String getCompany()
	{
		return company;
	}

	public static void setCompany(String company)
	{
		NissanTruck.company = company;
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