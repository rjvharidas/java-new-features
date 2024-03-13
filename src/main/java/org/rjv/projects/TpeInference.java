package org.rjv.projects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TpeInference {
    public static void main(String[] args) {
        /*We create a collection of numbers, stored into a reference numbers of type Collection<
                Integer>. We print the values in the collection, remove the value 1, and
        print the result. The output reflects the original values in the collection and
        the collection after the value 1 was removed:*/

//        Collection<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
//        System.out.println(numbers);
//        numbers.remove(2);
//        System.out.println(numbers);

        var numbers = new ArrayList<Integer>(List.of(1, 2, 3));
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);

       /* Sadly, in this case, the numbers variable is no longer of type Collection<Integer>,
        but, instead, it is of type ArrayList<Integer>. This may not be an issue if the
        design of the collections library had no potential flaws that may lead to misuse.
        However, the output of the code after the change to use type inference is not
        the same as before the change:*/
    }
}
