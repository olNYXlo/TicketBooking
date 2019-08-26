<%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>



<h2>
Terminator 3 Movie Timings
</h2>

<hr>

<form:form name = "myform" action = "{Selection}" modelAttribute = "MovieListings" >
<!--  provides link to showForm -->>
Available Movie Timings :


<form:radiobuttons path="Selection" items="${MovieListings.movieListing.get('Terminator 3').getTimeSlots().keySet()}" />



<input type ="submit" />
</form:form>
</body>


</html>