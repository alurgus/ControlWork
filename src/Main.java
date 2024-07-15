//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк,
//длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры,
//либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться
//коллекциями, лучше обойтись исключительно массивами.


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         String[] array = new String[] {"odin", "dva", "tri", "mm", "chetyre", "pyat'", "shest'", "sem'", "vosem'"};
//        for (int i = 0; i < array.length; i++) {
//
//        }
        int l = 0;
        for (String s : array) {
            if(s.length() <=3){
                l++;
            }
        }
        String[] arrayNew = new String[l];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()<=3){
                arrayNew[n] = array[i];

                n++;
            }

        }

        System.out.println(Arrays.toString(arrayNew));
    }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

}