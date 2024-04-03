package functionalProgramming;

public class LambdaExpressionWithMultipleParametersExample 
{
	interface reportCard 
	{
		 // Adding multiple parameters to the method
		 public int marksForSubjects(int mathematics,int physics,int biology,int history,int chemistry);
	}
	public static void main(String[] args) 
	{
		 reportCard am1=(int mathematics,int physics,int biology,int history, int chemistry)
				 ->(mathematics + physics + biology + history+ chemistry); // round brackets are used for multiple parameters
		 System.out.println(am1.marksForSubjects(74,87,66,53,90));
		 reportCard am2=(int mathematics,int physics,int biology,int history, int chemistry)
				 ->(mathematics + physics + biology + history+ chemistry);
		 System.out.println(am2.marksForSubjects(40,40,50,60,70));
		 reportCard am3=(int mathematics,int physics,int biology,int history, int chemistry)
				 ->(mathematics + physics + biology + history+ chemistry);
		 System.out.println(am3.marksForSubjects(50,60,70,60,70));
		 reportCard am4=(int mathematics,int physics,int biology,int history, int chemistry)
				 ->(mathematics + physics + biology + history+ chemistry);
		 System.out.println(am4.marksForSubjects(64,68,71,67,70));
		 reportCard am5=(int mathematics,int physics,int biology,int history, int chemistry)
				 ->(mathematics + physics + biology + history+ chemistry);
		 System.out.println(am5.marksForSubjects(85,86,55,75,88));
	}

}
