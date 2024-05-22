
import java.util.*;
public class Weighted_Interval_Scheduling
{
    class Interval implements Comparable<Interval> {
        int Innt_no,st,ft,wt,p;
        Interval(int a, int b, int c, int d){
            Innt_no=a+1;st=b;ft=c;wt=d;
        }
        public int compareTo(Interval X){
            return this.ft-X.ft;
        }
    }
    void weight_Int_schedule(int jobno[],int st[],int ft[],int wt[])
    {
        int i,j;
        Interval I_list[]=new Interval[st.length];
        for(i=0;i<st.length;i++)
        {
            Interval I= new Interval(jobno[i],st[i],ft[i],wt[i]);
            I_list[i]=I;
        }
        Arrays.sort(I_list);
        System.out.println("Sl No"+" "+"Act No"+" "+"Act Wt"+" "+"Act St"+" "+"Act ft"+" "+"Act p");
        for(i=st.length-1;i>=0;i--)
        {
            
            for(j=i-1;j>=0;j--)
            {
                if(I_list[i].st>=I_list[j].ft)
                {
                    I_list[i].p=j+1;
                    break;
                }
            }
            if(j<0)
                I_list[i].p=0;
        System.out.println((i+1)+"      "+I_list[i].Innt_no+"       "+I_list[i].wt+"      "+I_list[i].st+"     "+I_list[i].ft+"     "+I_list[i].p);
        }
        /*for(Interval IA: I_list)
        {
            System.out.println(IA.p);
        }*/
        System.out.println();
        System.out.println();
        System.out.println("Recursive "+Compute_opt(st.length,I_list));
        int RES[]=new int[st.length+1];
        RES=Compute_opt_I(st.length,I_list);
        System.out.println("Iterative ");
        for(int temp: RES)
            System.out.print(temp+" ");
        System.out.println();
        print_Intervals(I_list,RES);
    }
    public void print_Intervals(Interval I_lst[],int R[])
    {
        for(int i=R.length-1;i>0;)
        {
            //System.out.println(R[i]+" "+R[i-1]);
            if(R[i]==R[i-1])
            {
                i=i-1;
                continue;
            }
            else
            {
                System.out.println("Selected Act No =>"+" As per Sort Index: "+i+" and As per Org Act Index"+I_lst[i-1].Innt_no);
                i=I_lst[i-1].p;
            }
        }
    }
    public int[] Compute_opt_I(int j,Interval[] I_L)
    {
        int RES[]=new int[j+1];
        for(int k=1;k<=j;k++)
        {
            RES[k]=Math.max((I_L[k-1].wt+RES[I_L[k-1].p]),RES[k-1]);
        }
        return RES;
    }
    public int Compute_opt(int j,Interval[] I_L)
    {
        if(j==0)
            return 0;
        else
            return Math.max((I_L[j-1].wt+Compute_opt(I_L[j-1].p,I_L)),Compute_opt(j-1,I_L));
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int jobno[]={1,2,3,4,5,6};
		int wt[]={4,4,1,7,2,2};
		int st[]={2,4,7,3,1,6};
		int ft[]={5,6,10,8,4,9};
		
		Weighted_Interval_Scheduling obj=new Weighted_Interval_Scheduling();
		obj.weight_Int_schedule(jobno,st,ft,wt);
	}
}

//Output:
//Sl No Act No Act Wt Act St Act ft Act p
//6      4       1      7     10     3
//5      7       2      6     9     3
//4      5       7      3     8     0
//3      3       4      4     6     1
//2      2       4      2     5     0
//1      6       2      1     4     0
//
//
//Recursive 8
//Iterative 
//0 2 4 6 7 8 8 
//Selected Act No => As per Sort Index: 5 and As per Org Act Index7
//Selected Act No => As per Sort Index: 3 and As per Org Act Index3
//Selected Act No => As per Sort Index: 1 and As per Org Act Index6