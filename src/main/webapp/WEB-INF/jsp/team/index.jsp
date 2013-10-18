<head>
	<title>Team [index]</title>
</head>
<body>
	<h1>Listing Teams</h1>

	<table>
		<tr>
			<th>Name</th>
			<th>Logo</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${teamList}" var="team">
			<tr>
				<td>${team.name}</td>
				<td>${team.logo}</td>
				<td><a href="${pageContext.request.contextPath}/teams/${team.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/teams/${team.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/teams/${team.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/teams/new">New Team</a> 
</body>