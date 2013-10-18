<head>
	<title>Bet [show]</title>
</head>
<body>
	<p>
		<b>User:</b>
		${bet.user}
	</p>
	<p>
		<b>Showdown:</b>
		${bet.showdown}
	</p>
	<p>
		<b>Result1:</b>
		${bet.result1}
	</p>
	<p>
		<b>Result2:</b>
		${bet.result2}
	</p>
	<p>
		<b>Game:</b>
		${bet.game}
	</p>

	<a href="${pageContext.request.contextPath}/bets/${bet.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/bets">Back</a>
</body>