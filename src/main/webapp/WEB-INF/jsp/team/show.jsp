<head>
	<title>Team [show]</title>
</head>
<body>
	<p>
		<b>Name:</b>
		${team.name}
	</p>
	<p>
		<b>Logo:</b>
		${team.logo}
	</p>

	<a href="${pageContext.request.contextPath}/teams/${team.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/teams">Back</a>
</body>