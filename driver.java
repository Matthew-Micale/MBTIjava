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
	FinalPersonalityType INFJL = new FinalPersonalityType("INFJL",I,N,F,J,LS);
	FinalPersonalityType INFPH = new FinalPersonalityType("INFPH",I,N,F,P,HS);
	FinalPersonalityType INFPL = new FinalPersonalityType("INFPL",I,N,F,P,LS);
	FinalPersonalityType ISTJH = new FinalPersonalityType("ISTJH",I,S,T,J,HS);
	FinalPersonalityType ISTJL = new FinalPersonalityType("ISTJL",I,S,T,J,LS);
	FinalPersonalityType ISTPH = new FinalPersonalityType("ISTPH",I,S,T,P,HS);
	FinalPersonalityType ISTPL = new FinalPersonalityType("ISTPL",I,S,T,P,LS);
	FinalPersonalityType ISFJH = new FinalPersonalityType("ISFJH",I,S,F,J,HS);
	FinalPersonalityType ISFJL = new FinalPersonalityType("ISFJL",I,S,F,J,LS);
	FinalPersonalityType ISFPH = new FinalPersonalityType("ISFPH",I,S,F,P,HS);
	FinalPersonalityType ISFPL = new FinalPersonalityType("ISFPL",I,S,F,P,LS);
	
	FinalPersonalityType ENTJH = new FinalPersonalityType("ENTJH",E,N,T,J,HS);
	FinalPersonalityType ENTJL = new FinalPersonalityType("ENTJL",E,N,T,J,LS);
	FinalPersonalityType ENTPH = new FinalPersonalityType("ENTJH",E,N,T,P,HS);
	FinalPersonalityType ENTPL = new FinalPersonalityType("ENTJL",E,N,T,P,LS);
	FinalPersonalityType ENFJH = new FinalPersonalityType("ENFJH",E,N,F,J,HS);
	FinalPersonalityType ENFJL = new FinalPersonalityType("ENFJL",E,N,F,J,LS);
	FinalPersonalityType ENFPH = new FinalPersonalityType("ENFPH",E,N,F,P,HS);
	FinalPersonalityType ENFPL = new FinalPersonalityType("ENFPL",E,N,F,P,LS);
	FinalPersonalityType ESTJH = new FinalPersonalityType("ESTJH",E,S,T,J,HS);
	FinalPersonalityType ESTJL = new FinalPersonalityType("ESTJL",E,S,T,J,LS);
	FinalPersonalityType ESTPH = new FinalPersonalityType("ESTPH",E,S,T,P,HS);
	FinalPersonalityType ESTPL = new FinalPersonalityType("ESTPL",E,S,T,P,LS);
	FinalPersonalityType ESFJH = new FinalPersonalityType("ESFJH",E,S,F,J,HS);
	FinalPersonalityType ESFJL = new FinalPersonalityType("ESFJL",E,S,F,J,LS);
	FinalPersonalityType ESFPH = new FinalPersonalityType("ESFPH",E,S,F,P,HS);
	FinalPersonalityType ESFPL = new FinalPersonalityType("ESFPL",E,S,F,P,LS);
	
	
	
	// add all personality types here
	
	int numOfQs = 5;
	
	Question[] allQs = new Question[numOfQs];
	allQs[0] = new Question("I prefer working alone rather than a larger group",10,E,I);
	allQs[1] = new Question("I focus on details rather than the bigger picture",10,N,S);
	allQs[2] = new Question("I usually make decisions with logic instead of emotion",10,F,T);
	allQs[3] = new Question("When going on vacation, I like to make a schedule",10,P,J);
	allQs[4] = new Question("I get stressed really easily",10,LS,HS);
	//add all questions here
	
	Response[] allRs = new Response[numOfQs];
	
	int numOfCs = 10;
	Career[] allCs = new Career[numOfCs];
	allCs[0] = new Career("Engineer",INTJH,INTJL); // add letter acronym for personality type for career
	
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
	
	Trait s1;
	if(calculate.getScore(1) > calculate.getScore(2))
		s1 = I;
	else
		s1 = E;
	
	Trait s2;
	if(calculate.getScore(3) > calculate.getScore(4))
		s2 = N;
	else
		s2 = S;
	
	Trait s3;
	if(calculate.getScore(5) > calculate.getScore(6))
		s3 = T;
	else
		s3 = F;
	
	Trait s4;
	if(calculate.getScore(7) > calculate.getScore(8))
		s4 = J;
	else
		s4 = P;
	
	Trait s5;
	if(calculate.getScore(9) > calculate.getScore(10))
		s5 = HS;
	else
		s5 = LS;
		
	
}

}
