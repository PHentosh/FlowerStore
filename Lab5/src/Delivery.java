public class Delivery {

    protected String end_addres;
    protected String post_office;
    protected FlowerBucket pacage;

    Delivery(String post_offise, String to, FlowerBucket pakage){
        post_office = post_offise;
        end_addres = to;
        pacage = pakage;
    }
}
