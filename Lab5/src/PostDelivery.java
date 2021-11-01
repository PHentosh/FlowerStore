public class PostDelivery extends Delivery{
    protected String end_addres;
    protected String post_office;

    PostDelivery(String post_offise, String to, FlowerBucket pakage){
        super(post_offise, to, pakage);
    }

    public void send(){
        System.out.print("Send");
    }
}
