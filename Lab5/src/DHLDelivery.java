public class DHLDelivery extends Delivery{

    DHLDelivery(String post_offise, String to, FlowerBucket pakage){
        super(post_offise, to, pakage);
    }
    public void send(){
        System.out.print("Send");
    }
}
