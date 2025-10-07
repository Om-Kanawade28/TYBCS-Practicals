<?php
session_start();

if(isset($_SESSION["count"])){
  //$_SESSION["count"] = 0;
  $count_vs = $_SESSION["count"] + 1;
  //$count_vs = 0;

}else{
    $count_vs = 1;
}
$_SESSION["count"]=$count_vs;
//$_SESSION["count"]++;

if(isset($_COOKIE["v_count"])){
  $count_v = $_COOKIE["v_count"] + 1;

 }else{
    $count_v = 1;
 }
setcookie("v_count",$count_v);
//setcookie("v_count",$count_v,time() + 0);
echo "session count:=".$count_vs;
echo "Cokies count:=".$count_v;





?>

