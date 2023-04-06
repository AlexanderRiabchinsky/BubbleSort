import java.util.*;

public class Main {
    public static void bubbleSort(int[] sortArr,Set<Integer> resultSet){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] == sortArr[j]) {
                    resultSet.add(sortArr[j]);
                }
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) {
        Set<Integer> resultSet= new HashSet<>();
        int[] sortArr = {12, 6, 4, 1, 15, 10, 1, 6, 22, 6};
        System.out.println("Первоначальный массив: "+ Arrays.toString(sortArr));
        bubbleSort(sortArr,resultSet);
        System.out.println("Первоначальный массив после сортировки: "+ Arrays.toString(sortArr));
        System.out.println("Повторяющиеся элементы: "+resultSet.toString());
    }
}
