public class Response
{
  public PersonalityType type;
  public Question questionAnswered;
  public int scaledResponse;
  public Trait delta;
  
  public Response(Question q, int sr, Trait d)
  {
	  questionAnswered = q;
	  scaledResponse = sr;
	  delta = d;
	  
  }
  
  public Trait getDelta()
  {
	if(scaledResponse > 3)
	{
		return questionAnswered.getTrait2();
	}
	else if(scaledResponse < 3)
	{
		return questionAnswered.getTrait1();
	}
	else
	{
		return questionAnswered.getTrait1();
	}
  }
  
  public int getWeight()
  {
	  int w = questionAnswered.getQWeight();
	  //formula for calculating total score towards personality type here
	  return w;
  }
  }
  
  
