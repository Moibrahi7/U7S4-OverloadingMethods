package partB.ex01;

public class EmptyMethodExample {

    public static String methodThatPrints() {
        String response = "";
        response += "I'm printing this line out every time you call me.";
        return response;
    }
    public static void main(String[] args) {
        String output = methodThatPrints();
        System.out.print(output);
    }


}
