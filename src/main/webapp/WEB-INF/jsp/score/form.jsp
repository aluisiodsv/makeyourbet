<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/scores" method="post">
  
	<c:if test="${not empty score.id}">
		<input type="hidden" name="score.id" value="${score.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Showdown:<br />
		<select name="score.showdown.id">
		  <c:forEach var="showdown" items="${showdownList}">
		    <option value="${showdown.id}" <c:if test = "${score.showdown.id == showdown.id}">selected="true"</c:if>>
		      ${showdown.team1.name} x ${showdown.team2.name}
			</option>
		  </c:forEach>
		</select>
	</div>
	
	<div class="field">
		Result1:<br />
	
		<input type="text" name="score.result1" value="${score.result1}"/>
	</div>
	
	<div class="field">
		Result2:<br />
	
		<input type="text" name="score.result2" value="${score.result2}"/>
	</div>
	
	<div class="field">
		Game:<br />
		<select name="score.game.id">
		  <c:forEach var="game" items="${gameList}">
		    <option value="${game.id}" <c:if test = "${score.game.id == game.id}">selected="true"</c:if>>
		      ${game.number}
			</option>
		  </c:forEach>
		</select>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/scores">Back</a>
