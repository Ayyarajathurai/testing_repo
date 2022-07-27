package exceptionkandling;
import java.util.Scanner;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
				// TODO Auto-generated method stub
				/*Scanner sc=new Scanner(System.in);
				int n1;
				int n2;
				int n3;*/
				demo2 ed=new demo2();
				
				ed.devide();
				ed.add();
				
				//n1=sc.nextInt();
				//n2=sc.nextInt();

			}

			private void devide() {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the n6 n7 value");
				int n1,n2;
				try {
				int n6=sc.nextInt();
				
				int n7=sc.nextInt();
				
				int result=6%n7;
				System.out.println(result);
				}catch (Exception ae)
				{
					System.out.println("number 7 is zero plz check number 7 value");
					devide();
				}
			}
				
			

			public void add() {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the n4 n5 value");
				int n1,n2;
				int n4=sc.nextInt();
				int n5=sc.nextInt();
				int result=n4+n5;
				System.out.println(result);
				//add();
			}

		


	}


