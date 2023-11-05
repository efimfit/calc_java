import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler();

        while (true){
            System.out.println("Input:");
            String userInput = scanner.nextLine();
            try{
                int result = inputHandler.parseInput(userInput);
                System.out.println("Output:\n" + result);
            } catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
        scanner.close();
    }
}
