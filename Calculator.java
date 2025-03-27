

public class Calculator {   //Класс калькулятор, который инкапсулирует логику работы калькулятора 
    private double numberOne;     //приватные поля для хранение чисел и результата
    private double numberTwo;
    private double result;
//Конструктор для инициализации чисел
public Calculator(double numberOne, double numberTwo) { 
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
}
//метод сложения
public double add(){
    result = numberOne + numberTwo; 
    return result;
}
//метод вычитания
public double subtract(){
    result = numberOne - numberTwo; 
    return result;
}
//метод умнржения
public double multiply(){
    result = numberOne * numberTwo;  
    return result;
}
//метод деления с проверкой деления на 0
public double divide(){
    
    if(numberTwo != 0){
        return numberOne / numberTwo; 
    }
    else{
        throw new ArithmeticException("Ошибка: деление на ноль невозможно.");
    }
    
}
//метод возведения в степень
public double power(){
    result = Math.pow(numberOne, numberTwo);  
    return result;
    
}
//метод вычисляет корень n-й степени из числа
public double degreeRoot(){
    if(numberTwo == 0){
        throw new ArithmeticException("Степень корня не может быть нулём");  
    }
    if(numberOne < 0 && numberTwo %2 == 0){
        throw new ArithmeticException("Чётный корень из отрицательного числа не существует");
    }
    return result = Math.pow(numberOne, 1.0 / numberTwo);
}

public double getNumberOne(){
    return numberOne;
}
public double getNumberTwo(){
    return numberTwo;
}
public double getResult(){
    return result;
}
}