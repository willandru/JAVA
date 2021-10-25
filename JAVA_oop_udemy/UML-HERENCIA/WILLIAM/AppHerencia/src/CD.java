
public class CD extends Item{
	String artist;
	int numberOfTracks;
	
CD(){
	System.out.println("Constructor CD()");
	getArtist();
	setArtist();
	getNumberOfTracks();
	setNumberOfTracks();
}
CD(String artist){
	System.out.println("Constructor CD(String)");
}
CD(String artist,int numberOfTracks){
	System.out.println("Constructor CD(String, int)");
}

public void getArtist() {
	System.out.println("Metodo getArtist() from CD");
}
public void getNumberOfTracks() {
	System.out.println("Metodo getNumberOfTracks() from CD");
}
public void setArtist() {
	System.out.println("Metodo setArtist() from CD");
}
public void setNumberOfTracks() {
	System.out.println("Metodo setNumberOfTracks() from CD");
}

}
