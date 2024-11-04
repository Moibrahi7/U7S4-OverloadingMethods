package partB.ex03;

public class OverloadingMethodExample {

    public static String addTwoNumbersMethod(int a, int b){
        String response = "";
        response += a + b;
        return response;
    }
    public static String addTwoNumbersMethod(double a, double b) {
        String response = "";
        response +=  a + b;
        return response;
    }
    public static void main(String[] args) {
        String myInt = addTwoNumbersMethod(1,5);
        String myDbl = addTwoNumbersMethod(3.1,2.5);
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDbl);
    }

}
