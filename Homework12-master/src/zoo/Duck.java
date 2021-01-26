package zoo;

public class Duck implements Run, Fly  {

    @Override
    public void run() {
        System.out.println("Duck runs");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }


}
