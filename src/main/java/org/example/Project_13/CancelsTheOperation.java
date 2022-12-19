package org.example.Project_13;

import java.util.Scanner;
import java.util.LinkedList;
public class CancelsTheOperation {

    // В калькулятор добавьте возможность отменить последнюю операцию

    public static void main(String[] args) {
        float numOne;
        float numTwo;
        float result;
        char operation;
        int del;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите 1ое число: ");
        numOne = input.nextFloat();
        System.out.print("Введите 2ое число: ");
        numTwo = input.nextFloat();
        System.out.print("Введите операцию(+, -, *, /): ");
        operation = input.next().charAt(0);

        LinkedList<Object> operations = new LinkedList<>();
        switch(operation) {
            case '+': result = numOne + numTwo;
                break;
            case '-': result = numOne - numTwo;
                break;
            case '*': result = numOne * numTwo;
                break;
            case '/': result = numOne / numTwo;
                break;
            default:  System.out.print("Неправильный ввод знака!");
                return;
        }
        operations.add(numOne);
        operations.add(operation);
        operations.add(numTwo);
        operations.add(result);

        System.out.println(operations);
        System.out.printf("%f %c %f =" + result + "\n", numOne, operation, numTwo);

        System.out.print("Для отмены последней операции введите 123: ");
        del = input.nextInt();

        if (del == 123) {
            operations.removeLast();
        }

        System.out.print(operations);
    }
}