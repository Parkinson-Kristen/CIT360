/*
 * caledar creation idea
 */
package javacollections;

/* Kristen Parkinson
 * Family Calendar for bday reminders
 * November 2019
 */
import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // ArrayList example
        List Jan02 = new ArrayList();
        Jan02.add("Jeremy (Barbara's)");
        Jan02.add("BreAnne (Brent's)");
        Jan02.add("Steven (Cerise's)");
        Jan02.add("Nathan & Cherie (16)");
        Jan02.add("Stephen (Deceased)");
        System.out.println("\n\nLists Example: \n");
        System.out.println("Events for January 2nd");
        
        Iterator caldate0102 = Jan02.iterator();
        while(caldate0102.hasNext()) {
        Object element = caldate0102.next();
        System.out.print(element + "\n");
        }
        
        System.out.print("\n");        
        
        // Set example
        System.out.println("Set Collections Example");
        int advance[] = {2,9,4,0,3,1,5};
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set.toString() + "\n");

        //  Map example
        System.out.println("HashMap Example");
        Map<String, String> ages = new HashMap<String,String>();
        ages.put("LueElla Webb", "1920-1976");
        ages.put("Reece Webb", "1916-1990");
        ages.put("Cherile Webb", "1932-2012");
        ages.put("Ilene Brimhall", "1920-1997");
        ages.put("Ted Brimhall", "191802003");
		
		Set< Map.entry<String,String> > st = ages.entrySet();
		for (Map.Entry<String,String> me:st{

        System.out.println("Grandparents are: \n");

        ages.forEach((g,y) -> System.out.println( g + " lived from " + y + "\n"));

        // Tree example
        System.out.println("TreeSet - Children of Chris and Joyce");
        TreeSet CJ6 = new TreeSet();
        CJ6.add("Barbara");
        CJ6.add("Kristen");
        CJ6.add("Kimberly");
        CJ6.add("Jared");
        CJ6.add("Chase");
        CJ6.add("Brindee");
        CJ6.add("Carissa");
        
        Iterator list = CJ6.iterator();
        while(list.hasNext()) {
        Object element = list.next();
        System.out.print(element + "\n");
        }

        // Queue example
        System.out.println("\nQueue Example. Grandkids by birth order.");
        Queue<String> grandchild = new LinkedList<>();

        grandchild.add("Brent");
        grandchild.add("Derrick");
        grandchild.add("Wendi");
        grandchild.add("Joel");
        grandchild.add("Nolan");

        grandchild.forEach(name -> {
           System.out.println(name);
        });

    }
}