import java.util.*;
public class Q3 {
    public static int ans_p=0,ans_w=0;
    public static void  solution(int a[][],int rows,int ir,int rs,int rw,int rp,int size,int weight)
    {
        if(ir==rows)
        {
            if(ans_p<=rp)
            {
                ans_p = rp;
                if (ans_w <= rw)
                    ans_w = rw;
            }
        }
        else
        {
            int c=ir;
            solution(a,rows,ir+1,rs,rw,rp,size,weight);
            if(rs+a[c][0]<=size && rw+a[c][1]<=weight)
                solution(a,rows,ir+1,rs+a[c][0],rw+a[c][1],rp+a[c][2],size,weight);
        }}
    public static void main(String[] args) {
        int objects[][] = {
                {8,3,2},
                {6,2,4},
                {10,4,3},
                {15,6,1},
                {5,1,5}
        };
        //size weight price
        //we have 3 rows and 3 fixed column
       for (int i = 0; i < objects.length; i++) {
       if(i>0)
            System.out.println();
            for (int j = 0; j < 3; j++)
                System.out.print(objects[i][j] + " "); }
        System.out.println();
        int size=10;
        int weight = 12;
        System.out.println("Capacity size "+size);
        System.out.println("Capacity weight "+weight);
        solution(objects,objects.length, 0, 0, 0, 0,size, weight);
        System.out.println("The Price is : "+ ans_p );
        System.out.println("The weight is : "+ ans_w);
    }}