import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci sequence ends after how many iterations? ");
        int value   = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci sequence up to "+value+ " numbers: " );
        for (int i =1; i<=value; i++){
            System.out.print(fibonacci2(i) + " ");
            }
        }
        public static int fibonacci(int value){
        if(value == 1 || value == 2){
            return 1;
            }
        return  fibonacci((value -1)+fibonacci(value -2));
        }
        public static int fibonacci2(int value){
        if(value == 1 || value ==2){
            return 1;
        }
        int fib1=1, fib2 = 1, fibonacci=1;
        for(int i=3; i<= value; i++){
            fibonacci = fib1+fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
        }
    }
