public class prime_number {
    public static void main(String[] args) {
        System.out.println(" table of   ****" +
                "       prime numbers : ");
        int number = 2;
        int count = 0;


        while (count < 50) {
            boolean numberisPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    numberisPrime = false;
                    break;
                }
            }
            if (numberisPrime) {
                count++;
                System.out.print(number + "\t");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }



            number++;
        }
    }
}
