/**
 * Created by Administrator on 2017/10/8 0008.
 */
public class Gctest {
    public static void main(String[] args)
    {
        for (int i=0;i<4;i++)
        {
            new Gctest();
            Runtime.getRuntime().gc();
        }
    }
    public void finalizes()
    {
        System.out.println("系统正在处理垃圾");
    }
}
