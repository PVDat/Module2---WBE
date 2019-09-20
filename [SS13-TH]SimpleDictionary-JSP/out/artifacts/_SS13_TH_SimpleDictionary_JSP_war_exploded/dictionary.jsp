<%--
  Created by IntelliJ IDEA.
  User: K
  Date: 20/09/2019
  Time: 9:19 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>

<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "xin chào");
    dic.put("how", "thế nào");
    dic.put("book", "sách");
    dic.put("computer", "máy tính");

    String search = request.getParameter("search");

    String result = dic.get(search);
    if (result != null) {
        out.println("Word: "+search);
        out.println("Mean: "+result);
    } else {
        out.println("Not found");
    }
%>

</body>
</html>
