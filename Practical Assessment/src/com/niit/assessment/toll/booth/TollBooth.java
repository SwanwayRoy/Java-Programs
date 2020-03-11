package com.niit.assessment.toll.booth;

public interface TollBooth {
	float clacToll(Truck t);

	void displayData();

	void cashDrawerRemoved();
}