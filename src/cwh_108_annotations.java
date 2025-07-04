@FunctionalInterface
interface myFunctionInterface {
    void thismethod();
    //void thatMethod();
}

class Phone{
    public void showTime(){
        System.out.println("Time is 7:00 AM");
    }
    public void on(){
        System.out.println("My name is Java");
    }
}
class NewPhone extends Phone{
    @Override
    public void showTime() {
        System.out.println("Time is 8:00 AM");
    }
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}
public class cwh_108_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5,6);
    }
}
