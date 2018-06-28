

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String st = (String)session.getAttribute("roll");%>
<!DOCTYPE html>

<html>
    <head>
  <title>SIS</title>
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
      <li class="active"><a href="AdminHome.jsp">Home</a></li>
      <li><a href="viewcourse.jsp">View Course</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Student
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="StudentRigistration.jsp">Register Student</a></li>
          <li><a href="attendence.jsp">Update attendance</a></li>
          <li><a href="marks.jsp">Update Marks</a></li>
          <li><a href="ViewStudent.jsp">View and delete Student Details</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Faculty
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="faculty.jsp">Register Faculty</a></li>
          <li><a href="sub-fac.jsp">Add subject to faculty</a></li>
          <li><a href="viewfaculty.jsp">View and delete faculty</a></li>
          
        </ul>
      </li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Subject
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Subject.jsp">Register Subject</a></li>
          <li><a href="syllabus.jsp">Update Syllabus</a></li>
          <li><a href="viewsubject.jsp">View and delete Subject</a></li>
         
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
      <h2>Add notice</h2>
            <div class="col-sm-9">
                <form class="form-horizontal" action="AddNotice1" method="POST">
              <div class="form-group">
                <label class="control-label col-sm-2">Subject for notice</label>
                <div class="col-sm-10">
                  <textarea  class="form-control" name="heading"></textarea>
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-sm-2">Information:</label>
                <div class="col-sm-10">
                  <textarea rows="4" class="form-control" name="data" ></textarea>
                </div>
              </div>
              
              <div class="form-group">        
                <div class="col-sm-offset-2 col-sm-10">
                  <button type="submit" class="btn btn-default">Submit</button>
                </div>
              </div>
            </form>
           </div>
  </div>
  
  
  
  
  
  
  </body>
</html>
