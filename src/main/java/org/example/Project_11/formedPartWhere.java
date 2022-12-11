package org.example.Project_11;

public class formedPartWhere {
     // Дана строка sql-запроса "select * from students where ".
     // Сформируйте часть WHERE этого запроса, используя StringBuilder.
     // Данные для фильтрации приведены ниже в виде json строки.
     // Если значение null, то параметр не должен попадать в запрос.
     // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    public static void main(String[] args) {
        String str = "{\"name\": \"Ivanov\", \"country\": \"Russia\", \"city\": \"Moscow\", \"age\": \"null\"}";
        System.out.println(SQLRequest(str));
    }
    private static String SQLRequest(String request) {
        request = request.substring(1, request.length() - 1);
        System.out.println(request);

        String[] attributes = request.split(", ");

        StringBuilder SQLrequest = new StringBuilder("select * from students where");

        for (int i = 0; i < attributes.length; i++) {
            String[] pair = attributes[i].split(":");
            String value = pair[1];

            if (!value.equals("\"null\"")) {
                String key = pair[0].substring(1, pair[0].length() - 1);

                if (i != 0) {
                    SQLrequest.append(" and");
                }
                SQLrequest.append(" ").append(key).append(" = ").append(value);
            }
        }
        return SQLrequest.toString();
    }
}