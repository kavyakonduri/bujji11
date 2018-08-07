import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int total=0;
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
       }
       for(int i=0;i<K;i++)
       {
                  total=total+a[i];
        }
        
      
  
   System.out.println(total);
       
	}
}

