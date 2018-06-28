

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String st = (String)session.getAttribute("roll");%>
<%@include file="driver.jsp" %>
<%
    String sq="select * from course;";
    Statement s = con.createStatement();
    ResultSet r = s.executeQuery(sq);
%>
<!DOCTYPE html>

<html>
    <head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   </head>
  <body style="background-image:url(img/4.png);color: #fff;">
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome Admin</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Student
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Register Student</a></li>
          <li><a href="#">Update attendance</a></li>
          <li><a href="#">Update Marks</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Faculty
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Register Faculty</a></li>
          <li><a href="#">Add subject to faculty</a></li>
          
        </ul>
      </li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Subject
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Register Subject</a></li>
          <li><a href="#">Update Syllabus</a></li>
         
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <!--li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li-->
      <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
      </nav>    
      
      
     
  <div class="container-fluid">
      <h1>Student Information</h1>
      <table class="table">
          <tr>
              <th>Course Name</th>
              <th>Duration</th>
              
          </tr>
          <%while(r.next()){%>
          <tr>
              <td><%=r.getString("cname")%></td>
              <td><%=r.getString("duration")+" Years"%></td>
              
          </tr>
          <%}%>
      </table>
      <!--h2>Delete Student detail</h2>
      <form class="form-horizontal" action="DeleteStudent" method="POST">
              <div class="form-group">
                <label class="control-label col-sm-2">Roll No.:</label>
                <div class="col-sm-4">
                  <input type="text" class="form-control" name="roll">
                </div>
              </div>
               
              <div class="form-group">        
                <div class="col-sm-offset-2 col-sm-10">
                  <button type="submit" class="btn btn-default">Submit</button>
                </div>
              </div>
            </form-->
           </div>
  </div>
  
  
  
  
  
  
  </body>
</html>
