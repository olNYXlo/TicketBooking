<%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>



<h2>
Seats Available For Terminator 3 Movie @ 1430
</h2>

<hr>

<form:form name = "myform" action = "PickSeats" modelAttribute = "MovieSeats" >
<!--  provides link to showForm -->>
Available Movie Seats :


<form:radiobuttons path="Selection" items="${MovieSeats.getSeats().keySet()}" />



<input type ="submit" />
</form:form>

</body>


</html>