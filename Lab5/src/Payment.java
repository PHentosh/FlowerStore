import java.util.Scanner;

public class Payment {

    protected double price;
    protected String account;
    protected String number;
    protected String name;
    protected String surname;
    protected String date;

    Payment(double prise){
        price = prise;
        //Scanner cs = new Scanner(System.in);
        System.out.print("Please input card number: ");
       // String number = cs.next();
        String number = "number";
        System.out.print("Please input your name: ");
       // String name = cs.next();
        String name = "nam";
        System.out.print("Please input your surname: ");
        //String surname = cs.next();
        String surname = "surname";
        System.out.print("Please input your card expire date: ");
        //String date = cs.next();
        String date = "date";
    }

}
