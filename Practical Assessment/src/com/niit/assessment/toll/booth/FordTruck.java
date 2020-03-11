package com.niit.assessment.toll.booth;

public class FordTruck implements Truck
{

	private int noOfAxels;
	private float weight;

	static String company = "Ford";

	@Override
	public int getAxels()
	{
		// TODO Auto-generated method stub
		return noOfAxels;
	}

	@Override
	public float calWeight()
	{
		// TODO Auto-generated method stub
		return weight;
	}

	public FordTruck(int noOfAxels, float weight)
	{
		super();
		this.noOfAxels = noOfAxels;
		this.weight = weight;
	}
}