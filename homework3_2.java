import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 06/02/2022.
 */
public class homework3_2 {
    public static void poop(Arraystack s)
    {
        for (int i =s.size(); i >0 ; i--) {
            s.pop();
        }
    }

    public static void main(String[] args) {
        Arraystack<Integer>s1=new Arraystack<>(4);
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
           s1.push(in.nextInt());
        }
        System.out.println(s1.size());
        poop(s1);
        System.out.println(s1.size());
    }
}
