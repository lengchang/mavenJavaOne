/**
 * Created by Administrator on 2017/10/10 0010.
 */
public class ExecTest {
    public static void main(String[] args) throws Exception
    {
        //Runtime可以直接单独启动一个进程来执行操作系统的命令
        Runtime rt = Runtime.getRuntime();
        // 运行记事本程序
        rt.exec("notepad.exe");
    }
}
