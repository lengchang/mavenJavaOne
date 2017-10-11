import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/10 0010.
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args)
    {
        //Scanner 获取标准键盘输入
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        while(sc.hasNext())
        {
            System.out.println("键盘输入的内容是"+sc.next());
        }
    }
}