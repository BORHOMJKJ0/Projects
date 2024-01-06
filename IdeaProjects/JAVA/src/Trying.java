import com.sun.source.tree.SynchronizedTree;
import javax.xml.crypto.Data;
import java.util.*;
import java.util.Random;

public class Trying extends Thread implements Runnable
{

    @Override
    public void run() {
        try
        {  Random r=new Random();Double d;
        for (int i = 0; i < 99; i++)
        {
            d = r.nextDouble(99);
        System.out.println(d);
        Thread.sleep(1000);
    }}
            catch (Exception e)
             {
                System.out.println(e.getMessage());
             }
        }
    }
