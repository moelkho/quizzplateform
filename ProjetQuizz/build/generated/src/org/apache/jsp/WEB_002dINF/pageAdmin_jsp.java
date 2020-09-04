package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"./index-style.css\" rel=\"stylesheet\" media=\"all\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <title>Page Administrateur </title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"nav-bar\">\n");
      out.write("\t\n");
      out.write("            <!-- icome home  -->\n");
      out.write("            <a href=\"./index.html\">  <img  src=\"images/homeicon.png\" alt=\"home icon\"  id=\"imghome\"  /> </a>\n");
      out.write("\t\t\n");
      out.write("             <img  src=\"images/profilicon.jpg\" alt=\"profil icon\"  id=\"imgprofil\"  />\n");
      out.write("\t        <p>Anglais: \n");
      out.write("                    <a href=\"pageAdminEN.jsp\"><input type=\"submit\" value=\"EN\" name=\"\"></a>  \n");
      out.write("                </p> \n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1> Gestion des Utilisateurs et des Questions </h1>\n");
      out.write("        \n");
      out.write("        <!-- infos Administrateur -->\n");
      out.write("        \n");
      out.write("        <div class=\"Gestion\" style=\"color : red;\">\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("             \n");
      out.write("        </div>     \n");
      out.write("        \n");
      out.write("        <!-- liens vers les pages d'administration -->\n");
      out.write("        \n");
      out.write("        <div id=\"Liens\">    \n");
      out.write("            \n");
      out.write("\n");
      out.write("       <h2> <a href=\"ShowAllUsersServlet\"> Afficher Les utilisateurs </a></h2>\n");
      out.write("       <h2> <a href=\"showAllQuestionsServlet\"> Afficher Les questions </a></h2>\n");
      out.write("       <h2> <a href=\"showAllReponsesServlet\"> Visualiser les questions et les reponses </a></h2>\n");
      out.write("       <h2> <a href=\"VisualiserQuizzServlet\"> Visualiser le Quizz </a></h2>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        </div>   \n");
      out.write("\n");
      out.write("        <h2 > Gestion des utilisateurs</h2>\n");
      out.write("        \n");
      out.write("        <!-- formulaire pour ajouter un utilisateur --> \n");
      out.write("        \n");
      out.write("        <div class=\"Gestion\">\n");
      out.write("       <form method=\"post\" action=\"AdminAddUser\" >\n");
      out.write("           <table border=\"2\">\n");
      out.write("               <tr>\n");
      out.write("                   <td colspan=\"2\">\n");
      out.write("                        Ajouter Utilisateur\n");
      out.write("                    </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                    <td class=\"numero\">\n");
      out.write("                        Nom d'utilisateur\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                        <input type=\"text\" name=\"nomUtilisateur\">\n");
      out.write("                     </td>\n");
      out.write("\n");
      out.write("               </tr>\n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                     <td>\n");
      out.write("                         mot de Passe \n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"motdePassUtilisateur\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Type Utilisateur\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <select name=\"typeUtilisateur\">\n");
      out.write("                             <option value=\"administrateur\"> Administrateur </option>\n");
      out.write("                             <option value=\"utilisateur\"> Utilisateur </option>\n");
      out.write("                          </select>\n");
      out.write("                     </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td >\n");
      out.write("                    <button type=\"submit\" name=\"submit\"> Submit </button>\n");
      out.write("                    </td>\n");
      out.write("                    <td >\n");
      out.write("                    <button type=\"reset\" name=\"rest\"> Reset </button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("         <h2> Gestion des questions</h2>\n");
      out.write("         \n");
      out.write("          <!-- formulaire pour ajouter une question --> \n");
      out.write("\n");
      out.write("         <div class=\"Gestion\">\n");
      out.write("          <form method=\"post\" action=\"AdminAddQuestion\" >\n");
      out.write("           <table border=\"2\">\n");
      out.write("               <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                         Ajouter Question\n");
      out.write("                     </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                     <td class=\"numero\">\n");
      out.write("                         Numero de la question\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"numeroQuestion\">\n");
      out.write("                     </td>\n");
      out.write("\n");
      out.write("               </tr>\n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                     <td>\n");
      out.write("                         Enonce Question\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <textarea name=\"enonceQuestion\" style=\"width: 180px; height: 100px\"> </textarea>\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td >\n");
      out.write("                    <button type=\"submit\" name=\"submit\"> Submit </button>\n");
      out.write("                    </td>\n");
      out.write("                    <td >\n");
      out.write("                    <button type=\"reset\" name=\"rest\"> Reset </button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("             </form> \n");
      out.write("             </div> \n");
      out.write("\n");
      out.write("          \n");
      out.write("              <h2>Gestion des reponses </h2>\n");
      out.write("              \n");
      out.write("               <!-- formulaire pour ajouter des reponses  -->\n");
      out.write("               \n");
      out.write("            <div class=\"Gestion\">  \n");
      out.write("              <form method=\"post\" action=\"AdminAddReponse\">\n");
      out.write("                  <table border=\"2\">\n");
      out.write("                           <tr>\n");
      out.write("                     <td class=\"numero\">\n");
      out.write("                         Numero Reponse 1\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"numeroReponse1\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Enonce Reponse 1\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"enonceReponse1\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Lien avec la Question numero : \n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"lienReponse1Question\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                     <td class=\"numero\">\n");
      out.write("                         Numero Reponse 2\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"numeroReponse2\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Enonce Reponse 2\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"enonceReponse2\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Lien avec la Question numero : \n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"lienReponse2Question\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                     <td class=\"numero\">\n");
      out.write("                         Numero Reponse 3\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"numeroReponse3\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Enonce Reponse 3\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"enonceReponse3\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td>\n");
      out.write("                        Lien avec la Question numero : \n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <input type=\"text\" name=\"lienReponse3Question\">\n");
      out.write("                      </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                    <td >\n");
      out.write("                    <button type=\"submit\" name=\"submit\"> Submit </button>\n");
      out.write("                    </td>\n");
      out.write("                    <td >\n");
      out.write("                    <button type=\"reset\" name=\"rest\"> Reset </button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                      </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("     </div>     \n");
      out.write("              \n");
      out.write("        <!-- Balise button pour un bouton de retour en arriere -->\n");
      out.write("        <a href=\"./index.html\"><button id=\"retourbutton\" class=\"controlbutton\">Retour </button></a>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("user");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Users}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("              <li> Bonjour : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.utilisateurName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("              <li>Votre mot de passe est :");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.motdepass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("              <li> Vous etes un : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.typeuser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\n");
          out.write("             \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
