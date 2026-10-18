class Student {
    static int add(int a, int b) {
        return a + b;
    }
}
public class Static_method {
    public static void main(String[] args) {
        int result = Student.add(10,20);
        System.out.println(result);
    }

    
}
