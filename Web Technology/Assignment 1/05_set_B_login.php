<?php
session_start();
$valid_username="admin";
$valid_password="1234";
if(!isset($_SESSION['attempts'])){
$_SESSION['attempts']=0;
}
if(isset($_POST['username']) && isset($_POST['password'])){
$username = $_POST['username'];
$password = $_POST['password'];
if($username === $valid_username && $password === $valid_password){
echo "<h2> Welcome $username</h2>";
session_destroy();
exit;
}else{
$_SESSION['attempts']++;
if($_SESSION['attempts'] >= 3){
echo "<h3>To Many Attempts</h3>";
session_destroy();
exit();
}else{
echo "<h3> you used chance ".$_SESSION['attempts']."of 3 so ty again";
}
}
}

?>
