<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/6
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>merchandise</title>
    <script type="text/javascript">
        function api_test() {
            var xmlhttp;
            if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp = new XMLHttpRequest();
            }
            else {// code for IE6, IE5
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            xmlhttp.onreadystatechange = function () {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                    document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
                }
            }
            xmlhttp.open("GET", "/merchandise/merchandises", true);
            xmlhttp.send();
        }
    </script>

</head>
<body>
<div id="myDiv"/>
<button id="api_test" name="api_test" onclick="api_test()"  type="submit">test_api</button>
</body>
</html>
