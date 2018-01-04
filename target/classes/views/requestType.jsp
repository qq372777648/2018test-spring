<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HttpMessageConverter Demo</title>
</head>
<body>
    <input type="button" onclick="req1();" value="urlParam"/>
    <input type="button" onclick="req2();" value="requestBody"/>
    <input type="button" onclick="req3();" value="postJson"/>
<script src="assets/js/jquery.js" type="text/javascript"></script>
<script>
    function req1(){
        $.ajax({
            url: "urlParam?a=1&b=2",
            type:"GET",
            contentType:"application/json", //2
            success: function(data){
               console.log(data);
            }
        });
    }
    
    function req2(){
    	
    	console.log(JSON.stringify({a:1,b:2222})=='{"a":1,"b":2222}')
    	
        $.ajax({
            url: "requestBody",
            data: '{"a":1,"b":2232}', //key 必须加引号
            type:"POST",//must be post
            contentType:"application/json", //
           // dataType:"text/plain", // 能返回但jquery 解析错误，进入error
            success: function(data){
            	 console.log(data);
            },
            error:function(data){
            	 console.log(data);
                },
                beforeSend:function(){},
                complete:function(){console.log("完成");}
        });
    }
    
    function req3(){
        $.ajax({
            url: "postJson",
            dataType : 'json',
            data: {a:111,b:222}, //1
            type:"GET",
            contentType:"application/json", //2
            success: function(data){
            	 console.log(data);
            }
        });
    }

</script>
</body>
</html>