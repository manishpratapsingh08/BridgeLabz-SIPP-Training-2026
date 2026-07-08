import java.io.*;
import java.util.*;

public class EmailDomainCounter {

    public static void main(String[] args) {

        ArrayList<String> domains = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                int index = email.indexOf("@");

                String domain = email.substring(index + 1);

                domains.add(domain);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Domains:");

        for (String d : domains)
            System.out.println(d);

        HashMap<String, Integer> count = new HashMap<>();

        for (String d : domains) {

            if (count.containsKey(d))
                count.put(d, count.get(d) + 1);
            else
                count.put(d, 1);
        }

        System.out.println("\nDomain Count");

        for (String key : count.keySet()) {
            System.out.println(key + " : " + count.get(key));
        }
    }
}