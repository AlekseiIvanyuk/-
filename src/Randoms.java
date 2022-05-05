import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;
    // private List<Integer> list = new ArrayList<>();

    //
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    ArrayList<Integer> list = new ArrayList<>();


    public List<Integer> Randoms(int min, int max) {

        int diff = max - min;
        //Random random = new Random();
        int i = random.nextInt(diff + 1) + min;

        //  SecureRandom random = new SecureRandom();
//        List list = new ArrayList<>();
        //Random rand = new Random();
        //int randomNum = new SecureRandom().nextInt(max - min) + min;
        //int randomNum = min + rand.nextInt((max - min) + 1);
        //int randomNum=min+(int)(Math.random()*((max-min)+1));
        //list.add(randomNum);

        list.add(i);
//        list.add(max);
//        list.add(100);
        return list;
    }

    //Randoms randoms = new Randoms(90, 100);
    Randoms rand = new Randoms(min, max);

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            //int next = 0;

            @Override
            public boolean hasNext() {
                return true;
            }


            @Override
            public Integer next() {
                int next = 0;
                int result = list.get(next);
                // int result = list.get(max);
                //int result = list.get(100);
                next++;
                return result;

            }
        };
    }
}