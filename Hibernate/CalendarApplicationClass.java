/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
import javafamilycalendar.Family;
import static javax.swing.text.StyleConstants.Family;
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author kjpar
 */
public class CalendarApplicationClass {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageFamily ME = new ManageFamily();

      /* Add few employee records in database */
      Integer empID1 = ME.addFamily("Kyle", "Marie", Webb);
      Integer empID2 = ME.addFamily("Daisy", "Das", Webb);
      Integer empID3 = ME.addFamily("John", "Paul", Webb);

      /* List down all the employees */
      ME.listFamily();

      /* Update employee's records */
      ME.updateFamily(empID1, Webb);

      /* Delete an employee from the database */
      ME.deleteFamily(empID2);

      /* List down new list of the employees */
      ME.listFamily();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addFamily(String fname, String mname, int SurName){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer faimilyID = null;
      
      try {
         tx = session.beginTransaction();
         Family family = new Family(fname, mname, SurName);
          Integer familyID = (Integer) session.save(family); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       Integer familyID = null;
      return familyID;
   }
   
   /* Method to  READ all the employees */
   public void listFamily( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Family").list(); 
         for (Iterator iterator = family.iterator(); iterator.hasNext();){
            Family family = (Family) iterator.next(); 
            System.out.print("First Name: " + family.getFirstName()); 
            System.out.print("  Middle Name: " + family.getMiddleName()); 
            System.out.println("  SurName: " + family.getSurName()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE salary for an employee */
   public void updateFamily(Integer FamilyID, int SurName ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Family family = (Family)session.get(Family.class, FamilyID); 
         family.setSurName( SurName );
		 session.update(Family); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an employee from the records */
   public void deleteFamily(Integer FamilyID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Family family = (Family)session.get(Family.class, FamilyID); 
         session.delete(family); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}

Compilation and Execution

Here are the steps to compile and run the above mentioned application. Make sure, you have set PATH and CLASSPATH appropriately before proceeding for the compilation and execution.

    Create hibernate.cfg.xml configuration file as explained in configuration chapter.

    Create Employee.hbm.xml mapping file as shown above.

    Create Employee.java source file as shown above and compile it.

    Create ManageEmployee.java source file as shown above and compile it.

    Execute ManageEmployee binary to run the program.

You would get the following result, and records would be created in the EMPLOYEE table.

$java ManageFamily
.......VARIOUS LOG MESSAGES WILL DISPLAY HERE........

First Name: Zara  Middle Name: Ali  Surname: Webb
First Name: Daisy  Middle Name: Das  Surname: Webb
First Name: John  Middle Name: Paul  Surname: Webb
First Name: Zara  Middle Name: Ali  Surname: Webb
First Name: John  Middle Name: Paul  Surname: Webb

If you check your FAMILY table, it should have the following records −

mysql> select * from FAMILY;
+----+------------+-----------+--------+
| id | first_name | middle_name | SurName |
+----+------------+-----------+--------+
| 29 | Zara       | Ali       |   Webb |
| 31 | John       | Paul      |  Webb |
+----+------------+-----------+--------+
2 rows in set (0.00 sec

mysql>

Previous Page Print Page
Next Page  
Advertisements

    
}
