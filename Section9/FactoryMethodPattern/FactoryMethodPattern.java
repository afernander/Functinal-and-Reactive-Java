package Section9.FactoryMethodPattern;

public class FactoryMethodPattern {

	public static void main(String[] args) {
		
		Flooring floor = FlooringFactory.getFlooring(13, 46);
		floor.installation();

	}
}
