package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = new int[20];
    
        new FibonacciInitializer().initialize(array);
        
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum = " + sum);
        
        new RandomInitializer(-50, 50).initialize(array);
        printArray(array);
        new BubbleSort().sort(array);
        System.out.print("BubbleSort: ");
        printArray(array);
        
        new RandomInitializer(-50, 50).initialize(array);
        printArray(array);
        new SelectionSort().sort(array);
        System.out.print("SelectionSort: ");
        printArray(array);
        
        new RandomInitializer(-50, 50).initialize(array);
        printArray(array);
        new ShellSort().sort(array);
        System.out.print("ShellSort: ");
        printArray(array);
        
       
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }

    private static void printArray(int[] array) {
        for (int i=0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length-1]);
    }
}
