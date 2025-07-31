package com.momento;

//Originator
public class Document {

	private String content;

	public Document(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	
	public void write(String text) {
		this.content+=text;
	}
	
	public DocumentMomento createMomento() {
		return new DocumentMomento(this.content);
	}
	
	public void restoreMomento(DocumentMomento momento) {
		this.content=momento.getSavesContent();
	}
}
