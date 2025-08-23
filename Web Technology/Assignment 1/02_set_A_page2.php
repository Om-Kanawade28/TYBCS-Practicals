<?php
$f_style = $_GET['font_style'];
$f_size = $_GET['font_size'];
$f_color = $_GET['font_color'];
$b_color = $_GET['back_color'];
setcookie("f_style",$f_style);
setcookie("f_size",$f_size);
setcookie("f_color",$f_color);
setcookie("b_color",$b_color);

echo "\nfont style:=".$f_style."<br>";
echo "\nfont size:=".$f_size."<br>";

echo "\nfont color:=".$f_color."<br>";
echo "background color:=".$b_color."<br>";

?>
