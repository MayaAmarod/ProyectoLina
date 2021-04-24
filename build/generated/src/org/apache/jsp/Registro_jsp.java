package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es-419\">\n");
      out.write("    <!-- definir idioma -->\n");
      out.write("    <head>\n");
      out.write("        <!-- informacion que lee el navegador y no muestra -->\n");
      out.write("        <title>\n");
      out.write("            Registrarse\n");
      out.write("        </title>\n");
      out.write("        <!-- definit titulo -->\n");
      out.write("        <!-- metaetiquetas -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!-- permite lectura de caracteres especiales -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" name=\"viewport\">\n");
      out.write("        <!-- realizar la identificacion de resolucion de los diapositivos -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/formulario.js\"></script> \n");
      out.write("        <link href=\"css/EstiloRe.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--enlazar hoja de estilo -->\n");
      out.write("        </link>\n");
      out.write("        </meta>\n");
      out.write("        </meta>\n");
      out.write("    </head>\n");
      out.write("</html>\n");
      out.write("<body oncopy=\"return false\" onpaste=\"return false\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <header>\n");
      out.write("        </header>\n");
      out.write("        <nav>\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <!-- agrupar contenido en bloques -->\n");
      out.write("                <!-- contenedor Informacion -->\n");
      out.write("                <div class=\"ContendedorTexto\">\n");
      out.write("                    <div class=\"ContenedorDegrade\">\n");
      out.write("                        <div class=\"contenedorText\">\n");
      out.write("                            <img class=\"logo\" src=\"Imagen/LogoLina.svg\">\n");
      out.write("                            <h1 class=\"TTitulo\">\n");
      out.write("                            </h1>\n");
      out.write("                            <p class=\"TDescripcion\">\n");
      out.write("                                <strong>\n");
      out.write("                                    Optimizar\n");
      out.write("                                </strong>\n");
      out.write("                                los procesos de tu empresa\n");
      out.write("                                <br>\n");
      out.write("                                <strong>\n");
      out.write("                                    Mejorar\n");
      out.write("                                </strong>\n");
      out.write("                                la productividad de tus empleados\n");
      out.write("                                <br>\n");
      out.write("                                <strong>\n");
      out.write("                                    Aumentar\n");
      out.write("                                </strong>\n");
      out.write("                                tus ganancias\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ContenedorFormulario\">\n");
      out.write("                    <!-- contenedor formulario -->\n");
      out.write("                    <!-- insertar logo -->\n");
      out.write("                    <h1 class=\"titulo\">\n");
      out.write("                        Registrarse\n");
      out.write("                    </h1>\n");
      out.write("                    <!-- dividir elementos en categorias, se asigna una clase para el elemento ejemplo h1 -->\n");
      out.write("                    <form action=\"Registrar\" method=\"post\">\n");
      out.write("                        <label for=\"usuario\">\n");
      out.write("                            Nombre Completo:\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"usuario\" name=\"textNombre\" \n");
      out.write("                               placeholder=\"usuario\" required \n");
      out.write("                               type=\"text\"\n");
      out.write("                               autocapitalize=\"words\"\n");
      out.write("                               pattern=\"[a-zA-Z ]{10,20}\"\n");
      out.write("                               required autofocus><br>\n");
      out.write("                        <!-- id amarrar input a label-->\n");
      out.write("                        <!--type clave-->\n");
      out.write("                        <label for=\"correo\">\n");
      out.write("                            Correo Electronico:\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"correo\" name=\"textCorreo\" \n");
      out.write("                               placeholder=\"cuenta@example.com\" required\n");
      out.write("                               type=\"email\" onkeyup='checkmail();'\n");
      out.write("                               pattern=\"[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}\"\n");
      out.write("                               title=\"Carácter permitidos(_.)\"><br>\n");
      out.write("\n");
      out.write("                        <label for=\"ccorreo\">\n");
      out.write("                            Confirmar Correo:\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"ccorreo\" name=\"textCcorreo\" \n");
      out.write("                               placeholder=\"Confirme su correo\" required\n");
      out.write("                               type=\"email\" onkeyup='checkmail();'\n");
      out.write("                               autocomplete=\"none\"\n");
      out.write("                               pattern=\"[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}\"\n");
      out.write("                               title=\"Solo se permiten los siguientes cáracteres (_.)\"><br>\n");
      out.write("                        <div class=\"alert\"> <span id=\"alertamail\"></span></div>\n");
      out.write("                        <div class=\"cdocument\"> \n");
      out.write("                            <label for=\"textDocumento\">\n");
      out.write("                                Documento:\n");
      out.write("                            </label>\n");
      out.write("                            <select id=\"textTipoDocumento\" \n");
      out.write("                                    name=\"textTipoDocumento\">\n");
      out.write("                                <option value=\"1\">\n");
      out.write("                                    CC\n");
      out.write("                                </option>\n");
      out.write("                                <option value=\"2\">\n");
      out.write("                                    CE\n");
      out.write("                                </option>\n");
      out.write("                            </select>\n");
      out.write("                            <input id=\"textDocumento\" name=\"textDocumento\" \n");
      out.write("                                   placeholder=\"Ingrese su documento\" \n");
      out.write("                                   required type=\"text\"\n");
      out.write("                                   pattern=\"[0-9]{6,30}\"\n");
      out.write("                                   ti    tle=\"Ingrese solo números\"><br>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <label for=\"textDireccion\">\n");
      out.write("                            Dirección:\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"textDireccion\" name=\"textDireccion\" \n");
      out.write("                               placeholder=\"Ingrese su dirección\" required\n");
      out.write("                               type=\"text\" pattern=\"^[a-zA-Z0-9\\#\\\\-]{4,16}$\"><br>\n");
      out.write("\n");
      out.write("                        <label for=\"textCelular\">\n");
      out.write("                            Celular:\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"textCelular\" name=\"textCelular\" \n");
      out.write("                               placeholder=\"Número de Celular\" \n");
      out.write("                               required=\"\" type=\"text\" pattern=\"^[3]\\d{9}$\"\n");
      out.write("                               title=\"El número ingresado debe iniciar en 3, minimo 10 carácteres\"><br>\n");
      out.write("\n");
      out.write("                        <label for=\"password\">\n");
      out.write("                            Contraseña:\n");
      out.write("                        </label>\n");
      out.write("                        <input id=\"password\" name=\"textClaveR\" \n");
      out.write("                               placeholder=\"Contraseña\" required\n");
      out.write("                               type=\"password\" onkeyup='check();'\n");
      out.write("                               pattern=\"[a-zA-Z0-9_*.%]{12,30}\"\n");
      out.write("                               title=\"La contraseña debe tener minimo 12 digitos,\n");
      out.write("                               letras, números y carácteres especiales(_*.%)\"><br>\n");
      out.write("\n");
      out.write("                        <label for=\"password2\">\n");
      out.write("                            Confirmar Contraseña:\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                        <input id=\"password2\" name=\"textClaveR2\" \n");
      out.write("                               placeholder=\"Confirmar Contraseña\" \n");
      out.write("                               required type=\"password\" onkeyup='check();'\n");
      out.write("                               pattern=\"[a-zA-Z0-9_*.%]{12,30}\"\n");
      out.write("                               title=\"La contraseña debe tener minimo 12 digitos,\n");
      out.write("                               letras, números y carácteres especiales(_*.%)\"><br>\n");
      out.write("                        <div class=\"alert\"> <span id=\"alerta\"></span></div>\n");
      out.write("                        <div class=\"MensajeE\">\n");
      out.write("\n");
      out.write("                            ");

                                if (request.getAttribute("mensajeError") != null) {
                            
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
} else {
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--type submit-->\n");
      out.write("                        <input name=\"btnenviar\" type=\"submit\" value=\"Registrarse\">\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                    </form>\n");
      out.write("                    <span class=\"login\">\n");
      out.write("                        ¿Ya tiene cuenta?\n");
      out.write("                        <a href=\"Login.jsp\">\n");
      out.write("                            Ingresar\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
