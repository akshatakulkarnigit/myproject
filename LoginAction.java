package test;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {
	      
	       if(username.equalsIgnoreCase("shannabulli")) 
	        return "success";
	       else
	    	   
	    	   return "error";
	    }
	
	/*Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.addBatch("insert into user420 values(190,'abhi',40000)");  
stmt.addBatch("insert into user420 values(191,'umesh',50000)");  
  
stmt.executeBatch();//executing the batch  

*/
	
	
	/*
	 
	 Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
  
PreparedStatement ps=con.prepareStatement("insert into user420 values(?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
while(true){  
  
System.out.println("enter id");  
String s1=br.readLine();  
int id=Integer.parseInt(s1);  
  
System.out.println("enter name");  
String name=br.readLine();  
  
System.out.println("enter salary");  
String s3=br.readLine();  
int salary=Integer.parseInt(s3);  
  
ps.setInt(1,id);  
ps.setString(2,name);  
ps.setInt(3,salary);  
  
ps.addBatch();  
System.out.println("Want to add more records y/n");  
String ans=br.readLine();  
if(ans.equals("n")){  
break;  
}  
  
}  
ps.executeBatch();  
  
System.out.println("record successfully saved");  
  
con.close();  
}catch(Exception e){System.out.println(e);}  
  
}}
	  
	  */
	
	/*creating row set*/
	
	/*JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
        rowSet.setUsername("system");  
        rowSet.setPassword("oracle");  
                   
        rowSet.setCommand("select * from emp400");  
        rowSet.execute();  while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getString(1));  
                        System.out.println("Name: " + rowSet.getString(2));  
                        System.out.println("Salary: " + rowSet.getString(3));  
                }  */
}
