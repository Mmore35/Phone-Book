package phonebookproject;

public class Person extends Contact {
    
    private String relationship;
    
     public Person(String name, long phone, String relationship){
        super(name, phone);
        this.relationship=relationship;
    }
    
    public String getInfo (){
         return String.format(super.getInfo()+"%-25s%n", relationship);
    }
}
