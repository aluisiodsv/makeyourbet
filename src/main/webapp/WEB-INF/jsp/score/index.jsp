<head>
	<title>Score [index]</title>
</head>
<body>
	<h1>Listing Scores</h1>

	<table>
		<tr>
			<th>Showdown</th>
			<th>Result1</th>
			<th>Result2</th>
			<th>Game</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${scoreList}" var="score">
			<tr>
				<td>${score.showdown.team1.name} x ${score.showdown.team2.name}</td>
				<td>${score.result1}</td>
				<td>${score.result2}</td>
				<td>${score.game.number}</td>
				<td><a href="${pageContext.request.contextPath}/scores/${score.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/scores/${score.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/scores/${score.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/scores/new">New Score</a> 
</body>