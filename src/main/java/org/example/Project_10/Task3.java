//Реализовать простой калькулятор.

package org.example.Project_10;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numOne = getInt();
        int numTwo = getInt();
        char operation = getOperation();
        int result = calc(numOne,numTwo,operation);
        System.out.print("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.print("Введите число: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.print("Введите операцию: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}