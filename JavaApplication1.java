package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author FűrészBence(SZF_2022
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> nevek =new  ArrayList<>();
        nevek.add("Pál");
        nevek.add("Peti");
        nevek.add("Pista");
        nevek.add("Zorad");
       
        HashMap<String, Integer> nevekMap = new HashMap<>();
        for (String nev : nevek) {
            String kulcs = nev;
            if (nevekMap.containsKey(kulcs)) {
                int ertek = nevekMap.get(kulcs);
                nevekMap.put(kulcs, ++ertek);
               
            } else {
                nevekMap.put(kulcs, 1);
            }

        }
        for (Map.Entry<String, Integer> entry : nevekMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("%9s: %2s db\n",key,value);
     
        }

    }

}
