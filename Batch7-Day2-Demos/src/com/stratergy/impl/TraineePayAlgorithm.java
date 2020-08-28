package com.stratergy.impl;

import com.stratergy.PayAlgorithm;

public class TraineePayAlgorithm implements PayAlgorithm {

	public double getPay(double salary) {
		// TODO Auto-generated method stub
		return salary+(salary*0.12);
	}

}
