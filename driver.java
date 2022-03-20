import java.util.*;

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
	
	FinalPersonalityType INTJH = new FinalPersonalityType("INTJH",I,N,T,J,HS);
	FinalPersonalityType INTJL = new FinalPersonalityType("INTJL",I,N,T,J,LS);
	FinalPersonalityType INTPH = new FinalPersonalityType("INTJH",I,N,T,P,HS);
	FinalPersonalityType INTPL = new FinalPersonalityType("INTJL",I,N,T,P,LS);
	FinalPersonalityType INFJH = new FinalPersonalityType("INFJH",I,N,F,J,HS);
	
	
	// add all personality types here
	
	int numOfQs = 5;
	
	Question[] allQs = new Question[numOfQs];
	allQs[0] =  new Question("I prefer working alone rather than a larger group",10,E,I);
	//add all questions here
	
	Response[] allRs = new Response[numOfQs];
	
	int numOfCs = 10;
	Career[] allCs = new Career[numOfCs];
	//allCs[0] = new Career("Engineer",null); // add letter acronym for personality type for career
	
	PersonalityType calculate = new PersonalityType();
	
	Scanner scan = new Scanner(System.in);
	
	for(int i = 0; i < numOfQs;)
	{
		
		System.out.println(allQs[i].getText());
		System.out.println("Disagree completely: 1 2 Neutral: 3 4 Agree Comletely: 5");
		int res = scan.nextInt();
		if(res > 5 || res < 1) {
			System.out.println("Please input a number from 1-5");
		}
		else {
			allRs[i] = new Response(allQs[i],res);
			Trait temp = allRs[i].getDelta();
			int id = temp.getId();
			int weight = allQs[i].getQWeight();
			calculate.addResponse(id,weight);
			i++;
		}
	}
}

}
