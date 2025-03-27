import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = getValidIntInput(scanner, "Введите первое число.");

        int numberTwo = getValidIntInput(scanner, "Введите второе число.");

        Calculator calculator = new Calculator(numberOne, numberTwo);

        System.out.println("""
        Введите номер операции которую хотите выбрать: 
        1.Сложение
        2.Вычитание
        3.Умножение
        4.Деление
        """);

        int operation = getValidIntInput(scanner, "Введите номер операции (1-4)");

        switch (operation) {
                case 1 : System.out.println(numberOne +" + "+ numberTwo+ " = "+ calculator.add());
                break;

                case 2 : System.out.println(numberOne +" - "+ numberTwo+ " = "+ calculator.subtract());
                break;

                case 3 : System.out.println(numberOne +" * "+ numberTwo+ " = "+ calculator.multiply());
                break;

                case 4 :
                try {
                    System.out.println(numberOne +" / "+ numberTwo+ " = "+ calculator.divide());
                }
                catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                }
                break;

                default:
                System.out.println("Ошибка! Введите число от 1 до 4.");
                
        }
        scanner.close();
    }

        private static int getValidIntInput(Scanner scanner, String message){  //Метод для получения корректного челого числа
            while (true){
                System.out.println(message);
                try {
                    return scanner.nextInt(); //считываем число
                }
                catch(InputMismatchException e){
                    System.out.println("Ошибка! Введите целое число");
                    scanner.next();
                }
            }
        
        
        
        

    }
}