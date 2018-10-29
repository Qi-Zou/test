<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25/025
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>详细设计</title>
    <link rel="stylesheet" href="/resources/frame/layui/css/layui.css">
    <link rel="stylesheet" href="/resources/frame/static/css/style.css">
    <link rel="icon" href="/resources/frame/static/image/code.png">
</head>
<body class="body" >
<form class="layui-form" action="fileUpload"  enctype="multipart/form-data" method="post">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>概要设计文档下载</legend>
    </fieldset>
    <div class="layui-input-block">
        <c:forEach items="${fileList}" var="file">
            <p><a href="fileDown?fileName=${file.fileUrl}">${file.fileUrl}..............点击下载</a> </p>
        </c:forEach>
        <%--<p>**概要设计文档一<a href="#">..............点击下载</a></p>--%>
        <%--<p>**概要设计文档二<a href="#">..............点击下载</a></p>--%>
        <%--<p>**概要设计文档三<a href="#">..............点击下载</a></p>--%>
    </div>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>文件说明</legend>
    </fieldset>
    <div class="layui-form-item layui-form-text">
        <ul class="layui-input-block">
            <c:forEach items="${fileList}" var="file">
                <li>${file.fileUrl}:</li><p style="padding-left: 80px;">${file.fileExplain}</p><br>
            </c:forEach>
        </ul>
    </div>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>详细设计文档撰写并上传</legend>
    </fieldset>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">说明</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea" name="analysis"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">详细设计</label>
        <input id="file" type="file" name="file"/>

    </div>
    <div class="layui-input-block">
        <input class="layui-btn" type="submit" value="提交">
    </div>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>反馈信息显示</legend>
    </fieldset>
    <label class="layui-input-block">暂无任何反馈信息</label>
    <hr>

</form>

</body>
</html>