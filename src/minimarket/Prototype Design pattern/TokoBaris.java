package minimarket;
 
import java.util.HashMap;
import java.util.Map;
 
public class TokoBaris {
 
    private static Map<String, Baris> barisMap = new HashMap<String, Baris>(); 
     
    static {
        barisMap.put("Makanan", new BarisMakanan());
        barisMap.put("Minuman", new BarisMinuman());
    }
     
    public static Baris getBaris(String barisName){
         
        return (Baris) barisMap.get(barisName).clone();
    }
}
