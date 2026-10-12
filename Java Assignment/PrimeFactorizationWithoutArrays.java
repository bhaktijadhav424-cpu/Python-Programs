import java.util.Scanner;
public class PrimeFactorizationWithoutArrays {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Invalid input.Enter a number greater than 0.");
        }
        else if (num == 1) {
            System.out.println("1 has no prime factors.");
        }
        else {
            System.out.println("Prime factorization: ");
            int first = 1;
            for (int i = 2; i <= num;i++) {
                if (isPrime(i)) {
                    int count = 0;
                    while (num % i == 0) {
                        count++;
                        num = num / i;
                    }
                    if (count > 0) {
                        if (first == 0) {
                            System.out.println(" x ");
                        }
                        System.out.println(i + "^" + count);
                        first = 0;
                    }
                }
            }
        }
        sc.close();
    }
}

//Output: Enter a number: 360
//Prime factorization: 2^3 x 3^2 x 5^1