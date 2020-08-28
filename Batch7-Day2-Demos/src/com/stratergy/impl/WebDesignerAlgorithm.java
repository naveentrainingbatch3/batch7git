package com.stratergy.impl;

import com.stratergy.PayAlgorithm;

public class WebDesignerAlgorithm implements PayAlgorithm {

	public double getPay(double salary) {
		// TODO Auto-generated method stub
		return salary+(salary*0.15);
	}

}
