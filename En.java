import java.util.*;


public class En {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double n = Math.ceil(r);
        int s = (int)n;

        double sum;
        double koushi;
        int answer = 0;
        if (r == 1) {
            answer = 1;
        }else{
            for (int i=0; i<s; i++) {
                koushi = Math.sqrt(r*r - i*i);
                sum = Math.ceil(koushi);
                answer += sum;
            }
        }
        System.out.println(answer*4);
    }
}
