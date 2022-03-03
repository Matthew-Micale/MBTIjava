public class driver

{

public static void main(String[] args)
{
// Instantiating all classes
	
	Trait I = new Trait("Introversion",1);
	Trait E = new Trait("Extraversion",2);
	Trait N = new Trait("Intuition",3);
	Trait S = new Trait("Sensing",4);
	Trait T = new Trait("Thinking",5);
	Trait F = new Trait("Feeling",6);
	Trait J = new Trait("Judging",7);
	Trait P = new Trait("Perceiving",8);
	Trait HS = new Trait("Highly-Stressed",9);
	Trait LS = new Trait("Low-Stressed",10);
	
	
	int numOfQs = 5;
	
	Question[] allQs = new Question[numOfQs];
	allQs[0] =  new Question("I prefer working alone rather than a larger group",10,E,I);
	
}

}
