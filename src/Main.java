import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number in inches: ");
        int numInInches = keyboard.nextInt();

        System.out.println();

        double cm = convertToCm(numInInches);
        System.out.println(convertToCm(numInInches));
        System.out.printf("%.2f", convertToCm(numInInches)); //print two two decimal places

    }

    // Write a method to convert from inches to cm
    public static double convertToCm(int numInInches){
        double cm = numInInches * 2.54;
        return cm;
    }

}
