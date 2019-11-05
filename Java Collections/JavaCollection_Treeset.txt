import java.util.*;
public class TreeSetDemo {

   public static void main(String args[]) {
      // Create a tree set
      TreeSet NewContact = new TreeSet();
     
      // Add elements to the tree set
      NewContact.add("firstName");
      NewContact.add("lastName");
      NewContact.add("birthday");
      NewContact.add("address");
      NewContact.add("phoneNumber");
      NewContact.add("relationship");
      System.out.println(NewContact);
   }
}