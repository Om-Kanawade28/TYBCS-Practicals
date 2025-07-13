<?php
file_put_contents("data.txt", "This is a test file.");
$content = file_get_contents("data.txt");
echo $content;
?>