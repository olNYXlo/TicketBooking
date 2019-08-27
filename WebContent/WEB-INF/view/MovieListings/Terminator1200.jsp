<%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>



<h2>
Seats Available For Terminator Movie @ 1200
</h2>

<hr>

<form:form name = "myform" action = "PickSeats" modelAttribute = "MovieSeats" >
<!--  provides link to showForm -->>
Available Movie Seats :


<form:radiobuttons path="Selection" items="${MovieSeats.getSeats().keySet()}" />





<input type ="submit" />
</form:form>
   <ol>
        <c:forEach items="${MovieSeats.getSeats().keySet()}"  var="seat">
            <button id = {seat} style="background-color: blue">${seat}</button>
        </c:forEach>
    </ol>
    
    <br><br>

    
</body>


</html>