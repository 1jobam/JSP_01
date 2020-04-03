package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션 - 선언자
//@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/loginForm.jsp").forward(request, response);;
		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
		
		
		//out.println("doGet() excute!!");
		
		/*out.println("<DOCTYPE!>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("로그인 페이지");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"login.do\" method=\"post\" >");
		out.println("아이디 : <input type=\"text\" name=\"id\" /><br/>");
		out.println("패스워드 : <input type=\"password\" name=\"pwd\" /><br/>");
		out.println("<input type=\"submit\" value=\"로그인\" />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");*/
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//MemberVO member = memberService.getMember(id); 이것과 같음
		System.out.println("doPost() excute!!");

		request.getRequestDispatcher("login_success.jsp").forward(request, response);
		
		/*response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('로그인 성공입니다.');");
		out.println("location.href='https://www.naver.com';");
		out.println("</script>");*/
		
	}

}
