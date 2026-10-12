import java.util.Scanner;
public class Armstrong_no{
static int countDigits(int n) {
    int count = 0;
    while (n > 0) {
        count++;
        n = n / 10;
    }
    return count;
}
static int power(int base, int exp) {
    int result = 1;
    for (int i = 1; i <= exp; i++) {
        result = result * base;
    }
    return result;
}
static boolean isArmstrong(int n) {
    int original = n;
    int digits = countDigits(n);
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum = sum + power(digit, digits);
        n = n / 10;     
    }
    return  sum == original && digits > 1 || original == 1;
}
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Start: ");
    int Start = sc.nextInt();
    System.out.println("End: ");
    int End = sc.nextInt();
    System.out.println("Armostrong numbers: ");
    for (int i = Start; i <= End; i++) {
        if (isArmstrong(i)) {
            System.out.println(i + " ");
        }
    }
    sc.close();

}
}

// Output=
//Armostrong number=1 153 370 371 407s