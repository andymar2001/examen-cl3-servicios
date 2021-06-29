<%@page import="webservice.User"%>
<%@page import="modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <!--FAVICON-->
        <link rel="shortcut icon" href="assets/img/icon/favicon.ico"/>
        <!--OPEN GRAPH-->
        <meta property="og:title" content="Farma Cibertec"/>
        <meta property="og:type" content="website"/>
        <meta property="og:url" content="www.farmacibertec.com"/>
        <meta property="og:image" content=""/>
        <meta property="og:description" content="Descripción"/>
        <!--SCHEMA MARKUP FOR GOOGLE-->
        <meta itemprop="name" content="Farma Cibertec"/>
        <meta itemprop="description" content="Descripción"/>
        <meta itemprop="image" content=""/>
        <!--TWITTER CARD DATA-->
        <meta name="twitter:card" content=""/>
        <meta name="twitter:site" content="www.farmacibertec.com"/>
        <meta name="twitter:title" content="Farma Cibertec"/>
        <meta name="twitter:description" content="Descripción"/>
        <meta name="twitter:image:src" content=""/>
        <!--FONTAWESOME-->
        <link rel="stylesheet" href="assets/fontawesome/css/all.min.css?t=1624927214688"/>
        <script src="assets/fontawesome/js/all.min.js?t=1624927214688"></script>
        <!--STYLE BASE-->
        <link rel="stylesheet" href="css/styles.css"/>
        <title>Actualizar</title>
        <meta name="description" content="Descripccion"/>
    </head>
    <body>
        <header class="header">
            <div class="header__top">
                <div class="header__top--container container">
                    <div class="header__bars" id="bars-menu"><i class="fas fa-bars"></i></div>
                    <div class="header__right">
                        <div class="header__user"><a href="login.html">Cerrar sesión</a></div>
                    </div>
                </div>
            </div>
        </header>

        <main class="main">
            <%
                int id = Integer.parseInt((String) request.getAttribute("iduser"));
                UserService user = new UserService();
                User u = user.listarID(id);
            %>
            <form class="login-page section" action="Controlador">
                <div class="login-page__container container">
                    <h2 class="title">Añadir Usuario</h2>
                    <div class="form-login">
                        <div class="form-login__group">
                            <label class="label">Codigo</label>
                            <input class="input" type="text" name="txtId" placeholder="Id" readonly="" value="<%= u.getId()%>"/>
                        </div>
                        <div class="form-login__group">
                            <label class="label">Nombres</label>
                            <input class="input" type="text" name="txtFirstName" placeholder="Nombres" value="<%= u.getFirstName()%>"/>
                        </div>
                        <div class="form-login__group">
                            <label class="label">Apellidos</label>
                            <input class="input" type="text" name="txtLastName" placeholder="Apellidos" value="<%= u.getLastName()%>"/>
                        </div>
                        <div class="form-login__group">
                            <label class="label">Celular</label>
                            <input class="input" type="text" name="txtPhone" placeholder="Celular" value="<%= u.getPhone()%>"/>
                        </div>
                        <div class="form-login__group">
                            <label class="label">Email</label>
                            <input class="input" type="email" name="txtEmail" placeholder="Email" value="<%= u.getEmail()%>"/>
                        </div>
                        <div class="form-login__group">
                            <input class="form-login__button button" name="accion" type="submit" value="Actualizar"/>
                        </div>
                    </div>
                </div>
            </form>
        </main>
        <footer class="footer">
            <div class="footer__container container"></div>
            <div class="credits">
                <div class="credits__container container">
                    <p class="credits__paragraph">Desarrollado por <a href="#">Andy Mariños - CL3</a></p>
                </div>
            </div>
        </footer>
    </body>
</html>
