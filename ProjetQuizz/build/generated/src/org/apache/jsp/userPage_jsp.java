package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"./index-style.css\" rel=\"stylesheet\" media=\"all\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("                \n");
      out.write("        <div class=\"nav-bar\">\n");
      out.write("\t\n");
      out.write("            <!-- icome home  -->\n");
      out.write("            <a href=\"./index.html\">  <img  src=\"images/homeicon.png\" alt=\"home icon\"  id=\"imghome\"  /> </a>\n");
      out.write("\t\t\n");
      out.write("             <img  src=\"images/profilicon.jpg\" alt=\"profil icon\"  id=\"imgprofil\"  />\n");
      out.write("             <br>\n");
      out.write("\t      <p>\n");
      out.write("                Anglais<a href=\"langueEN.jsp\"><input type=\"submit\" value=\"EN\" name=\"\"></a>\n");
      out.write("                Espaniol<a href=\"langueES.jsp\"><input type=\"submit\" value=\"ES\" name=\"\"> </a>\n");
      out.write("            </p>   \n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"Gestion\">\n");
      out.write("        <form name=\"questionReponse\" action=\"ScoreServlet\" method=\"POST\">\n");
      out.write("            <h2><b><i>Questions Du Quizz</b></i></h2>\n");
      out.write("                      \n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"colored\">\n");
      out.write("                        <td>Question 1: Quelle est la capitale du Canada ?</td>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"R1\" value=\"New York\" />New York <br>\n");
      out.write("                            <input type=\"radio\" name=\"R1\" value=\"Ottawa\" />Ottawa<br>\n");
      out.write("                            <input type=\"radio\" name=\"R1\" value=\"Paris\" />Paris\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>        \n");
      out.write("                    <br><br>\n");
      out.write("             <table border=\"1\">\n");
      out.write("                <tbody>        \n");
      out.write("                    <tr class=\"colored\">\n");
      out.write("                        <td>Question 2: Quelle est la monnaie du Canada ?</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"R2\" value=\"Dirham\" />Dirham<br>\n");
      out.write("                            <input type=\"radio\" name=\"R2\" value=\"Euro\" />Euro<br>\n");
      out.write("                            <input type=\"radio\" name=\"R2\" value=\"Dollar Canadien\" />Dollar Canadien\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("              \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("                 <br><br>\n");
      out.write("             <table border=\"1\">\n");
      out.write("                <tbody>        \n");
      out.write("                    <tr class=\"colored\">\n");
      out.write("                        <td>Question 3: Quel est le nom du premier ministre du Canada ?<br>\n");
      out.write("                    </tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"R3\" value=\"Trudeau\" />Trudeau<br>\n");
      out.write("                            <input type=\"radio\" name=\"R3\" value=\"Legault\" />Legault<br>                                                  \n");
      out.write("                            <input type=\"radio\" name=\"R3\" value=\"Trump\" />Trump\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                </tbody>\n");
      out.write("            </table>  \n");
      out.write("                 <br><br>\n");
      out.write("                  <tr>Enter votre nom :<input type=\"text\" name=\"utilisateur\"></tr>\n");
      out.write("                    <br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Envoyer Reponses\" name=\"submit\" />\n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("                 <br>\n");
      out.write("                 <a href=\"index.html\"><h2>Page d'accueil</h2></a>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
