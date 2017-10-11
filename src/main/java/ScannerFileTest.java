import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/10 0010.
 */
public class ScannerFileTest {
    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(new File("this.txt"));//在idea中找不到，不知道为什么
            System.out.println("ScannerFileTest的内容如下：");
            while (sc.hasNextLine())
            {
                //hasNextLine  nextLine表示逐行读取
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
