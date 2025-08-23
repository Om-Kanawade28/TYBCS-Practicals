<?php
session_start();
$_SESSION['cname'] = $_POST['cname'];
$_SESSION['cadder'] = $_POST['caddr'];
$_SESSION['cmob'] = $_POST['cmob'];

?>

<html>
<head><title>Product  Information</title></head>
<body>
<h2>Product Information</h2>

<form action="09_set_C_Customer_Bill.php" method="post">
Name:=<input type="text" name="pname" required><br>
Qty:=<input type="number" name="qty" required><br>
Rate:=<input type="number" name="rate" required><br>
<input type="submit" value="Next">
</form>

</body>
</html>
