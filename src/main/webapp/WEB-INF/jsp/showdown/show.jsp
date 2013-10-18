<head>
	<title>Showdown [show]</title>
</head>
<body>
	<p>
		<b>Team1:</b>
		${showdown.team1}
	</p>
	<p>
		<b>Team2:</b>
		${showdown.team2}
	</p>

	<a href="${pageContext.request.contextPath}/showdowns/${showdown.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/showdowns">Back</a>
</body>