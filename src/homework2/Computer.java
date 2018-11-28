package homework2;

public class Computer {
	
	String computerName;
	int computerSize;
	public static String computerModel;
	
	public Computer() {
		
	}
	public Computer(String computer1) {
		computerName =computer1;
		System.out.println(computer1);
	}
	public Computer(String computer2, int compSize) {
		computerName = computer2;
		computerSize = compSize;
		System.out.println(computer2 +"   " + compSize);
	}
	
	public String compA(String st1, String st2) {
		String brand = st1 + st2;
		return brand;
	}
	public int compB(int st1, int st2) {
		int model = st1 + st2;
		return model;
	}
	public void setComputerModel(String computerModel) {
		this.computerModel = computerModel;
	}
	public String getComputerModel() {
		return computerModel;
	}
	
	public static void computerPerformance() {
		System.out.println("This Has best performance");
	}
	

}
