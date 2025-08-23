<?php
if(isset($_POST['num1']) && isset($_POST['num2']) && isset($_POST['oper'])){
$num1 = $_POST['num1'];
$num2 = $_POST['num2'];
$operation = $_POST['oper'];
//echo $operation;
switch($operation){
case "add":
        $sum = $num1 + $num2;
        echo "Addition:=".$sum;
        break;
case "sub":
        $sub = $num1 - $num2;
        echo "Subtraction:=".$sub;
        break;
case "mul":
        $mul = $num1 * $num2;
        echo "Multipication:=".$mul;
        break;
case "div":
        $div = $num1 / $num2;
        echo "Division:=".$div;
        break;


}



}

?>
