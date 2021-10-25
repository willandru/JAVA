
public class DVD extends Item{
	String director;
DVD(){
	System.out.println("Constructor DVD()");
	getDirector();
	setDirector();
}
	DVD(String director){
		System.out.println("Constructor DVD(String)");
	}
	
	public void getDirector() {
		System.out.println("Metodo getDirector() from DVD");
	}
	public void setDirector() {
		System.out.println("Metodo setDirector() from DVD");
	}
	
}
