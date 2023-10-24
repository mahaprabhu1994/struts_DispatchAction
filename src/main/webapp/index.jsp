
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><bean:message key="title" /> </h1>
<html:form action="empreg">
<table>
<thead></thead>
<tbody>
<tr><td><h3><bean:message  key="id" /></h3></td><td><html:text property="id"  /></td><td><html:errors property="id_e"/></tr> 
<tr><td><h3><bean:message  key="name" /></h3></td><td><html:text property="name"  /></td><td><html:errors property="name_e"/></tr>
<tr><td><h3><bean:message  key="email" /></h3></td><td><html:text property="email"  /></td><td><html:errors property="email_e"/></tr>
<tr><td><h3><bean:message  key="salary" /></h3></td><td><html:text property="salary"  /></td><td><html:errors property="salary_e"/></tr>
<tr><td><h3><bean:message  key="phone" /></h3></td><td><html:text property="phone"  /></td><td><html:errors property="phone_eemail.equals()"/></tr>
<tr><td><html:submit  property="submit"><bean:message key="add"/></html:submit></td></tr>
<tr><td><html:submit property="submit"><bean:message key="update"/></html:submit></td></tr>
</tbody>

</table>
</html:form>
</body>
</html>