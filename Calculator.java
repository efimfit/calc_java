public class Calculator {
    public static int calculate(int number1, char operator, int number2) throws ArithmeticException {
        int result;

         switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0){
                    throw new ArithmeticException("Division by zero");
                }
                result = number1 / number2;
                break;
            default:
                throw new ArithmeticException("Invalid operator");
        }

        return result;
    }

    public static int calculate(int number1, char operator1, int number2, char operator2, int number3){
        int result;

        if ((operator1 == '+' || operator1 == '-') && (operator2 == '*' || operator2 == '/')){
            int intermediateResult = calculate(number2, operator2, number3);
            result = calculate(number1, operator1, intermediateResult);
        } else{
            int intermediateResult = calculate(number1, operator1, number2);
            result = calculate(intermediateResult, operator2, number3);
        }

        return result;
    }
}
