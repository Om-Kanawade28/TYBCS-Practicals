<?php
$admin = "admin123";
$password ="12345";
session_start();
if(!isset($_SESSION['attempts'])){
    $_SESSION['attempts']=0;
}
if(isset($_GET['user']) && isset($_GET['password'])){
    $cadmin = $_GET['user'];
    $cpassword = $_GET['password'];
    if($admin == $cadmin && $password==$cpassword){
        echo "<h2>welcome</h2>";
        session_destroy();
    }else{
        $_SESSION['attempts']++;
        if($_SESSION['attempts']>=3){
            echo"so many atempts";
            exit();
        }else{
            echo "you attempts ".$_SESSION['attempts']." of 3";
        
        }
    }

}
?>