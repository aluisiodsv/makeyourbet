<head>
	<title>Game [show]</title>
</head>
<body>
	<p>
		<b>Number:</b>
		${game.number}
	</p>
	<p>
		<b>Current:</b>
		${game.current}
	</p>

	<a href="${pageContext.request.contextPath}/games/${game.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/games">Back</a>
</body>