import java.util.Scanner;

public class PayPal extends Payment{

    PayPal(double prise){
        super(prise);
        //Scanner cs = new Scanner(System.in);
        System.out.print("Please input your PayPal account info: ");
//        String ac = cs.next();
        String ac = "Account info";
        account = ac;
    }

    public void pay() {
        System.out.println("Pay");
    }
}
