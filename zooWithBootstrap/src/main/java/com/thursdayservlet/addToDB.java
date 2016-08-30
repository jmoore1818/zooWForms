package com.thursdayservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.byethursday.Animal;
import com.byethursday.DAO;

/**
 * Servlet implementation class atToDB
 */
@WebServlet("/atToDB")
public class addToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Animal addTodb = new Animal();
		
		addTodb.setanimalSpecies(request.getParameter("animalSpecies"));
		addTodb.setAnimalHabitat(request.getParameter("animalHabitat"));
		addTodb.setAnimalDiet(request.getParameter("animalDiet"));
		addTodb.setAnimalActivity(request.getParameter("animalActivity"));
		
		DAO.writeToDatabase(addTodb);
		
	}

}
