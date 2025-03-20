public class Calculator {   //Класс калькулятор, который инкапсулирует логику работы калькулятора 
    private int numberOne;     //приватные поля для хранение чисел и результата
    private int numberTwo;
    private int result;
}
public Calculator(int numberOne, int numberTwo) { //Конструктор для инициализации чисел
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
}

public int add(){
    result = numberOne + numberTwo; //метод сложения
    return result;
}

public int subtract(){
    result = numberOne - numberTwo; //метод вычитания
    return result;
}

public int multiply(){
    result = numberOne * numberTwo;  //метод умнржения
    return result;
}

public int divide(){
    
    if(numberTwo != 0){
        return numberOne / numberTwo; //метод деления с проверкой деления на 0
    }
    else{
        throw new ArithmeticException("Ошибка: деление на ноль невозможно.");
    }
    return result;
}


public int getNumberOne(){
    return numberOne;
}
public int getNumberTwo(){
    return numberTwo;
}
public int getResult(){
    return result;
}