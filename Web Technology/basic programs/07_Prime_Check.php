<?php
$num = 7;
$isPrime = true;

if ($num < 2) $isPrime = false;
for ($i = 2; $i <= sqrt($num); $i++) {
    if ($num % $i == 0) {
        $isPrime = false;
        break;
    }
}

echo $isPrime ? "$num is Prime" : "$num is not Prime";
?>