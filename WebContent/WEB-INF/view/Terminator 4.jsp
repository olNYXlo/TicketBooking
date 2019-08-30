<%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>



<h2>
Terminator 4 Movie Timings
</h2>

<hr>

<!-- HAVE TO USE ${name} else the Controller will not be able to get the name -->
<form:form name = "myform" action = "${name}/PickTimeSlot" modelAttribute = "Movie" >
<!--  provides link to showForm -->>
Available Movie Timings :


<form:radiobuttons path="Selection" items="${Movie.getTimeSlots().keySet()}" />



<input type ="submit" />
</form:form>

</body>


</html>