package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementUsingStreamMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,2,4,5,6,6,7,1);
        Set<Integer> set = FindDuplicateElementByFrequency(list);
        set.forEach(System.out::println);

    }

       private static Set<Integer> FindDuplicateElementByFrequency(List<Integer> list) {
       return list.stream().filter(i -> Collections.frequency(list, i)>1).collect(Collectors.toSet());
    }
}



