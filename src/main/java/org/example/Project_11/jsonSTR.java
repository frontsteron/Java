package org.example.Project_11;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class jsonSTR {
    // Дана json строка
    // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    // Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
    // Студент [фамилия] получил [оценка] по предмету [предмет].
    // Студент Иванов получил 5 по предмету Математика.
    // Студент Петрова получил 4 по предмету Информатика.
    // Студент Краснов получил 5 по предмету Физика.
         public static void main(String[] args) {
        String str = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        String[] filter = str.split(", ");

        for (int i = 0; i < filter.length; i++) {
            Object num = JSONValue.parse(filter[i]);
            JSONObject jsonObject = (JSONObject) num;

            String name = (String) jsonObject.get("фамилия");
            String grade = (String) jsonObject.get("оценка");
            String subject = (String) jsonObject.get("предмет");

            System.out.printf("Студент %s получил %s по предмету %s\n", name, grade, subject);
        }
    }
}