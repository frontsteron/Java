package org.example.Project_16.OOP5;

import static org.example.Project_16.OOP5.Model.*;
import static org.example.Project_16.OOP5.View.*;

public class Controller {
    public static void addListener() {
        // Добавлет чтение событий для каждой кнопки
        for (int i = 0; i < keys.length; i++) {
            buttons[i].addActionListener(e -> {
                String command = e.getActionCommand();  // Получает источник события
                if (command.equals(keys[3])) {
                    // Пользователь нажал клавишу "Назад"
                    pressBackspace();

                } else if (command.equals(keys[1])) {
                    // Пользователь нажал клавишу "CE"
                    resultText.setText("0");

                } else if (command.equals(keys[2])) {
                    // Пользователь нажал клавишу "C"
                    pressC();

                } else if ("0123456789.".contains(command)) {
                    // Пользователь нажал цифровую клавишу или клавишу с десятичной запятой
                    pressNumber(command);

                } else if (command.equals(keys[0]) || command.equals(keys[4]) || command.equals(keys[5]) || command.equals(keys[6]) || command.equals(keys[20])) {
                    // Пользователь нажимает арифметическую клавишу, для которой требуется только одно число (см. Обратное, %, квадратный корень, квадрат, принимать положительные и отрицательные числа)
                    singleOperator(command);

                } else {
                    doubleOperator(command);
                }
            });
        }
    }

}
