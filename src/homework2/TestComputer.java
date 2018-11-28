package homework2;

public class TestComputer {

	public static void main(String[] args) {
		
		
		//Testing constructor and method
		Computer comp1 = new Computer("Dell");
		Computer comp2 = new Computer("Apple", 15);
		String result = comp2.compA("Super", "computer");
		System.out.println(result);
		int result1 = comp2.compB(200, 400);
		System.out.println(result1);
		
		
		// testing static variable and method
		Computer comp3 = new Computer();
		comp3.setComputerModel("IBM");
		System.out.println(comp3.getComputerModel());
		Computer.computerPerformance();
		Computer comp4 = new Computer();
		comp4.setComputerModel("Mac");
		System.out.println(comp4.getComputerModel());
		System.out.println(comp3.getComputerModel());
	}

}
