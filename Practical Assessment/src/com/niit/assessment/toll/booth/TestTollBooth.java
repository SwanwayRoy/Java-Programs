package com.niit.assessment.toll.booth;

public class TestTollBooth
{
	public static void main(String[] args)
	{
		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
		System.out.println("Axels:" + ford.getAxels() + " Weight: "
				+ ford.calWeight() + " Total Due :" + booth.clacToll(ford));
		
		Truck nissan = new NissanTruck(5, 15000); // 2 axles and 5000kg
		System.out.println("Axels:" + nissan.getAxels() + " Weight: "
				+ nissan.calWeight() + " Total Due :" + booth.clacToll(nissan));
		
		Truck daewaoo = new DaewooTruck(6, 17000); // ….
		System.out.println("Axels:" + daewaoo.getAxels() + " Weight: "
				+ daewaoo.calWeight() + " Total Due :"
				+ booth.clacToll(daewaoo));

		booth.displayData();
		System.out.println("Axels:" + daewaoo.getAxels() + " Weight: "
				+ daewaoo.calWeight() + " Total Due :"
				+ booth.clacToll(daewaoo));
		booth.displayData();
		booth.cashDrawerRemoved();
		booth.displayData();

	}
}
