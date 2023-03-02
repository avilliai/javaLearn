package learninging0910.learner;

import java.util.Arrays;

public class que2 {
    public static void main(String[] args) {
        for (int i = 0; i < 99; i++) {
            int i1=i*i*i;
            int sum=sum(i1);
            if (sum==i){
                System.out.println(i+"   "+i1);
            }
        }
    }

    private static int sum(int i1) {
        String s =String.valueOf(i1);
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum+=s.charAt(i)-'0';

        }
        return sum;
    }
}
