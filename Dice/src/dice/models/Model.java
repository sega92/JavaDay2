package dice.models;

import java.util.Random;


public class Model {
	Random random = new Random(); 
	private double x;
	
	public  Model() {
		x = 0;
	}
	
	public Model(int x){
		this.x = x;
	}
	public void randNum()
	{
		x = Math. random() * 12 + 1;	
	}
	
	public int getX(){
		return (int) x;
	}
	
}
