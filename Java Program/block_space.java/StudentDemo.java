class Student {
    static String name = "XYZ";
    static void  show() {
        System.out.println(name);
    }
        static  void display (Student s) {
            System.out.println(s.name);
        }
    }
        public class StudentDemo {
            public static void main(String[] args) {
                Student s = new Student();
            Student.show();
            Student.display(s);
        }

        
            
        }
    
        //XYZ
        //XYZ
        

    

