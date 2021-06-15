import java.util.HashMap;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);
        countMap.add(10);
        System.out.println(countMap.getCount(10));
        System.out.println(countMap.getCount(5));
        System.out.println(countMap.getCount(6));

        System.out.println(countMap.toString());
        System.out.println(countMap.size());

        Map<Integer, Integer> hashMap = countMap.toMap();

    }
}
