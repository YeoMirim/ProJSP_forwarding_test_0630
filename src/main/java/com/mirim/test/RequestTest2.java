package com.mirim.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest2
 */
@WebServlet("/RequestTest2")
public class RequestTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTest2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		String id = (String) request.getAttribute("id");	// 가져온 값(객체)을 빼내서 저장함(형변환 필요)
		String pw = (String) request.getAttribute("pw"); 
		
		request.setAttribute("id", "tiger");	
		request.setAttribute("pw", "12345");
		
		String sid = (String) request.getAttribute("id");	// 가져온 값(객체)을 빼내서 저장함(형변환 필요)
		String spw = (String) request.getAttribute("pw");
		
		System.out.println(id);	// sendRedirect로 보낸것이기 때문에 null값이 출력됨
		System.out.println(pw);
		System.out.println("===========================");
		System.out.println(sid);
		System.out.println(spw);
	}

}
