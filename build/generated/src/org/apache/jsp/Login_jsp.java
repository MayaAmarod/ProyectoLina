package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("<!-- definir que versión de HTML5 se usa para que el navegador interprete-->\n");
      out.write("<html lang=\"es-ES\">\n");
      out.write("    <!-- definir idioma -->\n");
      out.write("    <head>\n");
      out.write("        <!-- informacion que lee el navegador y no muestra -->\n");
      out.write("        <title>\n");
      out.write("            Ingresar\n");
      out.write("        </title>\n");
      out.write("        <!-- definit titulo -->\n");
      out.write("        <!-- metaetiquetas -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!-- permite lectura de caracteres especiales -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" name=\"viewport\">\n");
      out.write("        <!-- realizar la identificacion de resolucion de los diapositivos -->\n");
      out.write("\n");
      out.write("        <link href=\"css/Estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--enlazar hoja de estilo -->\n");
      out.write("        </link>\n");
      out.write("        </link>\n");
      out.write("        </meta>\n");
      out.write("        </meta>\n");
      out.write("    </head>\n");
      out.write("    <body oncopy=\"return false\" onpaste=\"return false\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header >\n");
      out.write("            </header>\n");
      out.write("            <nav>\n");
      out.write("            </nav>\n");
      out.write("            <main>\n");
      out.write("\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <!-- agrupar contenido en bloques -->\n");
      out.write("                    <div class=\"ContenedorFormulario\">\n");
      out.write("                        <!-- contenedor formulario -->\n");
      out.write("                        <img class=\"logo\" src=\"Imagen/LogoLina.svg\">\n");
      out.write("                        <!-- insertar logo -->\n");
      out.write("                        <h1 class=\"titulo\">\n");
      out.write("                            Iniciar Sesión\n");
      out.write("                        </h1>\n");
      out.write("                        <!-- dividir elementos en categorias, se asigna una clase para el elemento ejemplo h1 -->\n");
      out.write("                        <form action=\"InicioSesion\" method=\"post\">\n");
      out.write("                            <label for=\"textcorreo\">\n");
      out.write("                                Correo:\n");
      out.write("                            </label>\n");
      out.write("                            <input id=\"correo\" name=\"textcorreo\" \n");
      out.write("                                   autofocus=\"autofocus\" type=\"text\" \n");
      out.write("                                   placeholder=\"cuenta@example.com\"\n");
      out.write("                                   pattern=\"[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}\"\n");
      out.write("                                   title=\"Carácter Invalido, solo se permite (_.)\"\n");
      out.write("                                   required>                                \n");
      out.write("                            <!-- id amarrar input a label-->\n");
      out.write("                            <br>\n");
      out.write("                            <!--type clave-->\n");
      out.write("                            <label for=\"clave\">\n");
      out.write("                                Contraseña:\n");
      out.write("                            </label>\n");
      out.write("                            <input id=\"clave\" name=\"textClave\"  type=\"password\"\n");
      out.write("                                   placeholder=\"Ingresa aqui su contraseña\"\n");
      out.write("\n");
      out.write("                                   required>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class= \"MensajeE\" >\n");
      out.write("\n");
      out.write("                                ");

                                    if (request.getAttribute("MensajeU") != null) {
                                
      out.write("\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeU}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--type submit-->\n");
      out.write("                            <input name=\"btnenviar\" type=\"submit\" value=\"Ingresar\">\n");
      out.write("                            </br>\n");
      out.write("                            </br>\n");
      out.write("                        </form>\n");
      out.write("                        <span class=\"Ocontrasena\">\n");
      out.write("                            ¿Ha Olvidado su contraseña?\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                Recordar\n");
      out.write("                            </a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"registrarse\">\n");
      out.write("                            <a href=\"Registro.jsp\">\n");
      out.write("                                Registrarse\n");
      out.write("                            </a>\n");
      out.write("                        </span>\n");
      out.write("                        </img>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- contenedor Informacion -->\n");
      out.write("                    <div class=\"ContendedorTexto\">\n");
      out.write("                        <div class=\"ContenedorDegrade\">\n");
      out.write("                            <div class=\"contenedorText\">\n");
      out.write("                                <h1 class=\"TTitulo\"> Con Lina Podrás:</h1>\n");
      out.write("                                <p class=\"TDescripcion\">\n");
      out.write("                                    <strong> Optimizar</strong> los procesos de tu empresa <br>\n");
      out.write("                                    <strong>  Mejorar </strong>la productividad de tus empleados<br>\n");
      out.write("                                    <strong> Aumentar</strong> tus ganancias<br></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>              \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("            <footer>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
