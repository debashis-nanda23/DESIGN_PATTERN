package com.momento;

public class Main {
	
	public static void main(String[] args) {
		
		Document document=new Document("Initial Content\n");
		History history=new History();
		
		//write the content
		document.write("Additional Content \n");
		history.addMomento(document.createMomento());
		
		//write more content
		document.write("More Content \n");
		history.addMomento(document.createMomento());
		
		//Restore the previous state
		document.restoreMomento(history.getMomento(1));
		
		//Print the document content
		System.out.println("Restore "+document.getContent());
	}

}
