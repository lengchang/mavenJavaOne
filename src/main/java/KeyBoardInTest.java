import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/10/10 0010.
 */
public class KeyBoardInTest {
    public static void main(String[] args) throws Exception
    {
        //BufferedReader总是读取String对象，不能读取基本类型输入量
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = br.readLine())!=null)
        {
            System.out.println(line);
        }
    }
}
