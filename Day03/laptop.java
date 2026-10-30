package Day03;

public class laptop {
	String name ;
	String model ;
	double ram ;
	
	public void playMusic() {
		System.out.println(this.name + " " + this.model + " is playing music.");
	}
	
	public void installApp(String name, double memory) {
		System.out.println(name + " is installing: " + memory + "MB");
	}
	
	public static void main(String[] args) {
		laptop l1 = new laptop() ;
		l1.name = "acer" ;
		l1.model = "lite" ;
		l1.ram = 16 ;
		
		l1.playMusic();
		l1.installApp("Chrome", 20);
	}
}
