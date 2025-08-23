<?php
session_start();
$_SESSION['eno'] = $_POST['eno'];
$_SESSION['ename'] = $_POST['ename'];
$_SESSION['address'] = $_POST['address'];
?>
<html>
<head><title>Employe Form</title></head>
<body>
<h2>Enter Emplyee Information</h2>

<form action="06_set_B_employee_page3.php" method="post">
Basic:=<input type="number" name="basic" required><br>
DA:=<input type="number" name="da" required><br>
HRA:=<input type="number" name="hra" required><br>
<input type="submit" value="Next">
</form>

</body>
</html>

