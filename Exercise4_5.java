/*
Amine Ceren Yiğit
250541048
Ödev 5
*/
public class Exercise4_5 {

    public static void zoop(String fred, int bob) { //5,15
        System.out.println(fred); //6,16
        if (bob == 5) { //7
            ping("not "); //8
        } else { //17
            System.out.println("!"); //18
        }
    }

    public static void main(String[] args) { //1
        int bizz = 5; //2
        int buzz = 2; //3
        zoop("just for", bizz); //4
        clink(2 * buzz); //11
    }

    public static void clink(int fork) { //12
        System.out.print("It's "); //13
        zoop("breakfast ", fork); //14
    }

    public static void ping(String strangStrung) { //9
        System.out.println("any " + strangStrung + "more "); //10
    }
}
/*   
Soru_2
just for
any not more 
It's breakfast 
!

Soru_3
[zoop("breakfast"),4]
[click(4)]
[main]
*/    

