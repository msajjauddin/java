
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="customer" class="classic.web.app.CustomerBean" scope="session"/>
<c:if test="${param.signout}">
	<c:set target="${customer}" property="id"/>
</c:if>
<jsp:setProperty name="customer" property="*"/>


<html>
	<head>
		<title>ClassicWebApp</title>
	</head>
	<body>
		<h1>Welcome Customoer</h>
		<form method="post" autocomplete="off" >
			<p>
				<b>Customer ID</b>
				<br/>
				<input type="text" name="id"/>
			</p>

			<p>
				<b>Password</b>
				<br/>
				<input type="password" name="password"/>
			</p>

			<p>
			<input type="submit" name="submit" value="Login"/>
			</p>
		</form>
		<c:if test="${param.submit == 'Login'}">
			<c:choose>
				<c:when test="${customer.authenticate()}">
				  <c:redirect url="invoice.jsp"/>
				</c:when>
				<c:otherwise>
					<p><i>Invalid CustomerID or Password</i></p>
				</c:otherwise>

			</c:choose>
		</c:if>


	</body>

</html>
































