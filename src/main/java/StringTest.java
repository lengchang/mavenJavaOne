/**
 * Created by Administrator on 2017/10/11 0011.
 */
public class StringTest {
    public static void main(String[] args){
        String s = new String("abcdefghijklmnopqrstuvwxyz");
        System.out.println("s.charAt(5):"+s.charAt(5));//从零开始
        String s1 = new String("abcdefghijklmnopqrstuvwxyzaa");
        String s2 = new String("abcdefghijk");
        String s3 = new String("abcdefghijklabcdefghijklmno");
        System.out.println("s1.compareTo(s2):"+s1.compareTo(s2));//缺少部分的个数
        System.out.println("s1.compareTo(s3):"+s1.compareTo(s3));//相同的部分的最后位置
        String s4 = new String("abcdefghijklmn");
        String s5 = new String("jklmn");
        System.out.println("s4.endsWith(s5):"+s4.endsWith(s5));
    }
}
