package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 2, 2, 5, 6, 7,4);
        Set<Integer> set= DuplicateElementSetAdd(list);
        set.forEach(System.out::println);
    }

    private static Set<Integer> DuplicateElementSetAdd(List<Integer> list) {
        Set<Integer> set= new HashSet<>();
        return list.stream().filter(n ->!set.add(n)).collect(Collectors.toSet());

    }
}