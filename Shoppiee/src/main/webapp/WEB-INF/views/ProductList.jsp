<%@ page import="com.niit.shoppieebacknd.dao.ProductDAO" %> 
<%@ page import="com.niit.shoppieebacknd.daoimpl.ProductDAOImpl" %> 
<%@ page import="com.niit.shoppieebacknd.model.Product" %>
<%-- <%@ page import="com.niit.ShoppieeBacknd.service.TvService" %> --%>
<%@ page import="java.util.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
table,th,td
{
border:2px solid blue;
border-collapse:collapse;
padding:5px;
}

</style>
</head>
<body>
<h2>Television Details</h2>
<table>
<tr>
<th>PID</th>
<th>PBRAND</th>
<th>NAME</th>
<th>DESCRIPTION</th>
<th>PRICE</th>
<th>QUANTITY</th>
<th>CATEGORY</th>

</tr>
<%

ProductDAO dao=(ProductDAO)request.getAttribute("products");
List<Product> products=dao.getAllProduct();
out.println("<h1> Stock of Product:"+ products.size()+"</h1>");

for(Product p:products)
{
	out.println("<tr>");
	out.println("<td>"+p.getProductId()  +"</td>");
	out.println("<td>"+p.getBrand()  +"</td>");
	out.println("<td>"+p.getProductName()  +"</td>");
	out.println("<td>"+p.getPrice()  +"</td>");
	out.println("<td>"+p.getQuantity()  +"</td>");
	out.println("<td>"+p.getCategory() +"</td>");
	out.println("<td>"+p.getSupplier()  +"</td>");
	
}

%>

</table>
</body>
</html>
