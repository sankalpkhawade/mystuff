package com.cts.controller;

import com.cts.dao.MoviesImpl;

public class MoviesController {

	public static void main(String[] args) {
		
		MoviesImpl impl=new MoviesImpl();
		impl.addElements();
		impl.showElements();
		impl.editElements();
	}

}
