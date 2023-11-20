package DAAASSIGNMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BacketSort {
    public void bs(int[] arr) {
        int len = arr.length;
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            li.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            int index = (arr[i] / 10);
            li.get(index).add(arr[i]);
        }
        int k = 0;
        for (int i = 0; i < 10; i++) {
            List<Integer> temp = li.get(i);
            Collections.sort(temp);
            for (int j = 0; j < temp.size(); j++) {
                arr[k] = temp.get(j);
                k++;
            }
        }
    }

}


