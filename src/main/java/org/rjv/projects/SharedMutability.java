package org.rjv.projects;

import java.util.ArrayList;
import java.util.List;
//shared mutability is dangerous
public class SharedMutability {
    public static void main(String[] args) {
        int count=0;
        int failCount=0;
        while (count<50000) {
            List<String> l1 = List.of("raj", "aby", "tim", "tom", "mark");
            List<String> l2 = new ArrayList<>();//mutable object

            l1.stream().parallel()
                    .map(String::toUpperCase)
                    .forEach(l2::add);// shared inside lambda in parallel operation
            System.out.println("first list size is " + l1.size());
            System.out.println("second list size is " + l2.size());

            if(l1.size() != l2.size()) {
                System.out.println("****************************** failed ****************************************");
                failCount++;
               // break;
            }
            count++;
            System.out.println("failed count is " + failCount);
        }
    }
}
