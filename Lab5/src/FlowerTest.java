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
        FlowerPack[] fl = new FlowerPack[]{fl1, fl2, fl3};
        FlowerBucket fb = new FlowerBucket(new FlowerPack[]{fl1, fl2, fl3});
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


}
