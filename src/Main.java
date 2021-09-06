import java.math.BigDecimal;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        HashT test = new HashT();
//        test.add("mbnjifg", "hgbfn45y678");
//        System.out.println(test.findAllByKey("mbnjifg"));

//        test.add("mbnjifg", "7h86yg90");

//        Model m = new Model("67t8gh8", "b fgjk");
//        Model m = new Model(22, "b fgjk");

//        System.out.println(m.getKey().hashCode());

        test.add("67t8gh8", "b fgjk");
        test.add(22, "nvuerhi");
        test.add(77L, 654321);
        test.add(BigDecimal.valueOf(564), "6grtsdy");

        System.out.println(test.showAll());
        System.out.println(test.findAllByKey(77L));
    }
}
