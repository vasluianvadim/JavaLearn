package JavaColections;

import java.util.HashMap;

public class HMap {
    public static void main(String[] args) {
        HashMap<String,String> echipaTara =new HashMap<String,String>();
        echipaTara.put("Barcelona","Spain");
        echipaTara.put("PSG","France");
        echipaTara.put("Real Madrid","Spain");
        echipaTara.put("Chelsea","England");
        echipaTara.remove("Chelsea");
//        System.out.println(echipaTara.get("Barcelona"));
//        System.out.println(echipaTara);
        for(String i : echipaTara.keySet()){
            System.out.println(i+ ": " + echipaTara.get(i));
        }
    }
}
