package com.itf.schulung.gitintro;

public class MusicPiece {

	private double laenge;
	private String title;
	private String autorName;
	
	public MusicPiece(double laenge, String title, String autorName) {
		this.laenge = laenge;
		this.title = title;
		this.autorName = autorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
