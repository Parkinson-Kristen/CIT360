/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafamilycalendar;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;   

/**
 *
 * @author kjpar
 */
public class CalendarServlet {

    private static class ServletException extends Exception {

        public ServletException() {
        }
    }

    private static class HttpServletResponse {

        public HttpServletResponse() {
        }

        private void setContentType(String texthtml) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private PrintWriter getWriter() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
     public class DemoServlet extends HttpServlet{  
    public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException    
    {  
    res.setContentType("text/html");//setting the content type  
    PrintWriter pw=res.getWriter();//get the stream to write the data  
      
    //writing html in the stream  
    pw.println("<html><body>");  
    pw.println("Welcome to servlet");  
    pw.println("</body></html>");  
      
    pw.close();//closing the stream  
    }}  
    
}
