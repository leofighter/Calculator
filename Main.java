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
        
        /* 
        int numberOne = 0;
        if (scanner.hasNextInt()) { // Проверяем, является ли ввод целым числом
            numberOne = scanner.nextInt(); // Считываем целое число
            System.out.println("Вы ввели целое число: " + numberOne+ "\n");
        } else {
            System.out.println("Ошибка: введите целое число.");
        }
        

        System.out.println("Введите второе число:");
       
        int numberTwo = 0;
        if (scanner.hasNextInt()) { // Проверяем, является ли ввод целым числом
            numberTwo = scanner.nextInt(); // Считываем целое число
            System.out.println("Вы ввели целое число: " + numberTwo+ "\n");
        } else {
            System.out.println("Ошибка: введите целое число.");
        }
        

        System.out.println("""
        Введите номер операции которую хотите выбрать: + \n
        1.Сложение
        2.Вычитание
        3.Умножение
        4.Деление
        """);
        
        

        int expUser = 0;
        
        if (scanner.hasNextInt()) { // Проверяем, является ли ввод целым числом
            expUser = scanner.nextInt(); // Считываем целое число
            System.out.println("Вы выбрали " + expUser);
        } else {
            System.out.println("Ошибка: введите целое число от 1 до 4.");
        }
    
        scanner.close();

        if (expUser >= 1 && expUser <= 4) {
        
        int result = 0;
        if (expUser == 1){
            result = numberOne + numberTwo;
            System.out.print(numberOne +" сложить с " + numberTwo + " получится: "+ result);
        }
        else if(expUser == 2){
            result = numberOne - numberTwo;
            System.out.print(numberOne +" вычесть " + numberTwo + " получится: "+ result);
        }
        else if(expUser == 3){
            result = numberOne * numberTwo;
            System.out.print(numberOne +" умножить на " + numberTwo + " получится: "+ result);
        }
        else if(expUser == 4){
            if(numberTwo != 0){
            result = numberOne / numberTwo;
            System.out.print(numberOne +" разделить на " + numberTwo + " получится: "+ result);}
            else {
                System.out.print("Делить на ноль - нельзя! Перезапустите программу.");
            }

        }
    }
        else {
            System.out.println("Ошибка: введите число от 1 до 4.");
        }

    */
        

    }
}