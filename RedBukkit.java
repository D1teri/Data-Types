/**
 Author: D1teri or Dima K.
 Version 1.0.0
**/
public class RedBukkit
{
    int x = 107;
    int y = 0;
    float d = 0;
    boolean flag = false;
    String ota = "I am done...";
    String ota2 = "maybe...";
    public void run() {
        while (x > 0) {
            x -= 7;
            System.out.println(x);
            while(y < 300000000){
                y += 1;
            }
            y = 0;
        }
        System.out.print(ota);
        System.out.println(ota2);
    }
    public static void main(String[] args) 
    {
        RedBukkit sp = new RedBukkit();
        sp.run();
    }
}
