<head>
	<title>Score [show]</title>
</head>
<body>
	<p>
		<b>Showdown:</b>
		${score.showdown}
	</p>
	<p>
		<b>Result1:</b>
		${score.result1}
	</p>
	<p>
		<b>Result2:</b>
		${score.result2}
	</p>
	<p>
		<b>Game:</b>
		${score.game}
	</p>

	<a href="${pageContext.request.contextPath}/scores/${score.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/scores">Back</a>
</body>