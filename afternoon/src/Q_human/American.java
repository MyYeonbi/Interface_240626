package Q_human;

public class American implements Human {
    public void speak(){
        System.out.println("hello");
    }
    public void eat(){
        System.out.println("American eat hamburger");
    }
    public void hello(){
        System.out.println("hello It is currently the year" + CURRENT_YEAR);
    }
}
