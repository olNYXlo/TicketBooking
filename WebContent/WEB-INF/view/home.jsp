<%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>
Golden Village Cinemas
</h2>

<hr>

<!--  provides link to showForm -->>

<form:form name = "myform" action = "pickMovie" modelAttribute = "MovieListings" >
<!--  provides link to showForm -->>
Available Movies :


<form:radiobuttons path="Selection" items="${MovieListings.movieListing.keySet()}" />



<input type ="submit" />
</form:form>
<a href = "/Reply"> Response Body create object</a>
<br><br>
<a href = "/Response"> Response Body</a>
<br><br>
<a href = "/Request"> Request Body</a>
<br><br>
</body>


</html>