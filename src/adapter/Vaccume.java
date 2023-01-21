package adapter;

public class Vaccume implements Elect_220v {
    @Override
    public void connect() {
        System.out.println("청소기 220V ON");
    }
}
