<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/22
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title><style>
    a{
      text-decoration: none;
      color:black;
      font-size: 18px;
    }
    <%--        改变页面标签--%>
    h3{
      width:180px;
      height: 38px;
      margin:100px auto;
      text-align: center;
      line-height: 38px;
      background: blue;
      border-radius:5px;
    }
  </style>

  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍展示</a>
  </h3>
  </body>
</html>
