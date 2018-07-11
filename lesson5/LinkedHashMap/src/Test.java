import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        initAndPrint(map);
        map = new LinkedHashMap<>(5, 0.75f, true);
        initAndPrint(map);
    }

    private static void initAndPrint(Map<Integer, String> map) {
        String[] strings = {"a", "b", "c", "d", "e"};

        for (int i = 5; i > 0; i--) {
            map.put(i, strings[i-1]);
        }
        System.out.println(map);
    }
}
class SuperLRUCache<K, V> extends LinkedHashMap<K, V>{
    final private int capacity;

    SuperLRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        if (capacity < this.size()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new SuperLRUCache<>(5);
        test(map);

    }

    private static void test(Map<Integer, Integer> map) {
        for (int i = 0; i < 10; i++) {
            map.put(i, i*i);
            System.out.println(map);
        }
    }
}
