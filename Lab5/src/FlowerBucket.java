public class FlowerBucket {
    protected FlowerPack[] flowerPacks;

    FlowerBucket(FlowerPack[] fps){
        this.flowerPacks = fps.clone();
    }

    public double price(){
        double pr = 0;
        for (FlowerPack flowerPack : this.flowerPacks) {
            pr += flowerPack.price();
        }
        return pr;
    }
}
