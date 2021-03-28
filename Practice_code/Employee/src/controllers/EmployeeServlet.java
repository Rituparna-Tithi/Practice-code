package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;



import daos.EmployeeDao;
import models.Employee;


@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	
	 public void init() {
		employeeDao= new EmployeeDao();
		
	}
	
	
	//private EmployeeDao employeedao= new EmployeeDao();
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doGet(request, response);
	 }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertEmployee(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateUser(request, response);
				break;
			default:
				listEmployee(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void listEmployee(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException, ClassNotFoundException {
		List<Employee> listEmployee= employeeDao.selectAllUsers();
		System.out.println(listEmployee);
		request.setAttribute("listEmployee", listEmployee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("default.jsp");
		dispatcher.forward(request, response);
		
	}
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ClassNotFoundException {
		int Id = Integer.parseInt(request.getParameter("id"));
		String firstName= request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String emailAddress= request.getParameter("emailAddress");
		String company= request.getParameter("company");
		String physicalAddress=request.getParameter("physicalAddress");
		String dateOfBirth= request.getParameter("dateOfBirth");
		Employee employee= new Employee (Id,firstName,lastName,emailAddress,company,physicalAddress,dateOfBirth);
		employeeDao.updateUser(employee);

		response.sendRedirect("list");
		
	}
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		RequestDispatcher dispatcher= request.getRequestDispatcher("employee.jsp");
		dispatcher.forward(request,response);
		
} 
	private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException, ClassNotFoundException, SQLException{
		
		String firstName= request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String emailAddress= request.getParameter("emailAddress");
		String company= request.getParameter("company");
		String physicalAddress=request.getParameter("physicalAddress");
		String dateOfBirth= request.getParameter("dateOfBirth");
		Employee newEmployee= new Employee (firstName,lastName,emailAddress,company,physicalAddress,dateOfBirth);
		EmployeeDao.insertEmployee(newEmployee);
		response.sendRedirect("list");
		}
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ClassNotFoundException {
		int Id = Integer.parseInt(request.getParameter("id"));
		EmployeeDao.deleteUser(Id);
		response.sendRedirect("list");
	}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {
		//System.out.println(request.getParameter("id"));
		int Id = Integer.parseInt(request.getParameter("id"));
		Employee existingEmployee =  (Employee) EmployeeDao.selectUser(Id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee.jsp");
		request.setAttribute("employee", existingEmployee);
		dispatcher.forward(request, response);
		//System.out.println(id);
		
	}
}
	
     
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 			String firstName= request.getParameter("firstName");
		 			String lastName= request.getParameter("lastName");
		 			String emailAddress= request.getParameter("emailAddress");
		 			String company= request.getParameter("company");
		 			String physicalAddress= request.getParameter("physicalAddress");
		 			String dateOfBirth= request.getParameter("dateOfBirth");
		 			
		 			Employee employee = new Employee();
		 			employee.setFirstName(firstName);
		 			employee.setLastName(lastName);
		 			employee.setEmailAddress(emailAddress);
		 			employee.setCompany(company);
		 			employee.setPhysicalAddress(physicalAddress);
		 			employee.setDateOfBirth(dateOfBirth);
		 			
		 			try {
						employeedao.registerEmployee(employee);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 			response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/"));
		 			
	}*/


