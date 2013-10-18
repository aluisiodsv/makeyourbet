<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/showdowns" method="post">
  
	<c:if test="${not empty showdown.id}">
		<input type="hidden" name="showdown.id" value="${showdown.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Team1:<br />
		<select name="showdown.team1.id">
		  <c:forEach var="team1" items="${teamList}">
		    <option value="${team1.id}" <c:if test = "${showdown.team1.id == team1.id}">selected="true"</c:if>>
		      ${team1.name}
			</option>
		  </c:forEach>
		</select>
	</div>
	
	<div class="field">
		Team2:<br />
		<select name="showdown.team2.id">
		  <c:forEach var="team2" items="${teamList}">
		    <option value="${team2.id}" <c:if test = "${showdown.team2.id == team2.id}">selected="true"</c:if>>
		      ${team2.name}
			</option>
		  </c:forEach>
		</select>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/showdowns">Back</a>
