<%@page import="java.util.List"%>
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
        <link rel="stylesheet" href="assets/fontawesome/css/all.min.css?t=1624927214693"/>
        <script src="assets/fontawesome/js/all.min.js?t=1624927214693"></script>
        <!--STYLE BASE-->
        <link rel="stylesheet" href="css/styles.css?t=1624927214693"/>
        <title>CRUD</title>
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
        <section class="promotions-layout section">
            <div class="promotions__container container">
                <h2 class="title">Usuarios</h2>
                <p class="subtitle">Lista de usuarios</p>
                <div class="promotions-layout__grid">
                    <%
                        UserService user = new UserService();
                        List<User> datos = user.listar();
                        for (User u : datos) {
                    %>
                    <article class="card-product">
                        <figure class="card-product__img"><img src="https://previews.123rf.com/images/stalkerstudent/stalkerstudent1601/stalkerstudent160101173/50961996-vector-icono-de-usuario-estilo-de-dise%C3%B1o-plano-eps-10.jpg" alt="producto"/></figure>
                        <p class="card-product__title"><%= u.getEmail()%></p><span class="card-product__price"><%= u.getFirstName() + " " + u.getLastName()%></span>
                        <p class="card-product__stock"><%= u.getPhone()%></p>
                        <div class="card-product__buttons"><a class="button" href="Controlador?accion=editar&id=<%= u.getId()%>">Actualizar</a><a class="button" href="Controlador?accion=eliminar&id=<%= u.getId()%>">Eliminar</a></div>
                    </article>
                    <%}%>
                </div><a class="promotions-layout__button button-long" href="Controlador?accion=add">Registrar usuario <i class="fas fa-chevron-circle-right"></i></a>
            </div>
        </section>
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
