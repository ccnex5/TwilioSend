<html>
  <script type="text/javascript">
      function test(){
    	  var testform=document.getElementById("testform");
    	  testform.action="MobileServlet";
    	  testform.method = "post";
    	  testform.submit();
    	  alert('message sent');
      }
  </script>
<body onload = "test()">
  <form id="testform">
    <!-- <a href= "#" onclick="test()">click me</a>
     -->   
  </form>
</body>
</html>
