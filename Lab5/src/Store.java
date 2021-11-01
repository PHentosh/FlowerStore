import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public ArrayList<FlowerPack> setOfFlowerpacks = new ArrayList<>();
    public ArrayList<FlowerPack> myPack = new ArrayList<>();
    Scanner cs = new Scanner(System.in);
    String addres = "Addres";

    public void addItem(FlowerPack fp){
        setOfFlowerpacks.add(fp);
    }

    public ArrayList<FlowerPack> search(int[] am, Object fl, int[] pr){
        ArrayList<FlowerPack> paramSet = new ArrayList<>();
        for (FlowerPack item : setOfFlowerpacks) {
            boolean t1 = pr[1] <= item.price();
            boolean t2 = item.price() >= pr[0];
            boolean t3 = am[0] < item.getAmount();
            boolean t4 = am[1] > item.getAmount();
            boolean t5 = fl == item.getFlower().getClass();
            if (t1 && t2 && t3 && t4 && t5) {
                paramSet.add(item);
            }
        }
        return paramSet;
    }

    protected double price(){
        double pr = 0;
        for (FlowerPack n : myPack) {
            pr += n.price();
        }
        return pr;
    }

    public void pay(){
//        System.out.print("Please input card number: ");
//        String sr = cs.next();
        String sr = "CreditCard";
        if (sr.equals("CreditCard")) {
            CreditCard pay = new CreditCard(price());
            pay.pay();
        } else if (sr.equals("PayPal")) {
            PayPal pay = new PayPal(price());
            pay.pay();
        }
    }

    public void send(){
//        System.out.print("Please input delivery addres: ");
//        String sr = cs.next();
//        System.out.print("Please input type of delivery: ");
//        String ty = cs.next();
        String ty = "DHL";
        String sr = "UCU";
        if (ty.equals("DHL")){
            DHLDelivery dh = new DHLDelivery(addres, sr, new FlowerBucket(setOfFlowerpacks));
            dh.send();
        } else{
            PostDelivery dh = new PostDelivery(addres, sr, new FlowerBucket(setOfFlowerpacks));
            dh.send();
        }
    }

}
