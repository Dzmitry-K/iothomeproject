<jsp:include page="header.jsp"/>

<table class="table">
  <thead class="thead-light">
  <tr>
    <th scope="col">ID</th>
    <th scope="col">Date</th>
    <th scope="col">Value</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${items}">
    <tr>
      <th scope="row">${item.id}</th>
      <td>${item.date}</td>
      <td>${item.value}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>


<jsp:include page="footer.jsp"/>