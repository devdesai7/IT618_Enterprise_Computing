/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poll;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dev23
 */
@WebServlet(name = "PollServlet", urlPatterns = {"/PollServlet"})
public class PollServlet extends HttpServlet {
    // Vote.Candidate c = new Vote.Candidate();  

    Poll p = new Poll();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PollServlet</title>");
            out.println("</head>");
            out.println("<body>");

            String value = request.getParameter("p");
            //out.println(request.getParameter("p"));

            if (value.equals("AddCandidate")) {
                p.setCandidates(request.getParameter("student_Name"));
                //               out.println(p.getCandidates());
                out.println("<h1>CANDIDATE ADDED</h1>");
                out.println(request.getParameter("student_Name"));
                out.println("<br>");

                out.println("<a href='Menu.jsp'>Go Back</a>");

            } else if (value.equals("Vote")) {
                String Student_Name = request.getParameter("student_Name");
                int val = p.setCname(Student_Name);
                System.out.println(val);
                if (val == 0) {
                    p.setVote(request.getParameter("Candidate"));
                    out.println(Student_Name);
                    out.println(", your vote has been recorded successfully. ");
                } else {
                    out.println(request.getParameter("Candidate"));
                    out.println(", you have already voted! ");
                }
                out.println("<a href='Menu.jsp'>Go Back</a>");

            }
//            out.println("<h1>Servlet PollServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String value = request.getParameter("p");
            //out.println(request.getParameter("p"));
            if (value.equals("view")) {
                //  out.println(p.getCandidates().keySet().toArray()[0]);

                out.println("<form  action=\"PollServlet?p=Vote\" method=\"POST\">");
                out.println("STUDENT ID  : <input type = \"text\" name =\"student_Name\" >");
                out.println("<br>");

                for (int i = 0; i < p.c.getCandiateCount(); i++) {
                    out.println("<input type=\"radio\" name=\"Candidate\" value=" + p.getCandidates().keySet().toArray()[i] + " >" + p.getCandidates().keySet().toArray()[i]);
                    out.println("<br>");

                }
                out.println("<br>");

                out.println(" <input type = \"submit\" value=\"Submit Vote!\" >");

                out.println("</form>");

            } else if (value.equals("Report")) {
                out.println("<h1>VOTING REPORT</h1>");
                for (int i = 0; i < p.c.getCandiateCount(); i++) {
                    String name = (String) p.getCandidates().keySet().toArray()[i];
                    out.println(name);
                    int vote = p.c.getVoteCount(name);
                    out.print(" : " + vote);
                    out.println("<br>");
                    
                out.println("<a href='Menu.jsp'>Go Back</a>");

                }

            } else if (value.equals("Result")) {
                out.println("<h1>POLL RESULT</h1>");
                out.print("WINNER : " + p.getWinner().getKey());
                out.print("( " + p.getWinner().getValue() + ")");
                out.println("<br>");
                out.println("LOST : " + p.getWinner2().getKey());
                out.print("( " + p.getWinner2().getValue() + ")");
                out.println("<br>");
                
                out.println("<a href='Menu.jsp'>Go Back</a>");

                // out.println(p.getWinner().getKey() + " " + p.getWinner().getValue());
            }

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
