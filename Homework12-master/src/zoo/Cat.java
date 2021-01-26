package zoo;

public class Cat implements Run, Climb{

    @Override
    public void run() {
        System.out.println("Cat runs");
    }

    @Override
    public void climb() {
        System.out.println("Cat climbs");
    }


}
