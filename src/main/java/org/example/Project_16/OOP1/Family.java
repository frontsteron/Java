package org.example.Project_16.OOP1;

public class Family { // Поиск родственников
    static int N = 13; // Количество родственников
    static class Node {
        char val;
        Node[] child = new Node[N];

        Node(char Pip) {
            val = Pip;
            for (int i = 0; i < N; i++)
                child[i] = null;
        }
    }
    static void printChild(Node root, char Pip, int chain) { // Обход заданного дерева до указанного значения
        if (root.val == Pip) // Если Pip текущий корень
        {
            if (root.child[chain - 1] == null)
                System.out.print("Ошибка: Данных не существует\n");
            else
                System.out.print(root.child[chain - 1].val + "\n");
        }
        for (int i = 0; i < N; i++) // Если Pip лежит в поддереве
            if (root.child[i] != null)
                printChild(root.child[i], Pip, chain);
    }
    public static void main(String[] args) {
        Node root = new Node('A'); // 1
        root.child[0] = new Node('B'); // 2
        root.child[1] = new Node('C'); // 3
        root.child[2] = new Node('D'); // 4
        root.child[3] = new Node('E'); // 5
        root.child[0].child[0] = new Node('F'); // 6
        root.child[0].child[1] = new Node('G'); // 7
        root.child[2].child[0] = new Node('H'); // 8
        root.child[0].child[0].child[0] = new Node('I'); // 9
        root.child[0].child[0].child[1] = new Node('J'); // 10
        root.child[0].child[0].child[2] = new Node('K'); // 11
        root.child[2].child[0].child[0] = new Node('L'); // 12
        root.child[2].child[0].child[1] = new Node('M'); // 13

        char Pip = 'F';
        System.out.print("Третий ребёнок: ");
        printChild(root, Pip, 3);

        Pip = 'A';
        System.out.print("Четвертый ребёнок: ");
        printChild(root, Pip, 4);
    }
}