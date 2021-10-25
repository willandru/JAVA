
public class Game extends Item{
	int numberOfPlayers;
	
	Game(){
		System.out.println("Constructor Game()");
		getNumberOfPlayers();
		setNumberOfPlayers();
	}

	Game(int nP){

	System.out.println("Constructor Game(int)");
	}
	public void getNumberOfPlayers() {
		System.out.println("Metodo getNumberOfPlayers() from Game");
	}
	public void setNumberOfPlayers() {
		System.out.println("Metodo setNumberOfPlayers() from Game");
	}
	
}
