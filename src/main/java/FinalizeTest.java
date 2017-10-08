/**
 * Created by Administrator on 2017/10/8 0008.
 */
public class FinalizeTest {
    public static FinalizeTest ft = null;
    public void info()
    {
        System.out.println("测试清理资源的方法");
    }
    public static void main(String[] args)
    {
        new FinalizeTest();
        System.gc();

        //强制垃圾回收机制调用可恢复对象的finalize方法
        Runtime.getRuntime().runFinalization();
        //或者是System.runFinalization();



//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        ft.info();
    }
    public void finalize()
    {
        ft = this;
    }
}
