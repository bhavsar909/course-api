package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");
        arrayList.add("test4");
        arrayList.add("test5");
        arrayList.add("test6");
        arrayList.add("test7");
        arrayList.add("raj1");
        arrayList.add("raj2");
        arrayList.add("raj3");

        List<String> result = arrayList.stream().filter(s -> s.contains("est")).collect(Collectors.toList());
        System.out.println(result);




        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(7);
        integerArrayList.add(10);
        integerArrayList.add(12);
        integerArrayList.add(21);
        integerArrayList.add(6);
        integerArrayList.add(8);

        List<Integer> evenNumbers = integerArrayList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println(integerArrayList.stream().map(integer -> integer*2).collect(Collectors.toList()));

        System.out.println(integerArrayList.stream().filter(integer -> integer%2 == 0).count());

        System.out.println(integerArrayList.stream().sorted().collect(Collectors.toList()));

        System.out.println(integerArrayList.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList()));

        System.out.println(integerArrayList.stream().min((i1,i2) -> i1.compareTo(i2)));

        System.out.println(integerArrayList.stream().max((i1,i2) -> i1.compareTo(i2)));

    }
}
