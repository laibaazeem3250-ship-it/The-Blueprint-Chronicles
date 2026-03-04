package laiba;

//Interface in java =>>>   An interface in java is a blueprint of a class that defines what a class must do but not how it 
// will be done. It contains method 
//-> declaration (without implementation) 
//-> constants (optional)
// Any class Text implement s the interface must provide implementation into methods.
// example: action perform 


interface animals{
	void sound(); 
}
 
  class puppy implements animals{
	  public void sound() {
		  System.out.println("Dog Barks");
	  }
  }

  class kitten implements animals{
	  public void sound() {
		  System.out.println("Cat meows");
	  }
  }
  
public class Interface {

	public static void main(String[] args) {
		
		animals a1 = new puppy();
		animals a2 = new kitten();
		a1.sound();
		a2.sound();

	}

}
