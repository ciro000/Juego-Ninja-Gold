<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Ninja Gold Game</title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	
	<body>
		<h1> Your gold: <c:out value="${gold}"/>  </h1>
		
		<div class="places"> 		
				<div class="lugares">
					<h4> Farm </h4>
					<p>(earns 10-20 gold)</p>
					<form action="/farm" method="POST">
						<button> Find Gold! </button>
					</form>
				</div>
				
				<div class="lugares">
					<h4> Cave </h4>
					<p>(earns 5-10 gold)</p>
					<form action="/cave" method="POST">
						<button> Find Gold! </button>
					</form>
				</div>
				
				<div class="lugares">
					<h4> House </h4>
					<p>(earns 2-5 gold)</p>
					<form action="/house" method="POST">
						<button> Find Gold! </button>
					</form>
				</div>
				
				<div class="lugares">
					<h4> Casino! </h4>
					<p>(earns/takes 0-50 gold)</p>
					<form action="/casino" method="POST">
						<button> Find Gold! </button>
					</form>
				</div>
				
				<div class="lugares">
					<h4> Spa </h4>
					<p>(takes 5-20 gold)</p>
					<form action="/spa" method="POST">
						<button> Go to Spa! </button>
					</form>
				</div>
		</div>
		
		
		<section>
			<h2> Activities:</h2>
			
			<div class="actividades">
				<p> <c:out value="${text}"/>. </p>
			</div>
		</section>
		
		<form action="/reset" method="GET">
						<button class="reset"> Start Over! </button>
					</form>
		
	</body>
	
</html>