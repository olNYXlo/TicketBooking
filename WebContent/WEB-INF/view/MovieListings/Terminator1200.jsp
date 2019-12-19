<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>

	<script>
	function initializeButtons() {
	var entry=document.SeatSelection.Seats.value; 

	if (entry==1) {
	return disabled;
	} else{
						
	return;
	}
	}
	</script>


	<h2>Seats Available For Terminator Movie @ 1200</h2>

	<hr>

	<form:form name="myform" action="PickSeats" modelAttribute="MovieSeats">
		<!--  provides link to showForm -->>
Available Movie Seats :


<form:radiobuttons path="Selection"
			items="${MovieSeats.getSeats().keySet()}" />





	<input type="submit" />
	
	</form:form>
	
	<form:form name="SeatSelection" action="SelectedSeats" modelAttribute="MovieSeats">
	<ol>
		<c:forEach items="${MovieSeats.getSeats().entrySet()}" var="seat">
			<button id={seat.getKey()} style="background-color: blue" onClick = initializerButtons()>
			${seat.getKey()}
			</button>
		</c:forEach>
	</ol>
	
	

	
	
	<br><br>
	<ol>
		<c:forEach items="${MovieSeats.getSeats().entrySet()}" var="seat">
		<script>
		initializeButtons(seat);
		</script>
		</c:forEach>
	</ol>
	
	</form:form>
	
	<input type="submit" />
	
	<br>
	<br>


</body>


</html>