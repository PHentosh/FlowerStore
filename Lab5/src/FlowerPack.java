public class FlowerPack {
    protected Flower flower;
    protected int amount;

    FlowerPack(int am, Flower fl){
        this.amount = am;
        this.flower = fl;
    }

    public double price(){
        return this.flower.getPrice() * this.amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getAmount() {
        return amount;
    }
}
