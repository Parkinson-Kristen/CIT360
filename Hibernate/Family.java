/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjpar
 */
class Family {

    Family(String fname, String mname, int SurName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getMiddleName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSurName(int SurName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public class FamilyId {
   private int id;
   private String firstName; 
   private String middleName;   
   private int SurName;  

   public FamilyId() {}
   public FamilyId(String fname, String mname, int SurName) {
      this.firstName = fname;
      this.middleName = mname;
      this.SurName = SurName;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   
   public String getMiddleName() {
      return middleName;
   }
   
   public int getSurName() {
      return SurName;
   }
   
   public void setSurName( int SurName ) {
      this.SurName = SurName;
   }
    }
    
}
