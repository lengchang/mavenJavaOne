import java.util.Objects;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
public class ObjectsTest {
    static ObjectsTest obj;
    public static void main(String[] args)
    {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj));


    }
}
