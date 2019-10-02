<%--
  Created by IntelliJ IDEA.
  User: K
  Date: 23/09/2019
  Time: 4:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <style type="text/css">
    .login {
      height: 180px; width: 300px;
      margin: 0;
      padding: 10px;
      border: 1px #CCC solid;
    }
    .login input{
      padding: 5px;
      margin: 5px;
    }
  </style>
  <head>
    <title>Login</title>
  </head>
  <body>
  <form method="post" action="./login">
    <div class="login">
     <h2>Login</h2>
      <input type="text" name="username" size="30" placeholder="username"/>
      <input type="text" name="password" size="30" placeholder="password"/>
      <input type="submit" value="Sign in">
    </div>
  </form>
  </body>
</html>
