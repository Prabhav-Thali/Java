<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>  
<%@ page import="java.util.*" %>    
<%@ page session="true" %>    


<head>
  
    
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

<link href="css/font-awesome.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
  $('tr button').click(function(){
	  
	  var id = $(this).parent().parent().children(":first").text();
	  
	//  alert(id);
	
	   $.ajax(
				{
					type:"GET",
							url:"delete_booking.jsp",
							data:{loc:id},
										
						
							 
							success:function()
							{
								//alert('hi');
								
								 location.reload();
								
								/* for(var i=0;i<data.length;i++)
									{
									alert(data[i]);
									$("#roomid").append("<option>"+data[i]+"</option>");
									} */
				 		
						},
						error:function(data,status,error)
						{
							//alert(data[1]);
							alert("Error occured in ajax"+error+":"+status);
						}
					
				}); 
	 
	 
	  
	  
	  
	
	  
	  
  });
  
  
  
  
	
	
	
	
	
	
});




</script>




</head>
    
    
    
<body>
	
	<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		<div class="left">
				<img alt="" src="PSLLogo.jpg" width="70px" height="70px">
		
		</div>
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			
			<a class="brand" href="adminUser.jsp">
				Room Booking Calendar				
			</a>		
			
			<div class="nav-collapse">
				<ul class="nav pull-right">
					
					<li class="">						
						<a href="applicationUser.jsp" class="">
							<i class="icon-chevron-left"></i>
							Back to Homepage
						</a>
						
					</li>
				</ul>
				
			</div><!--/.nav-collapse -->	
	
		</div> <!-- /container -->
		<div class="right">
		<img alt="" src="kc-logo-header (1).png" width="70px" height="70px">
		</div>
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->



<div class="account-container register"  align="center" style="border: medium;">
	
<div class="content clearfix">

	

		
<div class="login-fields">		


		
		<%
String loc=request.getParameter("loc");
final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
final String DB_URL = "jdbc:mysql://localhost:3306/rbcdatabase1";
List<String> list =new ArrayList<String>();





String dd="";
Connection conn = null;
Statement stmt = null;
try{
   //STEP 2: Register JDBC driver
   Class.forName("com.mysql.jdbc.Driver");
   Long userid= (Long)session.getAttribute("userid");
   //STEP 3: Open a connection
   System.out.println("Connecting to database...");
   conn = (Connection) DriverManager.getConnection(DB_URL,"root","root");

   //STEP 4: Execute a query
   System.out.println("Creating statement...");
   stmt = (Statement) conn.createStatement();
   Statement stmt1 = (Statement) conn.createStatement();
   String sql;
   sql = "SELECT * from training_table where employee_id='"+userid+"' ";
   
   ResultSet rs = stmt.executeQuery(sql);
   ResultSet rs1=null;
   ResultSet rs2;
   String roomname="";
   String location="";
   //STEP 5: Extract data from result set
   
   
  %>
  
  </br>

</br>
</br>

<h1>BOOKINGS:</h1>
 
<table  border="8px" cellpadding="12px" bordercolor="#444"  >   
   <tr >
<td style="display:none;">Training ID</td>
<td>Room Name</td>
<td>Location</td>
<td>Start Date</td>
<td>End Date</td>
<td>Training Type</td>
<td>Start time</td>
<td>End time</td>
<td>Owner name</td>
<td>Training name</td>
<td>-------</td>
</tr>




<%

   while(rs.next()){
      //Retrieve by column name
	
	
	
	
  %>
  
  <TR>
                <TD style="display:none;"> <%= rs.getString(1) %></td>
                
                
   <%
String sql1 = "SELECT  room_name,location from room_table where room_id='"+rs.getString(3)+"' ";
   
   rs1 = stmt1.executeQuery(sql1);
   while(rs1.next())
	   
   {
	   
	   roomname=rs1.getString(1);
	   location=rs1.getString(2);
   }
   
   
   %>             
                
                
                <TD> <%= roomname %></TD>
                <TD> <%= location %></TD>
                <TD> <%= rs.getString(4) %></TD>
                <TD> <%= rs.getString(5) %></TD>
                <TD> <%= rs.getString(6) %></TD>
                <TD> <%= rs.getString(7) %></TD>
                <TD> <%= rs.getString(8) %></TD>
                <TD> <%= rs.getString(9) %></TD>
                <TD> <%= rs.getString(10) %></TD>
                <Td><button class="button btn btn-primary btn-large" id="del">Release</button></Td>               
                
                
            </TR>
     
  <%    
      
	
	   dd=dd+"<option value='"+rs.getLong(1)+"'>"+rs.getString(2)+"</option>";  
       
       System.out.println("dd");
   }



%>




</table>

<%
   //STEP 6: Clean-up environment
   rs1.close();
   rs.close();
   stmt.close();
   stmt1.close();
   conn.close();
}catch(SQLException se){
   //Handle errors for JDBC
   se.printStackTrace();
}catch(Exception e){
   //Handle errors for Class.forName
   e.printStackTrace();
}finally{
   //finally block used to close resources
   try{
      if(stmt!=null)
         stmt.close();
   }catch(SQLException se2){
   }// nothing we can do
   try{
      if(conn!=null)
         conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }//end finally try
}//end try
System.out.println("Goodbye!");
//PrintWriter out=response.getWriter();
//out.print(dd);


//end main


















%>

		
				
				
			</div> <!-- /login-fields -->
			
			<div class="login-actions">
				
													
			
				
			</div> <!-- .actions -->
			
			
		
		
		
		
	</div> <!-- /content -->
	
</div> <!-- /account-container -->


<!-- Text Under Box -->


<script src="js/jquery-1.7.2.min.js"></script>
<script src="js/bootstrap.js"></script>

<script src="js/signin.js"></script>

</body>

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
