
public class VideoGame extends Game {
	String platform;
VideoGame(){
	System.out.println("Constructor VideoGame()");
	getPlatform();
	setPlatform();
}
VideoGame(String plat){
	System.out.println("Constructor VideoGame(String)");
}

public void getPlatform() {
	System.out.println("Metodo getPlatform() from VideoGame");
};
public void setPlatform() {
	System.out.println("Metodo setPlatform() from VideoGame");
};

}


