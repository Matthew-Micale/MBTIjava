public class Response
{
  public PersonalityType type;
  public Question questionAnswered;
  public int scaledResponse;
  public Trait delta;
  
  public Response(Question q, int sr, Trait d)
  {
	  questionAnswered = q;
	  scaledResponse = q.getWeight();
	  delta = d;
	  
  }
  
  
}
