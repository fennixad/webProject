<%@ page isELIgnored="false" language="java"
contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <h3>Bienvenido, introduzca los detalles del usuario</h3>
        <form class="w-75" action="user/addUser" method="POST" modelAttribute="user">

<label for="exampleFormControlInput2" class="form-label">User</label>
<input type="text" class="form-control" name="user" placeholder="${User}">

<label for="exampleFormControlInput4" class="form-label">id</label>
<input type="number" class="form-control" name="id" placeholder="${id}">

<label for="exampleFormControlInput4" class="form-label">Enabled</label>
<input type="number" class="form-control" name="enabled" placeholder="${enabled}">

<label for="exampleFormControlInput3" class="form-label">Password</label>
<input type="password" class="form-control" name="password" placeholder="${Password}"/>

<label for="exampleFormControlInput4" class="form-label">Rol</label>
<input type="number" class="form-control" name="rol" placeholder="${Rol}">

<button type="submit" value="Submit" class="btn btn-primary">Primary</button>
</form>
    </body>
</html>