package wednesdayRecap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Agent {
    public static void main(String[] args) {
        Map<String, String> info = new HashMap();
        info.put("name", "Cholpon");
        info.put("phone", "3125369032");
        info.put("name", "Albina");

        System.out.println(info);
        System.out.println(info.get("name"));
        Set<String> myKeys = info.keySet();
        System.out.println(myKeys);

        for(String key: myKeys){
            System.out.println(info.get(key));
        }

    }
}
