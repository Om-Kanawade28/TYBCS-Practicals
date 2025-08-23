<!DOCTYPE html>
<html>
<head>
    <title>Simple Image Upload</title>
</head>
<body>

<h2>Select an Image to Upload</h2>

<form method="POST" enctype="multipart/form-data">
    <input type="file" name="image" required><br><br>
    <input type="submit" value="Upload">
</form>

<?php
if (isset($_FILES['image'])) {
    $image = $_FILES['image'];
    $imageName = $image['name'];
    $tempPath = $image['tmp_name'];

    // Save in the same folder or in a folder like "uploads/"
    move_uploaded_file($tempPath, $imageName);

    // Display the image
    echo "<h3>Uploaded Image:</h3>";
    echo "<img src='$imageName' style='max-width:300px;'>";
}
?>

</body>
</html>

