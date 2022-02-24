package hello;


import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------app start----------");
        List<String> upcListInput = new ArrayList<>();
        upcListInput.add("1234");
        String upcStrInput = "1234";

        Map<String, Object> upcMap = new HashMap<>();
        upcMap.put("key", upcStrInput);

        String name = upcMap.get("key").getClass().getName();
        if( name.equals("java.lang.String")){
            System.out.println( name );
            String upcStr= (String)upcMap.get("key");
            System.out.println(upcStr );

        }

        if( name.equals("java.util.ArrayList")){
            System.out.println( name );
            List<String> upcList = (List<String>)upcMap.get("key");
            String upc = upcList.stream().findFirst().orElse("");
            System.out.println(upc );
        }

        System.out.println("----------app end----------");
    }
}
