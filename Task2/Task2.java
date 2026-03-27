public class Task2{
    public static void main(String[] args){
        //primitive types
        char h = 'H';
        byte e = 3;
        byte l = 0x01;          //hexadecimal value for l
        short octl= 01;         //octadecimal value for l 
        int binaryZero = 0b0;      //binary value for 0

        char w = 'w';
        char octZero = 060;     //octadecimal value of 0
        char r = '\162';         //octadecimal value of r
        int l1 = 1;   
        char d = 100;           //decimal value of d

        float f = 2.0f;
        boolean bool = true;
        
        String output = ""+h + e +l + octl + binaryZero + " "+w + octZero +r + l1 + d + " "+f+" "+bool;
        System.out.println(output);
    }
}