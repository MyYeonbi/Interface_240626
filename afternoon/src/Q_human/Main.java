package Q_human;

public class Main {
    public static void main(String[] args) {
        Human[]humans = { new Korean(), new American()};

                for (Human h : humans) {
                    humanCall(h);
                }


    }
}
