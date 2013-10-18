<head>
	<title>Game [index]</title>
</head>
<body>
	<h1>Listing Games</h1>

	<table>
		<tr>
			<th>Number</th>
			<th>Current</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${gameList}" var="game">
			<tr>
				<td>${game.number}</td>
				<td>${game.current}</td>
				<td><a href="${pageContext.request.contextPath}/games/${game.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/games/${game.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/games/${game.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/games/new">New Game</a> 
</body>