
 class Person {
  public static String firstName;
  public static String lastName;
  public static String email;
  
 public Person(String firstName,String lastName,String email)
 {
     Person.firstName = firstName;
     Person.lastName = lastName;
     Person.email = email;
     
    
 }
 


public static String getFirstName() {
	return firstName;
}

public static void setFirstName(String firstName) {
	Person.firstName = firstName;
}

public static String getLastName() {
	return lastName;
}

public static void setLastName(String lastName) {
	Person.lastName = lastName;
}

public static String getEmail() {
	return email;
}

public static void setEmail(String email) {
	Person.email = email;
}
public String toString()
{
	
    return ("firstName :" + firstName + "\n"
            + "lastName : " + lastName+ "\n" + "email : " + email);
}

}
 
 class Loan
 {
	 public static String dateTaken;
	 public static String dueDate;
	 
	public String getDateTaken() {
		return dateTaken;
	}
	public void setDateTaken(String dateTaken) {
		Loan.dateTaken = dateTaken;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		Loan.dueDate = dueDate;
	}
	 
	public Loan(String dateTaken,String dueDate)
	 {
	     Loan.dateTaken = dateTaken;
	     Loan.dueDate = dueDate;   
	     
	 }
	
@Override	public String toString()
	{
	    return ("dateTaken :" + dateTaken + "\n"
	            + "dueDate : " + dueDate);
	}
 }
 
 class Book{
	 public static String title;
	 public static String ISBN;
	 
	public static String getTitle() {
		return title;
	}
	public static void setTitle(String title) {
		Book.title = title;
	}
	public static String getISBN() {
		return ISBN;
	}
	public static void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	 
	public Book(String title,String ISBN) {
		Book.title=title;
		Book.ISBN=ISBN;
	}
	@Override	public String toString()
	{
	    return ("title :" + title + "\n"
	            + "ISBN : " + ISBN);
	}
 }
 
 
 

class Students  extends Person{
	
	 public int currentYear;
	 public int hasScholarship;
	 
	 
	 public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public int getHasScholarship() {
		return hasScholarship;
	}

	public void setHasScholarship(int hasScholarship) {
		this.hasScholarship = hasScholarship;
	}

	public Students(int year,int schoolarship) {
		 super(firstName,lastName,email);
		 currentYear=year;
		 hasScholarship=schoolarship;
		 
	 }
	 
	 @Override	 public String toString()
	 {
	     return ("firstName :" + firstName + "\n"
	             + "lastName : " + lastName+ "\n" + "email : " + email+ "\n" + "currentYear : " + currentYear+ "\n" + "hasScholarship : " + hasScholarship);
	 }
}

class Teacher  extends Person{
	 public int taxFileNumber;
	 public int qualifications;
	 
	 
	 public int getTaxFileNumber() {
		return taxFileNumber;
	}
	public void setTaxFileNumber(int taxFileNumber) {
		this.taxFileNumber = taxFileNumber;
	}
	public int getQualifications() {
		return qualifications;
	}
	public void setQualifications(int qualifications) {
		this.qualifications = qualifications;
	}
	public Teacher(int taxfile,int qualif) {
		 super(firstName,lastName,email);
		 taxFileNumber=taxfile;
		 qualifications=qualif;
	 }
	 @Override	 public String toString()
	 {
	     return ("firstName :" + firstName + "\n"
	             + "lastName : " + lastName+ "\n" + "email : " + email+ "\n" + "taxFileNumber : " + taxFileNumber+ "\n" + "qualifications : " + qualifications);
	 }
}



