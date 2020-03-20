public class soNguyenToNhoHon100 {
    public static void main(String[] args) {
        int i, j;
        for (i = 2; i < 100; i++) {
            boolean check = true;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(i);
            }
        }

    }
}
