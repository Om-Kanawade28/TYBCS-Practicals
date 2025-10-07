<?php
session_start();
$_SESSION['pname'] = $_POST['pname'];
$_SESSION['qty'] = $_POST['qty'];
$_SESSION['rate'] = $_POST['rate'];
$total = $_SESSION['qty'] * $_SESSION['rate'];
echo "<h2> Customer Information </h2>";

echo "name:=".$_SESSION['cname']."<br>";
echo "address:=".$_SESSION['cadder']."<br>";
echo "Mobile:=".$_SESSION['cmob']."<br>";
echo "product Name:=".$_SESSION['pname']."<br>";
echo "qty:=".$_SESSION['qty']."<br>";
echo "rate:=".$_SESSION['rate']."<br>";
echo "Total Bill:=".$total."<br>";

?>
