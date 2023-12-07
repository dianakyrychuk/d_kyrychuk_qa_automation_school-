package Lesson4;

public class Main {
    //За допомогою 2 for та циклу while реалізувати виведення в консоль фігуру Трикутник

    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {

            for (int s = rows - i; s > 0; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
