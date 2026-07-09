<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Book Store</title>
</head>
<body>

<h2>Add Book</h2>

<form action="addBook" method="post" onsubmit="return validate()">
    Title: <input type="text" id="title" name="title"><br><br>
    Author: <input type="text" id="author" name="author"><br><br>
    Price: <input type="text" id="price" name="price"><br><br>

    <input type="submit" value="Add Book">
</form>

<script>
function validate() {
    let title = document.getElementById("title").value;
    let price = document.getElementById("price").value;

    if (title == "" || price == "") {
        alert("All fields required!");
        return false;
    }

    if (isNaN(price)) {
        alert("Price must be number!");
        return false;
    }

    return true;
}
</script>

</body>
</html>