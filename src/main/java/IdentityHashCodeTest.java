/**
 * Created by Administrator on 2017/10/10 0010.
 */
public class IdentityHashCodeTest {
    public static void main(String[] args)
    {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        //String 重写了hashCode()方法，改为了根据字符串序列计算hashCode值
        //因为s1，s2的字符串序列相等，所以他们的hashCode()的返回值相等
        System.out.println(s1.hashCode()==s2.hashCode());
        //但是，两者的hashCode实际上并不相等，他们并不是同一个字符串对象
        System.out.println(System.identityHashCode(s1)==System.identityHashCode(s2));

        String s3 = "Hello";
        String s4 = "Hello";
        //s3,s4是相同的字符串对象，实际上都是String的静态字符串(还是什么的)缓冲池中的同一个
        //所以两者的hashCode实际上是相等的
        System.out.println(System.identityHashCode(s3)==System.identityHashCode(s4));
    }
}
