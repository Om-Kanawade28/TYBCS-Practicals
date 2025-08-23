<?php
$f_style = $_COOKIE['f_style'];
$f_size = $_COOKIE['f_size'];
$f_color = $_COOKIE['f_color'];
$b_color = $_COOKIE['b_color'];
//echo "\nfont style:=".$f_style."<br>";
//echo "\nfont size:=".$f_size."<br>";

//echo "\nfont color:=".$f_color."<br>";
//echo "background color:=".$b_color."<br>";



?>
<html>
<head><title>Styled page</title></head>
<body style="font-family:<?=$f_style?>; font-size:<?=$f_size?>px;color:<?=$f_color?>;background-color:<?=$b_color?>">
 <h1> Welcome in program</h1>
 <p> copy paste ,copy paste karo</p>
</body>
</html>

