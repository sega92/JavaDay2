
public class DogFactory {
	public static Dog buildDog(DogType model){ //returns Dog Type
		
		Dog dog = null;
		
		switch(model){
		case HANDSOME:
			dog = new Husky();
			break;
		case CUTE:
			dog = new Poodle();
			break;
		}
		return dog;
	}
}
