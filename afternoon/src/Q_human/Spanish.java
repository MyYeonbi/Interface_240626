package Q_human;

public class Spanish implements Human {
    public void speak() {
        System.out.println("Hola");
    }

    public void eat() {
        System.out.println("El español come paella");
    }

    public void hello() {
        System.out.println("Hola. Actualmente es el año " + CURRENT_YEAR);
    }
}
