<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taco Loco</title>
</head>
<body>
<h1>Welcome to Taco Loco</h1>

<h3>Please Order Here:</h3>
<script>
function check() {
    if(document.forms["order_form"]["veggieTaco"].value == "")
        document.forms["order_form"]["veggieTaco"].value = 0;
    
    if(document.forms["order_form"]["chickenTaco"].value == "")
        document.forms["order_form"]["chickenTaco"].value = 0;
    
    if(document.forms["order_form"]["beefTaco"].value == "")
        document.forms["order_form"]["beefTaco"].value = 0;
    
    if(document.forms["order_form"]["chorizoTaco"].value == "")
        document.forms["order_form"]["chorizoTaco"].value = 0;
}
</script>

<form name="order_form" action="/receipt" onsubmit="check()" method="post">
  Veggie Taco:<nbsp>
  <input type="number" name="veggieTaco" placeholder=0 value=0 ><br>
  Chicken Taco:<nbsp>
  <input type="number" name="chickenTaco" placeholder=0 value=0 ><br>
  Beef Taco:<nbsp>
  <input type="number" name="beefTaco" placeholder=0 value=0 ><br>
  Chorizo Taco:<nbsp>
  <input type="number" name="chorizoTaco" placeholder=0 value=0 ><br>
  <input type="submit" value="Checkout">
</form>

</body>
</html>