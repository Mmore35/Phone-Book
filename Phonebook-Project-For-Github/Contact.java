package phonebookproject;

public class Contact implements Comparable<Contact> {
    
    private String name;
    private long phone;
   
    public Contact (String name, long phone){
        this.name=name;
        this.phone=phone;
    } 
   
    public String getInfo (){
         return String.format("%-25s%-25d", name, phone);
    }
    
    @Override
 public int compareTo(Contact Other) {

        return this.name.compareTo(Other.name);
        
    }//used to sort the names in the Phone book.
}
