<%@page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Cloud based web application</title>

<c:url var="home" value="/" scope="request" />


<spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

</head>



<div class="container" style="min-height: 500px">

	<div class="starter-template">
		<h1>Time Aggregator</h1>
		<br>

		<div id="formatter"></div>

		
		<form class="form-horizontal" id="date-form">
			 <div class="form-group"> 
				<div class="col-sm-offset-2 col-sm-10" >
					<button type="submit" value="aggDate"
						class="btn btn-primary" >AggDate</button>
				</div>
				<div class="col-sm-offset-2 col-sm-10" >
					<button type="submit" value="UTCDate" class="btn btn-primary" >UTCDate</button>
				</div>
				<div class="col-sm-offset-2 col-sm-10" >
					<button type="submit" value="ISODate" class="btn btn-primary" >ISODate</button>
				</div>
			</div>
		</form>

	</div>

</div>


<script>

$(function () {
    $("#date-form button").click(function (ev) {
        ev.preventDefault() 
         if ($(this).attr("value") == "aggDate") {
        	getDate();
        }
        if ($(this).attr("value") == "UTCDate") {
        	getUTCDate();
        }
        if ($(this).attr("value") == "ISODate") {
        	getISODate();
        } 
    });
});
	
	

	function getDate() {
		var date = {}

		$.ajax({
			type : "POST",
			contentType : "application/json", 
			url : "${home}/search/api/getAggdate",
			data : JSON.stringify(date),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				display(data);
			},
			error : function(e) {
				console.log("ERROR: ", e);
				display(e);
			},
			done : function(e) {
				console.log("DONE");
			}
		});

	}
	function getUTCDate() {
		var date = {}

		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${home}/search/api/getUTCDate", 
			data : JSON.stringify(date),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				display(data);
			},
			error : function(e) {
				console.log("ERROR: ", e);
				display(e);
			},
			done : function(e) {
				console.log("DONE");
			}
		});

	}

	function getISODate() {
		var date = {}

		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${home}/search/api/getISOdate", 
			data : JSON.stringify(date),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				display(data);
			},
			error : function(e) {
				console.log("ERROR: ", e);
				display(e);
			},
			done : function(e) {
				console.log("DONE");
			}
		});

	}
	

	function display(data) {
		var json = "<h4>Ajax Response</h4><pre>"
				+ JSON.stringify(data, null, 4) + "</pre>";
		$('#formatter').html(json);
	}
</script>

</body>
</html>