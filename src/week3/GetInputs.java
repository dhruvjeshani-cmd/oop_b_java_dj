package week3;

import java.util.Scanner;

public class GetInputs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("The name is "+name);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("The number is "+num);

        // BufferReader br = new BufferReader(new InputStreamReader(System.in));
    }
    
}
