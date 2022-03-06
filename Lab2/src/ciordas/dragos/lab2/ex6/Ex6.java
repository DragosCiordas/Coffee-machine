package ciordas.dragos.lab1.ex6;

class Ex6{  //recursive method
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        int number=4;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println(+fact);
    }
}