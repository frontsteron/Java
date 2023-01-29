package org.example.Project_16.OOP5;

import java.text.DecimalFormat;
import static org.example.Project_16.OOP5.View.resultText;
public class Model {

    private static boolean firstDigit = true;  // Отметьте, нажал ли пользователь первую цифру всего выражения или первую цифру после оператора
    private static double resultNum = 0.0000;   // Промежуточный результат расчета
    private static String operator = "=";   // Оператор текущей операции (вам нужно восстановить его в "=" при нажатии "C")
    private static boolean operateValidFlag = true;   // Определяем, возможна ли операция

    public static void pressBackspace() {
        String text = resultText.getText();
        int i = text.length();
        if (i > 0) {
            text = text.substring(0, i - 1);  // Пробел, удаляем последнего символв текста
            if (text.length() == 0) {
                // Если текст не содержит содержимого, инициализируем различные значения
                resultText.setText("0");
                firstDigit = true;
                operator = "="; }
            else {

                resultText.setText(text);
            }
        }
    }

    /**
     * Обрабатываем нажатие клавиши C
     */
    public static void pressC() {
        // Инициализируем различные значения калькулятора
        resultText.setText("0");
        firstDigit = true;
        operator = "=";
    }

    /**
     * Обрабатываем нажатие по клавиши
     */
    public static void pressNumber(String key) {
        if (firstDigit) {
            // Ввод первого числа
            resultText.setText(key);

        } else if ((key.equals(".")) && (!resultText.getText().contains("."))) {
            // Входные данные представляют собой точку, и перед ними нет точки, точка будет прикреплена к задней части текстового поля результата
            resultText.setText(resultText.getText() + ".");

        } else if (!key.equals(".")) {
            // Если ввод не является точкой, добавьте число в конце текстового поля
            resultText.setText(resultText.getText() + key);
        }
        firstDigit = false;
    }

    /**
     * Обрабатываем событие, когда нажата клавиша
     */
    // Только ряд операций
    public static void singleOperator(String key) {
        operator = key;  // Оператор - это кнопка, нажатая пользователем
        switch (operator) {
            case "1⁄x":
                // Взаимное действие
                if (resultNum == 0) {
                    operateValidFlag = false;  // Операция невозможна
                    resultText.setText("Ноль не имеет обратного отсчета");
                } else {
                    resultNum = 1 / getNumberFromText();
                    omitDecimal(resultNum);
                }
                break;
            case "√x":
                // Операция с квадратным корнем
                if (resultNum < 0) {
                    operateValidFlag = false;  // Операция невозможна
                    resultText.setText("Корневой знак не может быть отрицательным");
                } else {
                    resultNum = Math.sqrt(getNumberFromText());
                    omitDecimal(resultNum);
                }
                break;
            case "x²":
                // Квадратная операция
                resultNum = getNumberFromText() * getNumberFromText();
                omitDecimal(resultNum);
                break;
            case "%":
                // Операция со знаком процента, деление на 100
                resultNum = getNumberFromText() / 100;
                resultText.setText(String.valueOf(resultNum));
                break;
            case "+/-":
                // Положительные и отрицательные операции
                resultNum = getNumberFromText() * (-1);
                if (operateValidFlag) {
                    // Когда операция возможна, результатом является число с 4 цифрами после запятой и целое число выводится нормально
                    omitDecimal(resultNum);
                }
                firstDigit = true;
                operateValidFlag = true;
                break;
        }
    }

    // Две нужные операции
    public static void doubleOperator(String key) {
        switch (operator) {
            case "÷":
                // Операция деления
                // Если значение в текстовом поле текущего результата равно 0
                if (getNumberFromText() == 0.0) {
                    operateValidFlag = false;  // Операция невозможна
                    resultText.setText("Делитель не может быть равен нулю");
                } else {
                    resultNum /= getNumberFromText();
                }
                break;
            case "+":
                // операция сложения
                resultNum += getNumberFromText();
                break;
            case "-":
                // операция вычитания
                resultNum -= getNumberFromText();
                break;
            case "×":
                // операция умножения
                resultNum *= getNumberFromText();
                break;
            case "=":
                // Операция приравнивания
                resultNum = getNumberFromText();
                break;
        }
        omitDecimal(resultNum);
        operator = key;  // Оператор - это кнопка, нажатая пользователем
        firstDigit = true;
        operateValidFlag = true;
    }

    public static void omitDecimal(double resultNum) {
        long t1;
        double t2;
        t1 = (long) resultNum;
        t2 = resultNum - t1;
        if (t2 == 0) {
            resultText.setText(String.valueOf(t1));
        } else {
            resultText.setText(String.valueOf(new DecimalFormat("0.00000000").format(resultNum)));
        }
    }

    /**
     * Получите число из поля текстового результата
     */
    public static double getNumberFromText() {
        double result = 0;
        try {
            result = Double.parseDouble(resultText.getText());
        } catch (NumberFormatException ignored) {
        }
        return result;
    }
}