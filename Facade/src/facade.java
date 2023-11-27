public class facade {
    private final subsystem2 subsystem2;
    private final Subsystem1 subsystem1;

    public facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new subsystem2();
    }

    public void operate() {
        System.out.println("Facade is coordinating the sub system ");
        subsystem1.operation1();
        subsystem2.operation2();
    }


}
