package learninging0910.learner;

public class enumLearn {
    public static void main(String[] args) {

        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        for (int e = 1; e < 10; e++) {
                            if (a*b*c+d*e==a*b+c*d*e && a!=b&&b!=c&&c!=d&&d!=e&&a!=c&&a!=d&&a!=e&&b!=d&&b!=e&&c!=e){
                                System.out.println("---------");
                                System.out.println(a+""+b+c+d+e);
                            }
                        }

                    }

                }

            }

        }
    }
}
