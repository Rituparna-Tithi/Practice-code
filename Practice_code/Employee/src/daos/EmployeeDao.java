package daos;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Employee;

public class EmployeeDao {
	
	private static final String INSERT_USERS_SQL= "INSERT INTO information" + " (First_Name,Last_Name,Email_Address,Company,Physical_Address,Date_Of_Birth) values"
			+ "(?,?,?,?,?,?);";
	
	
	private static final String SELECT_USERS_BY_ID= "select Id, First_Name,Last_Name,Email_Address,Company,Physical_Address,Date_Of_Birth from information where Id=?";
	private static final String SELECT_ALL_USERS= "select * from information";
	private static final String DELETE_USERS_SQL= "delete from information where Id =?;";
	private static final String UPDATE_USERS_SQL= "update information set First_Name=?,Last_Name=?,Email_Address=?,Company=?,Physical_Address=?, Date_Of_Birth=? where Id=?";
	
	
	
/*
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();

		String query = "SELECT * FROM information";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_form", "root", "");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setFirstName(rs.getString("First_Name"));
				emp.setLastName(rs.getString("Last_Name"));
				emp.setEmailAddress(rs.getString("Email_Address"));
				emp.setCompany(rs.getString("Company"));
				emp.setPhysicalAddress(rs.getString("Physical_Address"));
				emp.setDateOfBirth(rs.getString("Date_of_Birth"));
				
				
				employees.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employees;
	}*/
	
	//create or insert user

	public static void insertEmployee(Employee employee) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_form", "root", "");

				PreparedStatement ps = con.prepareStatement(INSERT_USERS_SQL)) {
			//System.out.println("hello");
			//System.out.println(employee);

			//ps.setInt(1,1);
			ps.setString(1, employee.getFirstName());
			//ps.setString(1,"hi");
			
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getEmailAddress());
			ps.setString(4, employee.getCompany());
			ps.setString(5, employee.getPhysicalAddress());
			ps.setString(6, employee.getDateOfBirth());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}
       //update users
	public  boolean updateUser(Employee employee) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 boolean rowupdated;
		 
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_form", "root", "");
			PreparedStatement ps = con.prepareStatement(UPDATE_USERS_SQL);){
				//ps.setInt( 1,employee.getId());
			
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getEmailAddress());
			ps.setString(4, employee.getCompany());
			ps.setString(5, employee.getPhysicalAddress());
			ps.setString(6, employee.getDateOfBirth());
			ps.setInt( 7,employee.getId());
			

			rowupdated = ps.executeUpdate() >0;
	
		}

		return rowupdated;
		}


// select user by Id

public static Employee selectUser(int Id) throws ClassNotFoundException{
	Employee employee= null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_form", "root", "");
			PreparedStatement ps = con.prepareStatement(SELECT_USERS_BY_ID);){
		
			ps.setInt(1,Id);
			System.out.println(ps);
			ResultSet rs= ps.executeQuery();
			while(rs.next()){
			String firstName= rs.getString("First_Name");
			String lastName=rs.getString("last_Name");
			String emailAddress= rs.getString("Email_Address");
			String company= rs.getString("Company");
			String physicalAddress= rs.getString("Physical_Address");
			String dateOfBirth= rs.getString("Date_Of_Birth");
			
			employee= new Employee(Id,firstName,lastName,emailAddress,company,physicalAddress,dateOfBirth);


			
			
}
	
	}	catch (SQLException  e) {
		e.printStackTrace();
	}
	return employee;
}
//select users

public static  List<Employee> selectAllUsers() throws ClassNotFoundException{
	List<Employee> employee = new ArrayList<>();
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_form", "root", "");
			PreparedStatement ps = con.prepareStatement(SELECT_ALL_USERS);){
		
			
			ResultSet rs= ps.executeQuery();
			while(rs.next()){
				int Id= rs.getInt("Id");
				
				
				String firstName= rs.getString("First_Name");
				String lastName=rs.getString("Last_Name");
				String emailAddress= rs.getString("Email_Address");
				String company= rs.getString("Company");
				String physicalAddress= rs.getString("Physical_Address");
				String dateOfBirth= rs.getString("Date_Of_Birth");
				Employee emp=new Employee();
				emp.setId(Id);
				emp.setFirstName(firstName);
				emp.setLastName(lastName);
				emp.setEmailAddress(emailAddress);
				emp.setCompany(company);
				emp.setPhysicalAddress(physicalAddress);
				emp.setDateOfBirth(dateOfBirth);
				employee.add(emp);
				
				//ps.executeQuery();

}
	
	}	catch (SQLException  e) {
		e.printStackTrace();
	}
	return employee;

}

//delete user

public static  boolean deleteUser(int Id) throws SQLException, ClassNotFoundException{
	boolean rowdeleted;
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_form", "root", "");
			PreparedStatement ps = con.prepareStatement(DELETE_USERS_SQL);){
		ps.setInt(1,Id);
		rowdeleted= ps.executeUpdate()>0;
		
		
	}
	return rowdeleted;
	
}


}
	

	






















