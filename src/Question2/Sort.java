package Question2;

import java.util.Comparator;

public class Sort{

    public void sort(Object[] data, Comparator comp){
        for (int i = 0; i < data.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < data.length; j++) {
                if (comp.compare(data[j], data[minPos]) < 0) {
                    minPos = j;
                }
            }

            Object temp = data[minPos];
            data[minPos] = data[i];
            data[i] = temp;
        }

        for(Object x: data){
            System.out.println(x);
        }

    }



}
