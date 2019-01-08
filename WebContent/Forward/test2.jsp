<jsp:forward page="finaltest.jsp">
	<jsp:param name="nom" value="<%= request.getParameter(\"nom\") %>"/>
	<jsp:param name="prenom" value="<%= request.getParameter(\"prenom\") %>"/>
	<jsp:param name="nom" value="<%= request.getParameter(\"age\") %>"/>
</jsp:forward>