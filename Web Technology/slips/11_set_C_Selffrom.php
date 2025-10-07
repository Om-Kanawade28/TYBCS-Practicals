<html>
<head><title>Self Processing From</title></head>
<body>
<h2>Customer Information</h2>

<form action="11_set_C_Selffrom.php" method="post">
Name:=<input type="text" name="name" required><br>
Age:=<input type="text" name="age" required><br>
Gender:=<input type="text" name="gender" required><br>
<input type="submit" value="Next">
</form>

</body>
</html>
<?php
if(isset($_POST['name']) && isset($_POST['age']) && isset($_POST['gender'])){
$name = $_POST['name'];
$age = $_POST['age'];
$gender = $_POST['gender'];
echo "<br>";
echo "<h3>table information</h3>";
echo "<table border = 1>";
echo "<tr><th>Name</th><th>Age</th><th>Gender</th></tr>";
echo "<tr><td>$name</td><td>$age</td><td>$gender</td></tr>";
echo "</table>";
}
//http://localhost/Kanawade_Om/Assigenment1/11_set_C_Selffrom.php
?>

