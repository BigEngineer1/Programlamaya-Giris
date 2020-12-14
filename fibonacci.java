/*
@author BigEngineer1
*/


package bilgisayar;

import java.util.Scanner;
class Helloworld {


	public static void main(String[] args) {
		
		/// 0  1 2 3 5 8 13

		Scanner readbaba=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int Dizisize=readbaba.nextInt();
		int Fib[]=new int[Dizisize+2];
		Fib[0]=0;
		Fib[1]=1;
		
		for(int i=0;i<Dizisize;i++) {
			Fib[i+2]=Fib[i+1]+Fib[i];
			System.out.println(Fib[i]);
		}
		
	
	}
	}	
		
			
