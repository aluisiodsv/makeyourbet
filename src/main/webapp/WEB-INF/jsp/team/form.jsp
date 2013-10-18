<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/teams" method="post">
  
	<c:if test="${not empty team.id}">
		<input type="hidden" name="team.id" value="${team.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Name:<br />
	
		<input type="text" name="team.name" value="${team.name}"/>
	</div>
	
	<div class="field">
		Logo:<br />
	
		<input type="text" name="team.logo" value="${team.logo}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/teams">Back</a>
