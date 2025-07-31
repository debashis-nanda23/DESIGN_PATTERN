package com.momento;

import java.util.ArrayList;
import java.util.List;

//CareTaker
public class History {

	private List<DocumentMomento> momentos;
	
	public History() {
		this.momentos=new ArrayList<DocumentMomento>();
	}
	
	public void addMomento(DocumentMomento momento) {
		this.momentos.add(momento);
	}
	
	public DocumentMomento getMomento(int index) {
		return momentos.get(index);
	}
	
}
