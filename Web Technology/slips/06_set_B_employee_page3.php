<?php
session_start();
$_SESSION['basic'] = $_POST['basic'];
$_SESSION['da'] = $_POST['da'];
$_SESSION['hra'] = $_POST['hra'];
$total = $_SESSION['basic'] + $_SESSION['da'] + $_SESSION['hra'];
echo "<h2> Employee Information </h2>";
echo "Eno:=".$_SESSION['eno']."<br>";
echo "Ename:=".$_SESSION['ename']."<br>";
echo "employee address:=".$_SESSION['address']."<br>";
echo "basic:=".$_SESSION['basic']."<br>";
echo "DA:=".$_SESSION['da']."<br>";
echo "HRA:=".$_SESSION['hra']."<br>";
echo "Total salary:=".$total."<br>";
?>


