<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="/CSS/css.css">
</head>
<body>
<h1><%= "Hello!" %>
</h1>
<br/>
<h2>请根据不同选项框来进行选择</h2>
<br>
<ul>
    <li>
        <a href="res?type=html">点击返回HTML</a>
    </li>
    <li>
        <a href="res?type=json">点击返回json</a>
    </li>
    <li>
        <a href="res?type=img">点击返回图片</a>
    </li>
</ul>
</body>
</html>