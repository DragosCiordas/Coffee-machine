package ciordas.dragos.lab1.ex6;

import java.util.Scanner; //non recursive method

class Ex6b{
    public static void main(String args[]){
        int i,fact=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Number");
        int number= in.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}