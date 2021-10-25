import java.util.ArrayList;

public class Store {
    public ArrayList<FlowerPack> setOfFlowerpacks = new ArrayList<>();

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
            if (t1 && t2 && t3 && t4) {
                paramSet.add(item);
            }
        }
        return paramSet;
    }

}
