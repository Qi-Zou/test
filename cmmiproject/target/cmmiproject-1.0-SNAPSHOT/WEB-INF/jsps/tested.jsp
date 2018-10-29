<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25/025
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>测试</title>
    <link rel="stylesheet" href="/resources/frame/layui/css/layui.css">
    <link rel="stylesheet" href="/resources/frame/static/css/style.css">
    <link rel="icon" href="/resources/frame/static/image/code.png">
</head>
<body class="body" >
<form class="layui-form" action="">
    <!-- <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">测试说明</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea" name="question_analysis"></textarea>
        </div>
    </div> -->
    <div class="layui-form-item">
        <label class="layui-form-label">测试报告</label>
        <input id="file" type="file" name="file"/>

    </div>
    <div class="layui-input-block">
        <input class="layui-btn" type="submit" value="提交">
    </div>
</form>

</body>
</html>

