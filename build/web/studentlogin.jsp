

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%! Connection con; %>
<% String st = (String)session.getAttribute("roll");
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
   Statement s1 = con.createStatement();
   Statement s2 = con.createStatement();
   Statement s3 = con.createStatement();
   Statement s4 = con.createStatement();
   ResultSet r1 = s1.executeQuery("select * from notice;");
   ResultSet r2 = s2.executeQuery("select * from student where roll like "+st+";");
   ResultSet r3 = s3.executeQuery("select * from marks where roll like "+st+";");
   ResultSet r4 = s4.executeQuery("select sname, att, total from attendance where roll like "+st+";");
   r2.next();
%>
<!DOCTYPE html>
<html>
<head>
<title>SIS</title>
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
<body style="background-image:url(img/4.png);color: #fff;">


<div class="container-fluid">
    <div class="row"><div class="col-sm-9">
    <h1 class="text-center">Welcome <%=r2.getString("fname")%></h1>
    </div>
    <div class="col-sm-3">
        <div style="padding: 45px;" align="right">
    <a href="logout.jsp">
    <button class="btn btn-warning" align="right">Log Out</button></a>
    </div>
    </div>
    </div>

  <div class="row">								
    <div class="col-sm-3">
        <div class="row" style="padding: 10px;">
           <button class="btn btn-warning btn-block" href="#a" onclick="M1()" >HOME</button>
        </div>
        <div class="row" style="padding: 10px;">
           <button class="btn btn-warning btn-block" href="#b" onclick="M2()">Syllabus and Timetable</button>
        </div>
        <div class="row" style="padding: 10px;">
           <button class="btn btn-warning btn-block" href="#c" onclick="M3()">Result</button>
        </div>
        <div class="row" style="padding: 10px;">
           <button class="btn btn-warning btn-block" href="#e" onclick="M5()">Attendance</button>
        </div>
        <div class="row" style="padding: 10px;">
           <button class="btn btn-warning btn-block" href="#d" onclick="M4()">Services</button>
        </div>
	</div>
	<div class="col-sm-9 ">
	    
            <div  id="a" style="display:block">
                <% while(r1.next()){%>
                <div class="row-fluid">
                    
                    <h2 class="text-center"><%= r1.getString("heading") %></h2>
                    <p class=""><%= r1.getString("data") %></p>
                    <hr align="center" width="10%" height="50px">
                </div>
                <% }%>
            </div>	
            
            
            <div  id="b"style="display:none">
                <form class="form-horizontal" action="DownloadSyllabus">
              <div class="form-group">
                <label class="control-label col-sm-2">Semester:</label>
                <div class="col-sm-10">
                  <input type="number" class="form-control" name="sem" >
                </div>
              </div>
           
              <div class="form-group">
                <label class="control-label col-sm-2">Course:</label>
                <div class="col-sm-10">
                    <select class="form-control" name="course">
                        <option value="MTech">Mtech</option>
                        <option value="MCA">MCA</option>
                        <option value="MBA">MBA</option>
                    </select>
                </div>
              </div>
                    
              
              <div class="form-group">        
                <div class="col-sm-offset-2 col-sm-10">
                  <button type="submit" class="btn btn-default">Download Syllabus</button>
                </div>
              </div>
            </form>
            </div>
            
            
            
            
            <div  id="c" style="display:none">
                <div class="col-sm-6">
                <table class="table">
                    <tr>
                    <th>Subject</th>
                    <th>Marks</th>
                    </tr>
                    <%while(r3.next()){%>
                    <tr>
                        <th><%= r3.getString("sname") %></th>
                        <th><%= r3.getInt("marks") %></th>
                    </tr>
                    <% }%>   
                </table>
                </div>
            </div>
                <div  id="e" style="display:none">
                    <div class="col-sm-6">
                        <table class="table">
                            <tr>
                                <th>Subject</th>
                                <th>Total Classes Attended</th>
                                <th>Total Classes</th>
                            </tr>
                            <% while(r4.next()){%>
                            <tr>
                                <td><%= r4.getString("sname")%></td>
                                <td><%= r4.getInt("att")%></td>
                                <td><%= r4.getInt("total")%></td>
                            </tr>
                            <% }%>
                        </table>
                    </div>   
                </div>
        <div  id="d" style="display:none">
            <div class="row">
                    <div class="col-sm-6" align="center">
                        <H2 class="text-center">PAY SEM FEES</h2>
                        <a href="https://davv.mponline.gov.in/portal/Services/DAVV/UTD_APP/semfee/semfeesubmission.aspx"><button class="btn btn-primary">CLICK HERE</button></a>
                    </div>
                <div class="col-sm-6" align="center">
                        <H2 class="text-center">STUDENT FEEDBACK</h2>
                        <a align="center" href="https://davv.mponline.gov.in/Portal/Services/DAVV/UTD_APP/UTDComn/FeedBack/FeedBackForm.aspx"><button class="btn btn-primary">CLICK HERE</button></a>
                </div>
                </div>
        </div>	
	</div>
  </div>
  
</div>
<script >
var x = document.getElementById('a');
var y = document.getElementById('b');
var z = document.getElementById('c');
var w = document.getElementById('d');
var v = document.getElementById('e');
 function M1() {
    
    if (x.style.display === 'none') {
        x.style.display = 'block';
		y.style.display = 'none';
		z.style.display = 'none';
		w.style.display = 'none';
                v.style.display = 'none';
                
    } else {
        x.style.display = 'none';
    }
}

function M2() {
    
    if (y.style.display === 'none') {
        x.style.display = 'none';
		y.style.display = 'block';
		z.style.display = 'none';
		w.style.display = 'none';
                v.style.display = 'none';
    } else {
        y.style.display = 'none';
    }
}

function M3() {
    
    if (z.style.display === 'none') {
        z.style.display = 'block';
		y.style.display = 'none';
		x.style.display = 'none';
		w.style.display = 'none';
                v.style.display = 'none';
    } else {
        z.style.display = 'none';
    }
}

function M4() {
    if (w.style.display === 'none') {
        w.style.display = 'block';
		y.style.display = 'none';
		z.style.display = 'none';
		x.style.display = 'none';
                v.style.display = 'none';
    } else {
        w.style.display = 'none';
    }
}
function M5() {
    if (v.style.display === 'none') {
        v.style.display = 'block';
		y.style.display = 'none';
		z.style.display = 'none';
		x.style.display = 'none';
                w.style.display = 'none';
                
    } else {
        v.style.display = 'none';
    }
}

</script>


</body>
</html>