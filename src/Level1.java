public class Level1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+491730000000", "Xiaomi", 168);
        Phone phone2 = new Phone("+10000001234", "Samsung");
        Phone phone3 = new Phone();
        phone3.number = "+480000012345";
        phone3.model = "iPhone";
        phone3.weight = 120;

        System.out.println("Number is " + phone1.number + ", Model is " + phone1.model + ", weight is " + phone1.weight);
        System.out.println("Number is " + phone2.number + ", Model is " + phone2.model + ", weight is " + phone2.weight);
        System.out.println("Number is " + phone3.number + ", Model is " + phone3.model + ", weight is " + phone3.weight);

        phone1.receiveCall("John");
        phone2.receiveCall("Arya");
        phone3.receiveCall("Sansa");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("John", phone1.number);
        phone2.receiveCall("Arya", phone2.getNumber());
        phone3.receiveCall("Sansa", phone3.number);


    }
}
