public class MathsOperations {

    public static void main(String[] args) {
        byte x = 12;
        short y = 1000;
        int sum = x + y;
        System.out.println("x + y is: " + sum);

        long a = 5000L;
        float b = 2.5f;
        double multiplication = a * b;
        System.out.println("a * b is: " + multiplication);

        int wholeThree = 3;
        int wholeTen = 10;
        double doubleThree = 3.0;
        double doubleTen = 10.0;

        int integerDivision = wholeTen / wholeThree;
        System.out.println("wholeThree / wholeThree is: " + integerDivision);

        double floatingPointDivisionDenominator = wholeTen / doubleThree;
        System.out.println("wholeThree / doubleThree is: " + floatingPointDivisionDenominator);

        double floatingPointDivisionNumerator = doubleTen / wholeThree;
        System.out.println("doubleTen / wholeThree is: " + floatingPointDivisionNumerator);

        double floatingPointDivision = doubleTen / doubleThree;
        System.out.println("doubleTen / doubleThree is: " + floatingPointDivision);

        double multipliedOut = floatingPointDivision * wholeThree;
        System.out.println("floatingPointDivision * wholeThree is: " + multipliedOut);
    }
}