
public class Item {
	
	String title;
	float PlayingTime;
	boolean gotIt;
	String comment;
	
Item(){
	System.out.println("Constructor Item()");
	getTitle();
	getPlayingTime();
	getComment();
	setTitle();
	setPlayingTime();
	setComment();
}

Item(String t, float pT, boolean gI, String cm){
	System.out.println("Constructor Item(String,float,boolean,String)");
}

public void getTitle() {
	System.out.println("Metodo getTitle() from Item");
};
public void getPlayingTime(){
	System.out.println("Metodo getPlayingTime() from Item");
}
public void getComment() {
	System.out.println("Metodo getComment() from Item");
}
public void setTitle() {
	System.out.println("Metodo setTitle() from Item");
};
public void setPlayingTime(){
	System.out.println("Metodo setPlayingTime() from Item");
}
public void setComment() {
	System.out.println("Metodo setComment() from Item");
}


}
