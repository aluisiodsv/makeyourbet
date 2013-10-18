<head>
	<title>User [show]</title>
</head>
<body>
	<p>
		<b>Name:</b>
		${user.name}
	</p>
	<p>
		<b>Admin:</b>
		${user.admin}
	</p>

	<a href="${pageContext.request.contextPath}/users/${user.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/users">Back</a>
</body>