<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>convert</title>
</head>
<body>
    <div id="resp"></div>
    <input type="button" onclick="req();" value="请求"/>
<script src="assets/js/jquery-3.3.1.js"></script>
<script>
    function req() {
        $.ajax({
            url:"convert",
            data:"530-panzx",
            type:"POST",
            contentType:"application/x-wisely",
            success: function (data) {
                $("#resp").html(data);
            }
        });
    }
</script>
</body>
</html>