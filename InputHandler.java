public class InputHandler {
    public int parseInput(String userInput) throws Exception {
        String[] splittedString = userInput.split(" ");

        try{
            if (splittedString.length == 3){
            int number1 = Integer.parseInt(splittedString[0]);
            char opepator = splittedString[1].charAt(0); 
            int number2 = Integer.parseInt(splittedString[2]);

            checkRange(new int[]{number1, number2});
            return Calculator.calculate(number1, opepator, number2);
            } else if (splittedString.length == 5){
                int number1 = Integer.parseInt(splittedString[0]);
                char opepator1 = splittedString[1].charAt(0); 
                int number2 = Integer.parseInt(splittedString[2]);
                char opepator2 = splittedString[3].charAt(0); 
                int number3 = Integer.parseInt(splittedString[4]);
                
                checkRange(new int[]{number1, number2, number3});
                return Calculator.calculate(number1, opepator1, number2, opepator2, number3);
            } else {
                throw new IndexOutOfBoundsException("Wrong arguments number");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Wrong number range. Only (-10:10) are available");
        }
    }
    
    public static boolean checkRange(int[] numbers) throws NumberFormatException{
        for (int number : numbers) {
        if (number < -10 || number > 10){
            throw new NumberFormatException();
            } 
        }
        return true;
    }
}