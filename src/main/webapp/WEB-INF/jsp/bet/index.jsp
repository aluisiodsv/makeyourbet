<head>
	<title>Bet [index]</title>
</head>
<body>
	<h1>Listing Bets</h1>

	<table>
		<tr>
			<th>User</th>
			<th>Showdown</th>
			<th>Result1</th>
			<th>Result2</th>
			<th>Game</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${betList}" var="bet">
			<tr>
				<td>${bet.user.name}</td>
				<td>${bet.showdown.team1.name} x ${bet.showdown.team2.name}</td>
				<td>${bet.result1}</td>
				<td>${bet.result2}</td>
				<td>${bet.game.number}</td>
				<td><a href="${pageContext.request.contextPath}/bets/${bet.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/bets/${bet.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/bets/${bet.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/bets/new">New Bet</a> 
</body>