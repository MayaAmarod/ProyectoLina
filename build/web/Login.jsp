<!DOCTYPE HTML>
<!-- definir que versi�n de HTML5 se usa para que el navegador interprete-->
<html lang="es-ES">
    <!-- definir idioma -->
    <head>
        <!-- informacion que lee el navegador y no muestra -->
        <title>
            Ingresar
        </title>
        <!-- definit titulo -->
        <!-- metaetiquetas -->
        <meta charset="utf-8">
        <!-- permite lectura de caracteres especiales -->
        <meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">
        <!-- realizar la identificacion de resolucion de los diapositivos -->

        <link href="css/Estilo.css" rel="stylesheet" type="text/css"/>
        <!--enlazar hoja de estilo -->
        </link>
        </link>
        </meta>
        </meta>
    </head>
    <body oncopy="return false" onpaste="return false">
        <div class="container">
            <header >
            </header>
            <nav>
            </nav>
            <main>

                <div class="contenedor">
                    <!-- agrupar contenido en bloques -->
                    <div class="ContenedorFormulario">
                        <!-- contenedor formulario -->
                        <img class="logo" src="Imagen/LogoLina.svg">
                        <!-- insertar logo -->
                        <h1 class="titulo">
                            Iniciar Sesi�n
                        </h1>
                        <!-- dividir elementos en categorias, se asigna una clase para el elemento ejemplo h1 -->
                        <form action="InicioSesion" method="post">
                            <label for="textcorreo">
                                Correo:
                            </label>
                            <input id="correo" name="textcorreo" 
                                   autofocus="autofocus" type="text" 
                                   placeholder="cuenta@example.com"
                                   pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}"
                                   title="Car�cter Invalido, solo se permite (_.)"
                                   required>                                
                            <!-- id amarrar input a label-->
                            <br>
                            <!--type clave-->
                            <label for="clave">
                                Contrase�a:
                            </label>
                            <input id="clave" name="textClave"  type="password"
                                   placeholder="Ingresa aqui su contrase�a"

                                   required>
                            <br>

                            <div class= "MensajeE" >

                                <%
                                    if (request.getAttribute("MensajeU") != null) {
                                %>
                                ${MensajeU}
                                <%} else {%>
                                ${mensajeExito}
                                <%}%>
                            </div>
                            <!--type submit-->
                            <input name="btnenviar" type="submit" value="Ingresar">
                            </br>
                            </br>
                        </form>
                        <span class="Ocontrasena">
                            �Ha Olvidado su contrase�a?
                            <a href="#">
                                Recordar
                            </a>
                        </span>
                        <span class="registrarse">
                            <a href="Registro.jsp">
                                Registrarse
                            </a>
                        </span>
                        </img>
                    </div>
                    <!-- contenedor Informacion -->
                    <div class="ContendedorTexto">
                        <div class="ContenedorDegrade">
                            <div class="contenedorText">
                                <h1 class="TTitulo"> Con Lina Podr�s:</h1>
                                <p class="TDescripcion">
                                    <strong> Optimizar</strong> los procesos de tu empresa <br>
                                    <strong>  Mejorar </strong>la productividad de tus empleados<br>
                                    <strong> Aumentar</strong> tus ganancias<br></p>
                            </div>
                        </div>              
                    </div>
                </div>
            </main>
            <footer>
            </footer>
        </div>
    </body>
</html>