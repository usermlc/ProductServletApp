
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>List of Products</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Cost</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.id}</td>
            <td>${product.title}</td>
            <td>${product.cost}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
