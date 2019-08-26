<%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>



<h2>
Terminator 4 Movie Timings
</h2>

<hr>

<form:form name = "myform" action = "{Selection}" modelAttribute = "MovieListings" >
<!--  provides link to showForm -->>
Available Movie Timings :


<form:radiobuttons path="Selection" items="${MovieListings.movieListing.get('Terminator 4').getTimeSlots().keySet()}" />



<input type ="submit" />
</form:form>

</body>


</html>