import java.lang.*;
import java.net.*;  //for socket
import java.io.*;

class Client {
  public static void main(String arg[]) 
  throws Exception
  {
    System.out.println("Client application is running...");
    String s1,s2;
                            //   ip         portno.
    Socket s = new Socket("localhost",1100);

    //reading inputs
    BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));

    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    PrintStream ps = new PrintStream(s.getOutputStream());
    while(!(s1 = brK.readLine()).equals("gn"))
    {
        ps.println(s1);
        s2 = br.readLine();
        System.out.println("Manu says : "+s2);
        System.out.println("Enter message for Manu : ");

    } 
    s.close();
    br.close();
    brK.close();
    ps.close();
  }


}