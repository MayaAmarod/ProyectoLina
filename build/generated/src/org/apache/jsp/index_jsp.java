package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>LINA - Inicio</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Imagen/LogoLina.svg\" type=\"image/x-icon\">        \n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/EstiloPagComercial.css\" rel=\"stylesheet\" type=\"text/css\"/>    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800&display=swap\" rel=\"stylesheet\"> \n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"clogo\">\n");
      out.write("                <img src=\"Imagen/LogoLina2.svg\" alt=\"\" class=\"logoinicial\">\n");
      out.write("                </div>\n");
      out.write("            <nav>\n");
      out.write("                ");

                    String mensajeUS = (String) session.getAttribute("Usuario");
                
      out.write("  \n");
      out.write("                \n");
      out.write("                <a href=\"#\">Inicio</a>\n");
      out.write("                <a href=\"#\">Acerca de</a>\n");
      out.write("                <a href=\"#\">Portafolio</a>\n");
      out.write("                <a href=\"#\">Servicios</a>\n");
      out.write("                <a href=\"#\">Contacto</a>\n");
      out.write("                 <a href=\"Login.jsp\">Iniciar Sesión</a>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                            \n");
      out.write("            </nav>\n");
      out.write("            <section class=\"textos-header\">\n");
      out.write("                <h1>Con Lina Podras</h1>\n");
      out.write("                <h2></h2>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"wave\" style=\"height: 150px; overflow: hidden;\"><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\"\n");
      out.write("                                                                            style=\"height: 100%; width: 100%;\">\n");
      out.write("                <path d=\"M0.00,49.98 C150.00,150.00 349.20,-50.00 500.00,49.98 L500.00,150.00 L0.00,150.00 Z\"\n");
      out.write("                      style=\"stroke: none; fill: #fff;\"></path>\n");
      out.write("                </svg></div>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <section class=\"contenedor sobre-nosotros\">\n");
      out.write("                <h2 class=\"titulo\">Nuestro producto</h2>\n");
      out.write("                <div class=\"contenedor-sobre-nosotros\">\n");
      out.write("                    <img src=\"Imagen/ilustracion5.svg\" alt=\"\" class=\"imagen-about-us\">\n");
      out.write("                    <div class=\"contenido-textos\">\n");
      out.write("                        <h3><span>1</span>Web + Aplicaciones</h3>\n");
      out.write("                        <p>Con nuestro sólido equipo de desarrolladores, diseñamos y creamos soluciones digitales que equilibren los objetivos de tu organización con las necesidades de tus usuarios.</p>\n");
      out.write("                        <h3><span>2</span>Contenidos Atrayentes</h3>\n");
      out.write("                        <p>              Te ayudaremos a encontrar tu voz y crear contenido atractivo para tu audiencia a través de historias, artículos y contenido social. Lorem ipsum dolor sit amet.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"portafolio\">\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <h2 class=\"titulo\">Portafolio</h2>\n");
      out.write("                    <div class=\"galeria-port\">\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img1.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img2.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img3.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img1.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img4.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img5.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img6.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"imagen-port\">\n");
      out.write("                            <img src=\"Imagen/img7.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"hover-galeria\">\n");
      out.write("                                <img src=\"Imagen/icono1.png\" alt=\"\">\n");
      out.write("                                <p>Nuestro trabajo</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"clientes contenedor\">\n");
      out.write("                <h2 class=\"titulo\">Que dicen nuestros clientes</h2>\n");
      out.write("                <div class=\"cards\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"Imagen/face1.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"contenido-texto-card\">\n");
      out.write("                            <h4>Laura Diaz</h4>\n");
      out.write("                            <p>Sin duda, el servicio que nos brinda LINA, nos ayuda a ser más eficientes y productivos. Ciertamente, la gestión realizada por ellos es más que sobresaliente.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"Imagen/face2.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"contenido-texto-card\">\n");
      out.write("                            <h4>Sofia Perez</h4>\n");
      out.write("                            <p>Sobre todo, nos han brindado asesoría y nos han prestado el servicio, que ha hecho que no tengamos problemas con nuestros procesos. Realmente saben lo que hacen.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"about-services\">\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <h2 class=\"titulo\">Nuestros servicios</h2>\n");
      out.write("                    <div class=\"servicio-cont\">\n");
      out.write("                        <div class=\"servicio-ind\">\n");
      out.write("                            <img src=\"Imagen/ilustracion1.svg\" alt=\"\">\n");
      out.write("                            <h3>AGILIZAR</h3>\n");
      out.write("                            <p>Agilizar porcesos de tu empresa</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"servicio-ind\">\n");
      out.write("                            <img src=\"Imagen/ilustracion3.svg\" alt=\"\">\n");
      out.write("                            <h3>MEJORAR</h3>\n");
      out.write("                            <p>Mejorar la productividad de tus empleados</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"servicio-ind\">\n");
      out.write("                            <img src=\"Imagen/ilustracion4.svg\" alt=\"\">\n");
      out.write("                            <h3>AUMENTAR</h3>\n");
      out.write("                            <p>Aumentar tus ganancias significativamente</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"contenedor-footer\">\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Telefono</h4>\n");
      out.write("                    <p>8296312</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Email</h4>\n");
      out.write("                    <p>Empresa@registrate.com.co</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Ubicacion</h4>\n");
      out.write("                    <p>**********</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"titulo-final\">&copy; Privacy & Cookies Policy </h1>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
