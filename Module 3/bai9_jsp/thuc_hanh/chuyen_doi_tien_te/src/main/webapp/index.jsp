<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 12/29/2021
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form method="post"  action="/convert" >
  <div>
    <input type="text" name="rate" placeholder="RATE" value="22000"><br>
    <label>USD:</label><br>
    <input type="text" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
  </div>
</form>
  </body>
</html>
