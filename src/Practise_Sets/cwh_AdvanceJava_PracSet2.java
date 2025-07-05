package Practise_Sets;

class MyDeprecatedClass {
    @Deprecated
    void meth1(){
        System.out.println("This is method 1");
    }
}
interface MyInt{
    void display();
}

public class cwh_AdvanceJava_PracSet2 {
    public static void main(String[] args) {
        // Question 2:
        @SuppressWarnings("deprecation")
        MyDeprecatedClass obj = new MyDeprecatedClass();
        obj.meth1();
        MyInt i =() -> System.out.println("I am display");

    }
}
