package com.itf.schulung.gitintro;

public class App 
{
    public static void main( String[] args ) {
        //TODO: Fill MusicPieceDatabase
    	
    	MusicPieceDatabase musicDB = new MusicPieceDatabase();
    	musicDB.addMusicPieces(new MusicPiece(5.00, "Hello", "By Me"));
    	musicDB.addMusicPieces(new MusicPiece(4.50, "Hello World", "By You"));
    	musicDB.addMusicPieces(new MusicPiece(7.00, "Bye Bye", "By Me"));
    	musicDB.addMusicPieces(new MusicPiece(4.30, "Hello part 2", "By Me"));
    	musicDB.addMusicPieces(new MusicPiece(5.47, "Hello part 3", "By Me"));

    	musicDB.printAllList();
    }
}
