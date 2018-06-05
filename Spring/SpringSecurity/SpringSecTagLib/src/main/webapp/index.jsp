<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<html>
<body>
<h2>Hello World!</h2>

<p> welcome <sec:authentication property="name" /></p>
<sec:authorize ifAnyGranted="ROLE_USER">

Hello admin
</sec:authorize>

</body>
</html>
