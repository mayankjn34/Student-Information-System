<%-- 
    Document   : student_login_reg
    Created on : 15 Apr, 2017, 9:32:51 PM
    Author     : Mayank Jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="driver.jsp" %>
<%    String sql = "select roll from student;";
      Statement s = con.createStatement();
      ResultSet r = s.executeQuery(sql);
      
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 <script src="js/jquery.min.js"></script>

<!-- grid-slider -->
<script type="text/javascript" src="js/jquery.mousewheel.js"></script>
<script type="text/javascript" src="js/jquery.contentcarousel.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<!-- //grid-slider -->
<link href="style.css" type="text/css" rel="stylesheet">
    </head>
    <body style="background-image:url(img/4.png);color: #fff ">
    
    
        <div class="container">
            <h2>Student Registration</h2>
            <div class="col-sm-6" ALIGN="CENTER">
            <form class="form-horizontal" action="SaveStudentReg" method="POST">
              <div class="form-group">
                  <label class="control-label col-sm-2"  >Roll No.:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="roll" id="ro" onfocusout = "my()" required>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-sm-2">Password:</label>
                <div class="col-sm-10">
                  <input type="password" class="form-control" name="pwd" required>
                </div>
              </div>          
              <div class="form-group">        
                <div class="col-sm-offset-2 col-sm-10">
                  <button id="submit" type="submit" class="btn btn-default">Submit</button>
                </div>
              </div>
            </form>
                </div>
        </div>
        <script>
          
             function my(){
                 var x = document.getElementById("ro");
                  x.value = x.value.toUpperCase();
                 alert("sdada");
              while(r.next()){
                  if(r.getString("roll") !== request.getParameter("roll"))){
                      document.getElementById("submit").disabled = true;
                      
                  }
              }
          }
          
        </script>
    </body>

</html>
