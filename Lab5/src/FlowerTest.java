import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class FlowerTest {

    @Test
    public void initializingtest(){
        int[] col = new int[]{0, 0, 0};
        Rose r = new Rose(col, 37, 35);
        assertEquals(r.getPrice(), 35.0, 0.1);
        assertEquals(r.getColor()[0], col[0]);
        assertEquals(r.getColor()[1], col[1]);
        assertEquals(r.getColor()[2], col[2]);
        col = new int[]{225, 225, 225};
        assertNotEquals(r.getColor()[0], col[0]);
        assertNotEquals(r.getColor()[1], col[1]);
        assertNotEquals(r.getColor()[2], col[2]);
        assertEquals(r.getSepalLength(), 37.0, 0.1);
    }

    @Test
    public void packTest(){
        FlowerPack fl = new FlowerPack(10, new Rose(new int[]{0, 0, 0}, 20.0, 30.5));
        assertEquals(fl.price(), 305.0, 0.1);
        assertEquals(fl.getFlower(), new Rose(new int[]{0, 0, 0}, 20.0, 30.5));
        assertEquals(fl.getAmount(), 10);
    }

    FlowerPack fl1 = new FlowerPack(10, new Rose(new int[]{0, 0, 0}, 20.0, 30.5));
    FlowerPack fl2 = new FlowerPack(15, new Chamomile(new int[]{37, 77, 44}, 5.0, 37.4));
    FlowerPack fl3 = new FlowerPack(17, new Tulip(new int[]{52, 11, 145}, 15.0, 50.0));
    @Test
    public void bucketTest(){
        ArrayList<FlowerPack> fl = new ArrayList<FlowerPack>();
        fl.add(fl1);
        fl.add(fl2);
        fl.add(fl3);
        FlowerBucket fb = new FlowerBucket(fl);
        assertEquals(fb.price(), 1716.0, 0.1);
    }

    @Test
    public void storetest(){
        Store st = new Store();
        st.addItem(fl1);
        st.addItem(fl2);
        st.addItem(fl3);
        ArrayList<FlowerPack> fps =  st.search(new int[]{5, 15}, Rose.class, new int[]{30, 35});
        ArrayList<FlowerPack> test = new ArrayList<FlowerPack>();
        test.add(fl1);
        assertEquals(fps, test);

    }

    @Test
    public void decoratorTest(){
        FlowerPackChamomile fch = new FlowerPackChamomile();
        FlowerPackRoses fro = new FlowerPackRoses();
        FlowerPackTulips ftu = new FlowerPackTulips();
        assertEquals(fch.getFlower(), new Chamomile(new int[]{150, 150, 150}, 30.0, 35.0));
        assertEquals(fch.getAmount(), 5);
        assertEquals(fch.price(), 175.0, 0.001);

        assertEquals(fro.getFlower(), new Rose(new int[]{75, 75, 75}, 15.5, 30.0));
        assertEquals(fro.getAmount(), 21);
        assertEquals(fro.price(), 630.0, 0.001);

        assertEquals(ftu.getFlower(), new Tulip(new int[]{45, 45, 45}, 20.0, 25.0));
        assertEquals(ftu.getAmount(), 7);
        assertEquals(ftu.price(), 175.0, 0.001);
    }

    @Test
    public void delivereytet(){
        Store st = new Store();
        st.addItem(fl1);
        st.addItem(fl2);
        st.addItem(fl3);
        st.send();
    }

    @Test
    public void paytest(){
        Store st = new Store();
//        st.addItem(fl1);
//        st.addItem(fl2);
//        st.addItem(fl3);
        st.pay();
    }

}
