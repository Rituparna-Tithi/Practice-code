package models;

public class Employee {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String emailAddress;
	protected String company;
	protected String physicalAddress;
	protected String dateOfBirth;
	
	public Employee(){
		
	}
	
	

	public Employee(String firstName, String lastName, String emailAddress, String company, String physicalAddress,
			String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.company = company;
		this.physicalAddress = physicalAddress;
		this.dateOfBirth = dateOfBirth;
	}

	public Employee(int id,String firstName, String lastName, String emailAddress, String company, String physicalAddress,
			String dateOfBirth) {
		super();
		this.id= id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.company = company;
		this.physicalAddress = physicalAddress;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
