<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/bets" method="post">
  
	<c:if test="${not empty bet.id}">
		<input type="hidden" name="bet.id" value="${bet.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		User:<br />
		<select name="bet.user.id">
		  <c:forEach var="user" items="${userList}">
		    <option value="${user.id}" <c:if test = "${bet.user.id == user.id}">selected="true"</c:if>>
		      ${user.name}
			</option>
		  </c:forEach>
		</select>
	</div>
	
	<div class="field">
		Showdown:<br />
		<select name="bet.showdown.id">
		  <c:forEach var="showdown" items="${showdownList}">
		    <option value="${showdown.id}" <c:if test = "${bet.showdown.id == showdown.id}">selected="true"</c:if>>
		      ${showdown.team1.name} x ${showdown.team2.name}
			</option>
		  </c:forEach>
		</select>
	</div>
	
	<div class="field">
		Result1:<br />
	
		<input type="text" name="bet.result1" value="${bet.result1}"/>
	</div>
	
	<div class="field">
		Result2:<br />
	
		<input type="text" name="bet.result2" value="${bet.result2}"/>
	</div>
	
	<div class="field">
		Game:<br />
		<select name="bet.game.id">
		  <c:forEach var="game" items="${gameList}">
		    <option value="${game.id}" <c:if test = "${bet.game.id == game.id}">selected="true"</c:if>>
		      ${game.number}
			</option>
		  </c:forEach>
		</select>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/bets">Back</a>
