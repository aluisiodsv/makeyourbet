<head>
	<title>Showdown [index]</title>
</head>
<body>
	<h1>Listing Showdowns</h1>

	<table>
		<tr>
			<th>Team1</th>
			<th>Team2</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${showdownList}" var="showdown">
			<tr>
				<td>${showdown.team1.name}</td>
				<td>${showdown.team2.name}</td>
				<td><a href="${pageContext.request.contextPath}/showdowns/${showdown.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/showdowns/${showdown.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/showdowns/${showdown.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/showdowns/new">New Showdown</a> 
</body>