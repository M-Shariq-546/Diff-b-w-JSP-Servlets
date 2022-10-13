/*The comparison between jsp and servlets*/


//Importing the Files
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;
/*
Importing Files in jsp
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
*/  


//Creating the Class as Cpp
/*
Creating class and connection in jsp
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "database";
String userid = "root";
String password = "";
*/



/*
Exception for the jsp file 
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
*/
public class DemoServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
//Give error notification as exception handling
throws ServletException,IOException  
{  

res.setContentType("text/html");//setting the content type  

//built in function PrintWriter from java.io*
PrintWriter pw=res.getWriter();//get the stream to write the data  
 

/* 
Html code for jsp file 
<html>
<body>
	<select>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select id , pname , cnic from patients ";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>  
<option><%= resultSet.getString("pname")  %>   </option>
*/



//writing html in the stream  
pw.println("<html><body>");  
pw.println("Welcome to servlet");  
pw.println("</body></html>");  



/* 
Connection Closing for jsp file 
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</select> 

</body>
</html>
*/
pw.close();//closing the stream  
}}  