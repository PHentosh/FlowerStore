public class CreditCard extends Payment{


    CreditCard(double prise){
        super(prise);
    }

    public void pay() {
        System.out.println("Pay");
    }

}
