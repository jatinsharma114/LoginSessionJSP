<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
	    // Once you logout you will not able to access this page by pressing the Back button 
	    // Why because you are being remove from casch as well.
	    // so no-cache 
	    // You are not in the session.  
	    // In Http under - session cookies cach 
	    // Browser (client) 
	    // Sending the Header to the Client from server. 
		response.setHeader("Cache-control","no-cache, no-store, must-revalidate");
	
	    //If user is not loged in.
		if(session.getAttribute("username") == null) {
			response.sendRedirect("index.jsp"); //Status Code 302 Redirect 
		} 
	
	%>
   
   Welcome ${username} , You are successfully login!!
   <br>
   <br>
   <a href=""> Application Page for CRUD </a>
   <br>
   <br>
   LogOut:::::::::::::::::::::::::::::::::
   <form action="logout">
   		<input type="submit" value="logout">
   </form>

</body>
</html>