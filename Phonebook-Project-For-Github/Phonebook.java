package phonebookproject;

import java.util.ArrayList;

public class Phonebook {
    
     private ArrayList<Business> business = new ArrayList<>();
     private ArrayList<Person> person = new ArrayList<>();

       public void addBusiness(String name, long phone, int zip) {
        business.add(new Business(name, phone, zip));
    }
   
    public void addPerson(String name, long phone, String relationship) {
      person.add(new Person(name, phone, relationship));
    }
    
      public void printContacts() {
          
        System.out.printf("%-25s%-25s%-25s%n", "Person name", "Phone", "Relationship");
        System.out.printf("---------------------------------------------------------------------------%n");
        for (Person person : person) {
           System.out.printf(person.getInfo());
        }
        System.out.printf("---------------------------------------------------------------------------%n");
        System.out.printf("%-25s%-25s%-25s%n", "Business name", "Phone", "Zip");
        System.out.printf("---------------------------------------------------------------------------%n");
        
        for (Business business : business) {
            System.out.printf(business.getInfo());
         }
    }
   
    
     
}
