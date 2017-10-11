/**
 * Created by Administrator on 2017/10/10 0010.
 */
public class RuntimeTest {
    public static void main(String[] args)
    {
        //获取java关联的运行时对象
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器数量:"+runtime.availableProcessors()+"空闲内存数"+runtime.freeMemory()
                +"总内存数"+runtime.totalMemory()+"可用最大内存数"+runtime.maxMemory());
    }
}
