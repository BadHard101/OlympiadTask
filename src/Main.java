public class Main {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        for (int a = -75; a < 76; a++) {
            for (int b = -75; b < 76; b++) {
                for (int c = -75; c < 76; c++) {
                    for (int d = -75; d < 76; d++) {
                        if (((a*b*c == 37) || (a*c*d == 37) || (a*b*d == 37) || (b*c*d == 37)) &&
                                ((a*b*c == 74) || (a*c*d == 74) || (a*b*d == 74) || (b*c*d == 74))) {
                            int sum = a+b+c+d;
                            if (min > sum) min = sum;
                            System.out.println(a + " " + b + " " + c + " " + d + "=" + sum);
                        }
                    }
                }
            }
        }
        System.out.println("MIN: " + min);
    }
}