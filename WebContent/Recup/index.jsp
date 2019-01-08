<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Attribut</title>
<style type="text/css">
form {
	width: 500px;
	
}
label {
	font-weight: bold;
}
.form-group {
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<form action="servlet1" method="post">
		<div class="form-group">
			<label>Attribut session :</label><br />
			<input name="session" type="text" />
		</div>
		<div class="form-group">
			<label>Attribut application :</label><br />
			<input name="application" type="text" />
		</div>
		<div class="form-group">
			<label>Attribut request :</label><br />
			<input name="request" type="text" />
		</div>
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>