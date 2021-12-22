import Person;
public class Test {
    public static void main(String args[])
    {
    	Person.firstName="deniz";
    	Person.lastName="kara";
    	Person.email="karavedeniz@mail.com";
    	
        Students mb = new Students(3, 25);
        System.out.println(mb.toString());
        
        Person.firstName="kara";
    	Person.lastName="deniz";
    	Person.email="denizvekara@mail.com";
    	
    	new Loan("11/12/2021","12/12/2021");
    	
        Teacher tb = new Teacher(15, 30);
        System.out.println(tb.toString());
        
    }
}