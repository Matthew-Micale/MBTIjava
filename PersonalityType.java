public class PersonalityType
{
double iScore = 0;
double eScore = 0;

double nScore = 0;
double sScore = 0;

double tScore = 0;
double fScore = 0;

double jScore = 0;
double pScore = 0;

double hsScore = 0;
double lsScore = 0;

public void addResponse(Response r)
{
	Trait d = r.getDelta();
	int weight = r.getWeight();
	switch(d.getId())
	{
	case 1:
		iScore += weight;
		break;
	case 2:
		eScore += weight;
		break;
	case 3:
		nScore += weight;
		break;
	case 4:
		sScore += weight;
		break;
	case 5:
		tScore += weight;
		break;
	case 6:
		fScore += weight;
		break;
	case 7:
		jScore += weight;
	case 8:
		pScore += weight;
	case 9:
		hsScore += weight;
	case 10:
		lsScore += weight; // HELLO PEOPLE
	}
}
}
