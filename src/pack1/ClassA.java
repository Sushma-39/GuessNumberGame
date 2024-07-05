package pack1;

import java.util.Scanner;

public class ClassA {
	void meth1() {
		Scanner sc=new Scanner(System.in);
		int n=1+(int) (100*Math.random());
				int trials=6;
				for(int i=1;i<=6;i++)
				{
					System.out.println("Guess Number: ");
					int guessNumber=sc.nextInt();
					int x=trials-i;
					if(guessNumber==n) 
					{
						System.out.println("Congratulations!!!!!");
						System.out.println("You guessed the correct Number in "+i+"th trial\nyou won");
						break;
					}
					else if(guessNumber>n) 
					{
						System.out.println("The number should be less than "+guessNumber);
						//int x=trials-i;
						if(x==0) 
						{
							System.out.println("you ran time out!!");
						}
						else 
					    {
						    System.out.println("You left with "+(trials-i)+" trials");
					    }
					}
					else 
					{
						System.out.println("The number should be greater than "+guessNumber);
						if(x==0) 
						{
							System.out.println("you ran time out!!");
						}
						else {
							System.out.println("You left with "+(trials-i)+" trials");
						}
					}
              }
	}
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.meth1();
	}
}
