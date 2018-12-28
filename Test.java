import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

public class Test {
    public static void main(String[] args) {

        Map<String,Integer> s=new ConcurrentSkipListMap<>();
        s.put("Name",1);
        s.put("N",78);
        s.put("Na",45);
        s.put("Nam",12);

        System.out.println(s.hashCode());
//        s.remove("N");
        System.out.println(s.remove("N"));
        System.out.println(((ConcurrentSkipListMap<String, Integer>) s).ceilingKey("Nam"));
        for (Map.Entry<String,Integer> sa : s.entrySet()) {
            System.out.println(sa);
        }




//        Main main = new Main();
//        main.addData(12);
//        main.addData(13);
//        main.addData(14);
//        main.addData(15);
//        main.addData(17);
//        main.addData(16);
//
//        main.display();
    }
}
