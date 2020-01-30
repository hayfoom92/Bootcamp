package com.itf.schulung.gitintro;

import java.util.*;

public class MusicPieceDatabase {
		//TODO: Create List and necesarry methods
	private List<MusicPiece> musicList = new ArrayList<MusicPiece>();
	
	public void addMusicPieces(MusicPiece musicPiece) {
		musicList.add(musicPiece);
	}
	 public void printAllList() {
		 for(MusicPiece model : musicList) {
	            System.out.println(model.getTitle());
	        }
	 }
}
