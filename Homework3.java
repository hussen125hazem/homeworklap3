import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 06/02/2022.
 */
public class Homework3 {
    public static void transfer(Arraystack s,Arraystack t)
    {
        for (int i = s.size(); i >0; i--)
        {
            t.push(s.pop());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arraystack<Integer>s1=new Arraystack<>(3);
        Arraystack<Integer>s2=new Arraystack<>(3);
        System.out.println("Enter Element : ");
        for (int i = 0; i <3 ; i++)
        {
            s1.push(in.nextInt());
        }
        System.out.println("Size of s1 before : "+s1.size());
        System.out.println("Size of s2 before : "+s2.size());
        transfer(s1,s2);

        System.out.println("Size of s1 after : "+s1.size());
        System.out.println("Size of s2 after : "+s2.size());
    }
}
