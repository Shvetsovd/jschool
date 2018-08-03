import java.lang.annotation.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SuperService {
    boolean LazyLoad () default false;
}

@SuperService (LazyLoad = true)
class A{
    @Override
    public String toString() {
        return "A()";
    }
}

@SuperService (LazyLoad = false)
class B{
    @Override
    public String toString() {
        return "B()";
    }
}
class SuperServiceAnnoTest{
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(new A(), new B());
        Map<String, Object> map = new HashMap<>();

        for (Object o : list) {
            if (o.getClass().isAnnotationPresent(SuperService.class)
                    && !o.getClass().getAnnotation(SuperService.class).LazyLoad()){
             map.put(o.getClass().getSimpleName(), o);
            }
        }

        System.out.println(map);
    }
}

