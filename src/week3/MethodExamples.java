package week3;

public class MethodExamples{

    public static void main(String[] args){
        System.out.println("Test");
        int total = area(12, 25);
        System.out.println(total);

        // System.out.println(area(12, 25));  // calling a method from print
        // display(258369,"Tevin");
        display("Tevin",258369);
    }

    public static int area(int num1, int num2){
        int result = num1 * num2;
        System.out.println("The area is "+result);
        return result;
    }

    public static void display(String name, int number){
        System.out.println("The name is "+name+" Number is "+number);
    }
}



