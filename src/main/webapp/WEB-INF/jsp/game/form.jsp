<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/games" method="post">
  
	<c:if test="${not empty game.id}">
		<input type="hidden" name="game.id" value="${game.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Number:<br />
	
		<input type="text" name="game.number" value="${game.number}"/>
	</div>
	
	<div class="field">
		Current:<br />
	
		<input type="text" name="game.current" value="${game.current}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/games">Back</a>
