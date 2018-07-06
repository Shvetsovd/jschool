import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (i1, i2) -> 0;
        Set<Integer> set = new TreeSet<>(comparator);
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set);
        System.out.println(set.size());


    }
}
class SetTest2{
    private SortedSet<Integer> set = new TreeSet<>();
    public static void main(String[] args) {
        SetTest2 st = new SetTest2();
        st.fill();

        /*st.getNextElement1(5);
        st.getPrevElems1(5);
        st.getNextElement1(6);
        st.getPrevElems1(6);*/

        st.getNextElement2(5);
        st.getPrevElems2(5);
        st.getNextElement2(6);
        st.getPrevElems2(6);
    }
    private void fill(){
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
    }
    private void getNextElement1(Integer elem){
        if (!set.contains(elem)){
            throw new NoSuchElementException("No element is set: " + elem);
        }
            Iterator<Integer> iter = set.iterator();
            while (iter.hasNext()){
                Integer i = iter.next();
                if (i.equals(elem) && iter.hasNext()){
                    System.out.println(iter.next());
                    break;
                }
            }
    }


    private void getPrevElems1(Integer elem){
        if (!set.contains(elem)){
            throw new NoSuchElementException("No element is set: " + elem);
        }
        Iterator<Integer> iter = set.iterator();
        System.out.print("[");
        while (iter.hasNext()){
            Integer i = iter.next();
            if (!i.equals(elem)){
                System.out.print(i + " ");
            } else {
                System.out.println("]");
                break;
            }
        }
    }

    private void getNextElement2(Integer elem){
        set.stream()
                .filter(e->e>elem)
                .findFirst()
                .ifPresent(System.out::println);
    }
    private void getPrevElems2(Integer elem){
        set.stream()
                .filter(e->e<elem)
                .forEach(System.out::println);
    }
}
