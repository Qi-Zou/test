<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25/025
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>需求分析</title>
    <link rel="stylesheet" href="/resources/frame/layui/css/layui.css">
    <link rel="stylesheet" href="/resources/frame/static/css/style.css">
    <link rel="icon" href="/resources/frame/static/image/code.png">
</head>
<body class="body">
<form class="layui-form" action="../RequirementAnalysis/fileUpload" enctype="multipart/form-data" method="post">
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">问题分析</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea" name="question_analysis"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">分析文档</label>
        <input id="file" type="file" name="file"/>
    </div>
    <div class="layui-input-block">
        <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
    </div>
</form>
<script src="/resources/frame/layui/layui.js" charset="utf-8"></script>
<script>
    window.onload = function(){
        alert(${message})
        <%--if("success" == ${message}) {--%>
            <%--alert("上传成功");--%>
        <%--}else{--%>
            <%--alert("上传失败");--%>
        <%--}--%>
    };


    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;


        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //监听提交
        form.on('submit(demo1)', function(data){

            if(window.confirm("确认提交？")){
                return true;
            }else{
                return false;
            }
        });


    });

</script>


</body>

</html>