package partB.ex02;

public class MethodWithParametersExample {

    public static String sumTwoNumbers(int a, int b){
        String response = "";
        response += (a + b);
        return response;
    }
    public static void main(String[] args) {
        String output =  sumTwoNumbers(5,2);
        System.out.print(output);
    }

}
