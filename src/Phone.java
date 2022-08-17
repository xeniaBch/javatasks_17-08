public class Phone {
    static String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println(name + " calls");
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " calls from the number " + number);
    }
}
