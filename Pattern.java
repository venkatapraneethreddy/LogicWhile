package LogicWhile;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=1;
		for(int i=0;i<n;i++) {                      //1 2 3 
			for(int j=0;j<n;j++) {                  //4 5 6
				System.out.print(num+" ");          //7 8 9
				num++;
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {                       //*
			for(int j=0;j<=i;j++) {                  //**
				System.out.print("*");               //***
			}                                        //****
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {                       //****
			for(int j=0;j<n-i;j++) {                 //***
				System.out.print("*");               //**
			}                                        //*
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for (int i = 0 ; i < n; i++ ) {              //   *
			for (int j = 0 ; j <= n-i; j++ ) {       //  **
				System.out.print(" ");               // ***
			}                                        //****
			for (int k = 0 ; k <=i; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {                //****
				System.out.print(" ");             // ***
			}                                      //  **
			for(int j=0;j<n-i;j++) {               //   *
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {            //*
				System.out.print("*");         //**
			}                                  //***
			System.out.println();              //****
		}                                      //***
		for(int i=0;i<n;i++) {                 //**
			for(int j=0;j<n-i-1;j++) {         //*
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {            //   *
				System.out.print("*");         //  **
			}                                  // ***
			System.out.println();              //****
		}                                      // ***
		for(int i=0;i<n;i++) {                 //  **
			for(int k=0;k<=i+1;k++) {          //   *
				System.out.print(" ");
			}
			for(int j=1;j<=n-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++) {          //   *
				System.out.print("*");            //  ***
			}                                     // *****
			                                      //*******
			System.out.println();
		}
		System.out.println("----------------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*n)-(2*i+1);k++) {       //*******
				System.out.print("*");               // *****
			}                                        //  ***
			                                         //   *
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0||i==n-1||i==j) {               //*
					System.out.print("*");             //**
				}                                      //* *
				else {                                 //*  *
					System.out.print(" ");             //*****
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i;j++) {
					System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {                //   *
		        if (k==0 || k==i || i==n-1) {         //  **
		            System.out.print("*");            // * *
		        } else {                              //*  *
		            System.out.print(" ");           //*****
		        }
		    }
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {                //1
				System.out.print(j);               //12
			}                                      //123
			System.out.println();                  //1234
		}
		System.out.println("--------------");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++) {
				if(k==0||i==0||k==n-i-1) {
					System.out.print((char)(k+65));      //ABCD
				}                                        // A C
				else {                                   //  AB
					System.out.print(" ");               //   A
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		int ch=1;
		for(int i=0;i<n;i++) {                         //A
			for(int j=0;j<=i;j++) {                    //BC
				System.out.print((char)(64+ch));       //DEF
				ch++;                                  //GHIJ
			}
			System.out.println();
		}
		
		System.out.println("-----------------");

        for (int i=n;i>=1;i--) {            //upper to middle
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            System.out.print(i);                 //4     4
            if (i != 1) {                        // 3   3
                for (int k=1; k<=2*i-3; k++) {   //  2 2
                    System.out.print(" ");       //   1
                }                                //  2 2
                System.out.print(i);             // 3   3
            }                                    //4     4
            System.out.println();
        }


        for (int i=2; i<=n;i++) {                   //lower
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j=1;j<=2*i-3;j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
        
        System.out.println("-----------------");
        
        for(int i=0;i<n;i++) {
        	for(int k=0;k<=i;k++) {
        		System.out.print(" ");               //12345
        	}                                        // 123
        	for(int j=1;j<=(2*n)-(2*i+1);j++) {      //  1
        		System.out.print(j);                 // 123
        	}                                        //12345
        	System.out.println();
        }
        
        for(int i=1;i<n;i++) {
        	for(int k=1;k<=n-i;k++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=(2*i+1);j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }
		
		sc.close();
	} 

}
