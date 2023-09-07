/**
 Author: D1teri or Dima K.
 Version 1.0.0
**/
public class RedBukkit
{
    int x = 5;
    int y = -900000000;
    int m = 25;
    float d = 0.52f;
    int Rnum = (int)(Math.random()*100);
    boolean flag = false;
    String ota = "You're lucky today";
    String ota2 = "Not today...";
    public void run() {
        while (x > 0) {
            x -= 1;
            System.out.println("We are gonna start in " + x);
            while(y < 900000000){
                y += 1;
            }
            y = 0;
        }
        System.out.println("======================");
        while (m > 0) {
            m -= 1;
            while(y < 900000000){
                y += 1;
            }
            y = 0;
        }
        System.out.println(Rnum);
        m = 25;
         while (m > 0) {
            m -= 1;
            while(y < 900000000){
                y += 1;
            }
            y = 0;
        }
        if (Rnum >= 51){
            flag = true;
        }
        else{
            flag = false;
        }
        if (flag = true){
            System.out.println(ota);
            System.out.println("Today you won " + d);
        }
        else{
            System.out.println(ota2);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) 
    {
        RedBukkit sp = new RedBukkit();
        sp.run();
    }
}
