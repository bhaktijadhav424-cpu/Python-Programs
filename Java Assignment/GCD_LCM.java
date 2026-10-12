import java.util.Scanner;
public  class GCD_LCM {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
           return  a;
    }
        static int lcm(int a, int b) {
            return (a / gcd(a, b)) * b;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" First number: ");
        int num1 = sc.nextInt();
        System.out.println(" Second number: ");
        int num2 = sc.nextInt();
        if (num1 <= 0 || num2 <= 0)
        {
            System.out.println("Invalid input.Enter positive numbers. ");
        } else {
            System.out.println("GCD:" + gcd(num1, num2));
            System.out.println("LCM:" + lcm(num1, num2)); 

        }
        sc.close();
    }
}

//Output=
//First Number: 84
//Second Number: 120
//GCD: 12
//LCM: 840
