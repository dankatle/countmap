import java.util.*;

public class CountMaplml<T> implements CountMap<T> {
    private final List<Pair<T, Integer>> list = new ArrayList<>();

    @Override
    public void add(T t) {
        Pair<T, Integer> pair = new Pair<>(t, 1);
        list.stream().
                filter(tIntegerPair -> tIntegerPair.getKey() == t).
                map(tIntegerPair -> tIntegerPair.getValue() + 1).
                forEach(pair::setValue);

        list.removeIf(tIntegerPair -> tIntegerPair.getKey().equals(t));

        list.add(pair);
    }

    @Override
    public int getCount(T t) {
        int count = 0;
        for (Pair<T, Integer> tIntegerPair : list) {
            if (t.equals(tIntegerPair.getKey())) {
                count = tIntegerPair.getValue();
            }
        }
        return count;
    }

    @Override
    public int remove(T t) {
        int count = getCount(t);
        list.stream()
                .filter(tIntegerPair -> tIntegerPair.getKey().equals(t))
                .findAny()
                .map(tIntegerPair -> {
                    list.remove(tIntegerPair);
                    return tIntegerPair;
                });
        return count;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void addAll(CountMap<T> source) {

    }

    @Override
    public Map<T, Integer> toMap() {
        Map<T, Integer> map = new HashMap<>();
        list.forEach((b) -> map.put(b.getKey(), b.getValue()));
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        list.forEach(b -> destination.put(b.getKey(), b.getValue()));
    }
}
