import java.util.ArrayList;

public class FlowerBucket {
    protected ArrayList<FlowerPack> flowerPacks;

    FlowerBucket(ArrayList<FlowerPack> fps){
        flowerPacks = (ArrayList<FlowerPack>) fps.clone();
    }

    public double price(){
        double pr = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            pr += flowerPack.price();
        }
        return pr;
    }
}
