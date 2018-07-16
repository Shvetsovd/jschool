import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task {
    static <T> void addAll(Collection<? extends T> src, Collection<? super T> dst){
        dst.addAll(src);
    }
    static <T> long countContains(Collection<? extends T> collection, T elem){
        return collection.stream()
                .filter(e -> e.equals(elem))
                .count();
    }

}
interface CanCalcDistance<T>{
    int calcDistance(T other);
}
class Clazz{
    public static <T extends CanCalcDistance<? super T> & Comparable<? super T>>
    T findMax(final List<? extends T> container, T target){
        return null;
    }
}

