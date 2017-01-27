package ua.com.parad.editor;

import java.beans.PropertyEditorSupport;

import ua.com.parad.service.TourService;

public class TourEditor extends PropertyEditorSupport{
	
	private final TourService tourService;
	
	public TourEditor(TourService tourService) {
		
		this.tourService = tourService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(tourService.getOne(Integer.parseInt(text)));
	}
	
	

}
