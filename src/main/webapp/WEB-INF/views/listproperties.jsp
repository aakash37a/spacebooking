<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Properties List</title>
</head>
<body>
<h3>Properties List</h3>
<c:if test="${!empty propertyList}">
	<table class="tg">
	
	<c:forEach items="${propertyList}" var="property">
		<tr>
			<td>${property.id}</td>
			<td>${property.accomodationSize}</td>
			<td>${property.amount}</td>
			<td>${property.categoryId}</td>
			
			<td>${property.contactEmail}</td>
			<td>${property.contactName}</td>
			<td>${property.contactNo}</td>
			<td>${property.imageFolder}</td>
			<td>${property.location}</td>
			<td>${property.maxBookingDays}</td>
			<td>${property.propertyArea}</td>
			<td>${property.propertyDesc}</td>
			<td>${property.propertyId}</td>
			<td>${property.propertyName}</td>
			<td>${property.securityCharges}</td>
			<td>${property.tax1}</td>
			<td>${property.tax2}</td>
			<td><img src="resources/Desert.jpg"/></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>