package Lesson4;

public class Bubble {
//    public static void main (String[] args) {
//        int[] intArray = {31, 432, 3, 42, 51, 999, -1};
//        boolean flag = true; //ініціалізація флагу true для роботи з циклом
//        int temp; //зміна для зберігання значення елемента масиву
//        while (flag){
//            flag = false; //встановлення флагу false
//            for (int i = 0; i < intArray.length - 1;i++) {
//                if (intArray[i] > intArray[i + 1]) { //порівняння елементів масиву
//                    temp = intArray[i]; //зберігання значення елемента масиву
//                    intArray[i] = intArray[i + 1]; //заміна елементу масиву
//                    intArray[i + 1] = temp; //заміна елементу масиву
//                    flag = true;//встановлення флагу true для повторного проходження
//                }
//            }
//        }
//        for (int num: intArray){
//            System.out.println(num + " ");
//        }
//    }

    //ДЗ: використовуючи 2 for переписати сортування бульбашкою, щоб не було циклу while
        public static void main(String[] args) {
            int[] intArray = {31, 432, 3, 42, 51, 999, -1, -2, -100};

            int temp;

            for (int pass = 0; pass < intArray.length - 1; pass++) {
                for (int i = 0; i < intArray.length - 1 - pass; i++) {
                    if (intArray[i] > intArray[i + 1]) {
                        temp = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = temp;
                    }
                }
            }
            for (int num : intArray) {
                System.out.print(num + " ");
            }
        }

}


