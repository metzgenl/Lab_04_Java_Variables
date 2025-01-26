import static java.lang.Boolean.FALSE;

public class Variables {
    int intOperandA = 5;
    int intOperandB = 3;
    int intSum = intOperandA + intOperandB;
    int intProduct = intOperandA * intOperandB;
    int intDifference = intOperandA - intOperandB;
    int intQuotient = intOperandA / intOperandB;
    int intModulo = intOperandA % intOperandB;
    double doubleOperandA = 5.0;
    double doubleOperandB = 3.0;
    double doubleSum = doubleOperandA + doubleOperandB;
    double doubleProduct = doubleOperandA * doubleOperandB;
    double doubleDifference = doubleOperandA - doubleOperandB;
    double doubleQuotient = doubleOperandA / doubleOperandB;


    //the cost of my lunch
    double myLunchCost = 12.50;
    //the number of kids in your family
    int numOfKids = 3;
    //the answer to is it raining?
    boolean raining = FALSE;
    //the price of a gallon of gas
    double priceOfGas = 3.20;
    //your favorite number
    int favNumber = 13;
    //your show size
    double shoeSize = 10.5;
    //your birth month
    int birthMonth = 12;
    //your full name
    String fullName = "Nate Metzger";

    public void showVariables(){
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The Modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

    }

}

