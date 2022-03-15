<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
	
	</head>
	<body>
		<form:form action="throwing" method="get" modelAttribute="players"> 
			<input type="submit" value="Throw"/>     
		</form:form>
	
		<table>
			<thead>
				<tr>
					<c:forEach var="player" items="${players}">
						<th>${player.getName()}</th>
					</c:forEach>
				</tr>
			</thead>
			<tbody>
				<tr>
					<c:forEach var="player" items="${players}">
						<c:forEach var="lanzamiento" items="${player.getPointsHistorical()}">
							<td>${lanzamiento}</td>
						</c:forEach>
					</c:forEach>
				</tr>
			</tbody>
		</table>
		  
	</body>
</html>
