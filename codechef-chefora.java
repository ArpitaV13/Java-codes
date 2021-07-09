/*Chef and his friend Bharat have decided to play the game "The Chefora Spell".

In the game, a positive integer N (in decimal system) is considered a "Chefora" if the number of digits d is odd and it satisfies the equation
N=∑i=0d−1Ni⋅10i,
where Ni is the i-th digit of N from the left in 0-based indexing.

Let Ai denote the i-th smallest Chefora number.

They'll ask each other Q questions, where each question contains two integers L and R. The opponent then has to answer with

(∏i=L+1R(AL)Ai)mod109+7.
Bharat has answered all the questions right, and now it is Chef's turn. But since Chef fears that he could get some questions wrong, you have come to his rescue!

Input
The first line contains an integer Q - the number of questions Bharat asks.
Each of the next Q lines contains two integers L and R.
Output
Print Q integers - the answers to the questions on separate lines.

Approach-:
tried to break teh problem into parts and then make functions separately
*/
/* package codechef; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long M = 1000000007;
    static long power(long x,long y){
        
        long res=1;
        while(y>0){
        if(y%2!=0){
            res=((res%M)*(x%M))%M;
            y=y-1;
            }
        x=((x%M)*(x%M))%M;
        y=y/2;
        }
        return res;
    }
    static long chefora(long num){
        long c=num;
        long f=0;
        if(num<10){
            f=c;;
        }
        else if(num>=10){
          num=num/10;
          while(num!=0){
              c=c*10+num%10;
              num=num/10;
          }
          return c;
        }
        return f;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		   long a[]=new long[100001];
	       long p[]=new long[100001];
	        for(long i=1;i<100001;i++){
	            a[(int)i]=chefora(i);
	            p[(int)i]=p[(int)i-1]+a[(int)i];
	        }
		long q=sc.nextLong();
	    while(q--!=0){
	     
	        long l=sc.nextLong();
	        long r=sc.nextLong();
	        long sum=p[(int)r]-p[(int)l];
	        
	        System.out.println(power(a[(int)l],sum));
	    }
	        
	        
	    
	
}
}
