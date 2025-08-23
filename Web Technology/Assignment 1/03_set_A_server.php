<?php
echo "Client ip address:".$_SERVER['REMOTE_ADDR']."<br>";
echo "Browser Type:".$_SERVER['HTTP_USER_AGENT']."<br>";
echo "Host Name:".gethostbyaddr($_SERVER['REMOTE_ADDR'])."<br>";
echo "Request URI:".$_SERVER['REQUEST_URI']."<br>";
echo "Referring Page:".($_SERVER['HTTP_REFERER']??'no')."<br>";
?>
