public class BitManipulation {
    public static void main(String args[]){


        // Get Bit
        int n = 5;
        int posn = 2;
        int bit_mask = 1<<posn;
        if((bit_mask & n)== 0){
            System.out.println("Required bit is zero");
        }else {
            System.out.println("Required bit is 1");
        }

        // Set Bit
        int pos1 = 1;
        int bit_mask1 = 1<<pos1;
        int P = n | bit_mask1;
        System.out.println("New bit is "+ P);


        // Clear Bit
        int X = ((~bit_mask)& n);
        System.out.println(X);
    }
}
