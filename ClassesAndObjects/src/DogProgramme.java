
public class DogProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = DogFactory.buildDog(DogType.HANDSOME);
		dog.bark();
	}

}
