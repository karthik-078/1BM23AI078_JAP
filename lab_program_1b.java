public class lab_program_1b {
    public static void main(String args[]) {
        int i, j;
        System.out.println("Chess Board");
        for (i = 1; i <= 8; i++) {
            for (j = i; j <= (8 + (i - 1)); j++) {
                if (j % 2 == 0) {
                    System.out.print("White ");
                } else {
                    System.out.print("Black ");
                }

            }
            System.out.println();
        }
    }

}