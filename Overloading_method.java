class calculate {
    int add (int a, int b) {
return a + b;
    }
int add (int a, int b, int c) {
    return a + b +c;
}
}
public class Overloading_method {
public static void main(String[] args) {
    calculate c1 = new calculate();

    System.out.print( c1.add(10,20));
System.out.print(c1.add(10,20,30));
}
    
}

// 30
//60
