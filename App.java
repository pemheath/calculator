import java.util.Scanner;

public class App {

    static final Scanner inputScanner = new Scanner(System.in); //create scanner object

    private static String getString(String prompt){

        System.out.println(prompt);
        String input = inputScanner.nextLine(); // whatever comes next 
        return input;

    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        double num1 = inputScanner.nextDouble();
        return num1;
        
    }

 

    public static void main(String[] args) {
        double num1 = getDouble("first number:");
        double num2 = getDouble("second number:");
        

        System.out.println("Select from the menu below: /n >add /n >subtract /n >multiply /n >divide /n >exit ");

        inputScanner.nextLine();

        String operator = inputScanner.nextLine();

        //never a chance to actually put the scanner in 

        Calculator myCalc = new Calculator();

        double answer = 0.0;

        if(operator.equals("add")){

            answer = myCalc.add(num1, num2);

        }

        else if(operator.equals("subtract")){

            answer = myCalc.subtract(num1, num2);

        }
        else if(operator.equals("multiply")){

            answer = myCalc.multiply(num1, num2);

        }
        else if(operator.equals("divide")){

            answer = myCalc.divide(num1, num2);

        }


        else if (operator.equals("quit")){
            System.out.println("Goodbye!");
        }

        System.out.println(answer);

        


}
}