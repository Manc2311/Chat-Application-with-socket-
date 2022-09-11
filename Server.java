import java.lang.*;
import java.net.*;   
import java.io.*;  //bufferreader

class Server {
  public static void main(String arg[]) 
  throws Exception
  {
    System.out.println("Server application is running...");
    String s1,s2;
    ServerSocket ss = new ServerSocket(1100);  //port no.
    Socket s =  ss.accept();
   
    System.out.println("connection Successfull");

    BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); //for listening  
    PrintStream ps = new PrintStream(s.getOutputStream());  //for talk
    while(!(s1 = br.readLine()).equals("gn"))
    {
        System.out.println("Gaurav says : "+s1);
        s2 = brK.readLine();
        ps.println(s2);
        System.out.println("Enter message for Gaurav : ");

    }
    s.close();
    ss.close();
    br.close();
    brK.close();
    ps.close();
  }

// next from 3.34.23   
    
}


