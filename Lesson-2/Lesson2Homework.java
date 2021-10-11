/**
 * Java 1. Homework 2
 * 
 * @author ValeriyArkhipenko
 * @version 11.10.2021
 */
 
 class Lesson2Homework {
     
     
     public static void main(String[] args) {
        //System.out.println(checkSumm(10,5));                   //закомментировал проверки выполнения
        printSign(25);                                           //в тех случаях, когда по заданию не нужен был вывод итогов
        //System.out.println (checkSign(25));
        printSomeWords("просто строка",3);
    }
    
    static boolean checkSumm(int a, int b) {                     // первое задание
        return ((a + b) >= 10 && (a + b) <= 20);
    }
    
    static void printSign(int num) {                             // второе задание
        System.out.println ((num>=0) ? "Pos":"Neg");
    }
    
    static boolean checkSign(int num) {                          // третье задание
        return ((num<0) ? true:false);
    }
    
    static void printSomeWords(String word, int times) {         // четвертое задание
        for (int i = 1;i <= times; i++) {
            System.out.println(word);
        }
 }
 }

//пятое делал через if..else.  Получилось, мягко говоря, громоздко. Решил все таки посмотреть правильное решение в гугле
//и понял, что просто не знаю оператор %. Пришлось дальше смотреть и понимать, как он работает. 
//Поэтому считаю неправильным просто копировать найденное решение. Но для себя понял, как решать подобные условия в будущем.  