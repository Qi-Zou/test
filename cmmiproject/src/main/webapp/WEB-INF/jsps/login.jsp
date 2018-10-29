<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23/023
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
    <link rel="stylesheet" href="/resources/frame/layui/css/layui.css">
    <link rel="stylesheet" href="/resources/frame/static/css/style.css">
    <link rel="icon" href="/resources/frame/static/image/code.png">
</head>
<body class="login-body body">

<div class="login-box">
    <form class="layui-form layui-form-pane" method="post" action="login">
        <div class="layui-form-item">
            <h3>登录</h3>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">工号：</label>

            <div class="layui-input-inline">
                <input type="text" name="jobNumber" class="layui-input" lay-verify="account" placeholder="工号"
                       autocomplete="on" maxlength="20"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>

            <div class="layui-input-inline">
                <input type="password" name="password" class="layui-input" lay-verify="password" placeholder="密码"
                       maxlength="20"/>
            </div>
        </div>

        <div class="layui-form-item">
            <button type="reset" class="layui-btn layui-btn-danger btn-reset">重置</button>
            <input type="submit" class="layui-btn btn-submit" lay-submit="" lay-filter="sub" value="立即登录"/>
        </div>
    </form>
</div>

<script type="text/javascript" src="/resources/frame/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['form', 'layer'], function () {

        // 操作对象
        var form = layui.form
            , layer = layui.layer
            , $ = layui.jquery;

        // 验证
        form.verify({
            account: function (value) {
                if (value == "") {
                    return "请输入工号";
                }
            },
            password: function (value) {
                if (value == "") {
                    return "请输入密码";
                }
            }
        });

        // form.on('submit(sub)',function (){
        //     return true;
        // });
        // 提交监听
        // form.on('submit(sub)', function (data) {
        //     layer.alert(JSON.stringify(data.field), {
        //         title: '最终的提交信息'
        //     });
        //     return false;
        // });

        // you code ...
    })

</script>
</body>
</html>
