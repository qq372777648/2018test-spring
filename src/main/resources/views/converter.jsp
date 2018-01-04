<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HttpMessageConverter Demo</title>
</head>
<body>
    <div id="resp"></div><input type="button" onclick="req();" value="请求"/>
<script src="assets/js/jquery.js" type="text/javascript"></script>
<script>
    function req(){
        $.ajax({
            url: "convert",
            data: "2-springboot", //1
            type:"POST",
            contentType:"application/class", //2 要求服务器返回的媒体类型  、默认: application/x-www-form-urlencoded; charset=UTF-8 
            //dataType:"application/class", //本地把服务器的返回以什么类型解析、默认： jquery根据返回类型自动适配
            success: function(data){
            	console.log(data)
                $("#resp").html(data);
            }
        });
    }

</script>
</body>
</html>