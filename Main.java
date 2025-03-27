import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = getValidDoubleInput(scanner, "Введите первое число.");

        double numberTwo = getValidDoubleInput(scanner, "Введите второе число.");

        Calculator calculator = new Calculator(numberOne, numberTwo);

        System.out.println("""
        Введите номер операции которую хотите выбрать: 
        1.Сложение.
        2.Вычитание.
        3.Умножение.
        4.Деление.
        5.Возведение в степень.
        6.Корень в степени(1-ое - число, 2-ое степень корня)
        """);

        int operation = getValidIntInput(scanner, "Введите номер операции (1-6)");

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

                case 5 : System.out.println(numberOne +" в степени "+ numberTwo+ " = "+ calculator.power());
                break;

                case 6 : System.out.printf("%.0f\u221A%.0f = %.4f", 
                numberTwo,    // степень корня
                numberOne,    // подкоренное выражение
                calculator.degreeRoot());
                break;

                default:
                System.out.println("Ошибка! Введите число от 1 до 6.");
                
        }
        scanner.close();
    }
        //Метод для получения целого числа
        private static int getValidIntInput(Scanner scanner, String message){  
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
            //Метод для получения числа типа double
            private static double getValidDoubleInput(Scanner scanner, String message){  
                while (true){
                    System.out.println(message);
                    try {
                        return scanner.nextDouble(); //считываем число double
                    }
                    catch(InputMismatchException e){
                        System.out.println("Ошибка! Введите число");
                        scanner.next();
                    }
    
                    
                }
            
        
        
        

    }
}