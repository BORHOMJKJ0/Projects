import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void autocom(ArrayList<String>words,String aut)
    {
        for(int i=0;i<words.size();i++)
        {
            int y=0;
            for(int k=0;k<aut.length();k++)
            {
                if(words.get(i).charAt(k)!=aut.charAt(k))
                {
                    y=1;
                    break;
                }
            if(y==0)
                System.out.println(words.get(i));
        }
    }}
    public static void check(ArrayList<String>words,String check)
    {
        int j=0;
        for(int i=0;i< words.size();i++)
            if(check.equals(words.get(i)))
            {
                j=1;
                break;
            }
        if(j==0)
            System.out.println("This word don't found in the dictionary \n");
        else
            System.out.println("This word found in the dictionary \n");
    }
    public static void add(ArrayList<String> words, String a[]) {
        for (String value : a) {
            boolean found = false;
            for (String word : words) {
                if (word.equals(value)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                words.add(value);
            }
        }
    }
    public static void main(String[] args){
        String []a={"String","float","Class","for"};
        String []b={"void","int","JAVA","JAVA"};
        ArrayList<String>words=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        words.add(a[i]);
        add(words,b);
        System.out.println("Solution 1 :");
        for(int i=0;i< words.size();i++)
            System.out.println(words.get(i));
        System.out.println("Solution 2 :");
      check(words,"Jh");
        System.out.println("Solution 3 :");
    autocom(words,"J");
                }

}
