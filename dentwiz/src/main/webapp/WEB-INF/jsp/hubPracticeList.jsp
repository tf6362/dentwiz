<%--
  Created by IntelliJ IDEA.
  User: bbates
  Date: 12/18/16
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>HubPractice</h2>
   <table>
       <c:forEach items="${hubPracticeList}" var="hubPractice" begin="1" end="999999">
         <tr>
             <td> guid: ${hubPractice.guid}  </td>
             <td> name: ${hubPractice.practiceName}  </td>
         </tr>
       </c:forEach>

</table>
</body>
</html>


