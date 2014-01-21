
<%@ attribute name="id" required="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<input id="${id}" name="${id}" />
	<script>
  		$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
	</script>
</body>
</html>