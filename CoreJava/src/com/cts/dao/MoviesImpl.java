package com.cts.dao;

import com.cts.model.MoviesModel;

public class MoviesImpl implements Movies{

	MoviesModel model=new MoviesModel();
	@Override
	public void addElements() {
		
		
		model.setTitle("Avatar");
		model.setBoxOffice(2451362L);
		//model.setDateOfLaunch();
		model.setActive(true);
		model.setGenre("Super Hero");
		model.setHasTeaser(true);
	}

	@Override
	public void showElements() {
		
		System.out.println(model.getTitle());
		System.out.println(model.getBoxOffice());
		//System.out.println(model.getActive());
		System.out.println(model.getGenre());
		//model.getDateOfLaunch();
		
	}

	@Override
	public void editElements() {
		
		
	}

}
