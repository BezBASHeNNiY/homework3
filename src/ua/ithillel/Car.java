package ua.ithillel;

public class Car {

    private void startElectricity () {
        System.out.println("startElectricity");
    };
    private void startFuel () {
        System.out.println("startFuel");
    };
    private void startCommand () {
        System.out.println("startCommand");
    };

    public void start() {
        startFuel();
        startElectricity();
        startCommand();
    };
}
