package org.example.Project_16.OOP5;

import javax.swing.*;
import java.awt.*;

import static org.example.Project_16.OOP5.Controller.addListener;

public class View {
    public static JFrame frame = new JFrame();
    public final static String[] keys = {"%", "CE", "C", "Back", "1⁄x", "x²", "√x", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "="};
    public static MyButton[] buttons = new MyButton[keys.length];  // Кнопка калькултора
    public static JTextField resultText = new JTextField("0");  // Отображает текстовое поле результата вычисления

    public View() {
        init();
        addListener();
    }

    /**
     * Инициализируем калькулятор
     */
    private void init() {
        Color color1 = new Color(200, 200, 200);  // Цвет фона
        Color color2 = new Color(140, 140, 140);  // Эксклюзивный цвет знака равенства
        Color color3 = new Color(230, 230, 230);  // Цвет функциональной клавиши
        Color color4 = new Color(240, 240, 240);  // Цифровой цвет

        // Создает доску для рисования и помещает текстовое поле
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(resultText);
        resultText.setFont(new Font("Kai body", Font.BOLD, 42));  // Установите шрифт и размер текста в текстовом поле, выделите жирным шрифтом
        resultText.setHorizontalAlignment(JTextField.RIGHT);  // Содержимое текстового поля выровнено по правому краю
        resultText.setEditable(false);  // Не удается изменить текстовое поле результата
        resultText.setBorder(null);  // Удаляет границу текстового поля
        // Установите цвет фона текстового поля
        resultText.setBackground(color1);
        // Инициализирует кнопку на калькуляторе и поместите кнопку на доску
        JPanel keysPanel = new JPanel();
        // Используя макет сетки, сетку из 6 строк и 4 столбца, расстояние по горизонтали и вертикали между сетками составляет 2px
        keysPanel.setLayout(new GridLayout(6, 4, 2, 2));
        // Функциональная кнопка инициализации
        for (int i = 0; i < 8; i++) {
            buttons[i] = new MyButton(keys[i], color3);
            keysPanel.add(buttons[i]);
            buttons[i].setBackground(color3);
            buttons[i].setForeground(Color.black);
            buttons[i].setFont(new Font(Font.SERIF, Font.PLAIN, 18));
            buttons[i].setBorderPainted(false);  // Удаляет границу кнопки
        }
        // Кнопка инициализации оператора и клавиши
        for (int i = 8; i < keys.length; i++) {
            if ((i + 1) % 4 == 0) buttons[i] = new MyButton(keys[i], color3);
            else buttons[i] = new MyButton(keys[i], color4);
            keysPanel.add(buttons[i]);
            buttons[i].setForeground(Color.black);
            buttons[i].setFont(new Font(Font.SERIF, Font.PLAIN, 18));
            buttons[i].setBorderPainted(false);  // Удалите границу кнопки
        }
        buttons[23].setBackground(color2);  // Кнопка '=' использует специальный цвет
        keysPanel.setBackground(color1);
        // Поместите панель на которой расположено текстовое поле, вниз калькулятора, а панель клавиш в середину калькулятора
        frame.getContentPane().add("Север", textPanel);
        frame.getContentPane().add("Центр", keysPanel);
        textPanel.setBorder(BorderFactory.createMatteBorder(25, 3, 1, 3, color1));
        keysPanel.setBorder(BorderFactory.createMatteBorder(6, 3, 3, 3, color1));
        ImageIcon imageIcon=new ImageIcon("1.ico");
        frame.setIconImage(imageIcon.getImage());
        frame.setTitle("Calculator");
        frame.setSize(360, 450);
        frame.setLocation(500, 300);
        frame.setResizable(true);  // Позволяет изменять размер окна калькулятора
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}