import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        SearchMaxMinAverInList ();
    }


    //    1. Реализовать алгоритм сортировки слиянием
    static void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


//    2. Пусть дан произвольный список целых чисел, удалить из него четные числа
        static void DisplayOddNum () {
            Random rand = new Random();
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(rand.nextInt(100));
                }
            System.out.println("Исходный список: " + list);
            for (int i = 0; i < list.size(); i++) {
                    if (list.get(i)%2!=0) res.add(list.get(i));
                }
            System.out.println("Результирующий список: "+res);
        }
//    3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
    static void SearchMaxMinAverInList () {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        int max = list.get(0);
        int min = list.get(0);

        int per;
        System.out.println("Исходный список: " + list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)>max) max = list.get(i);
            if (list.get(i)<min) min = list.get(i);
        }
        int av = (max+min)/2;
        int aver = Math.abs(av - list.get(0));
        int avres = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == av) {
                avres = list.get(i);
                break;
            }
            if ((Math.abs(list.get(i)-av)) < aver) {
                aver = Math.abs(av - list.get(i));
                avres = list.get(i);
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Aver: "+ avres);

    }

    }