<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 12/31/2021
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <center><h2 style="color: brown">Danh Sách Khách Hàng</h2></center>
  <form method="get">
    <table border="1">
      <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa chỉ</th>
        <th>Điểm</th>
      </tr>
        <c:forEach var="student" items="${studentList}">
      <tr>
            <td><c:out value="${student.name}"></c:out></td>
            <td><c:out value="${student.date}"></c:out></td>
            <td><c:out value="${student.address}"></c:out></td>
            <td><c:out value="${student.grade}"></c:out></td>
      </tr>
        </c:forEach>
    </table>
  </form>
  </body>
</html>