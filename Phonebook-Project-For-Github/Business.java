package phonebookproject;

public class Business extends Contact {

private int zip;
    
    public Business(String name, long phone, int zip){
        super(name, phone);
        this.zip=zip;
    }
    
     public String getInfo (){
         return String.format(super.getInfo()+"%-25d%n", zip);
    }
}
