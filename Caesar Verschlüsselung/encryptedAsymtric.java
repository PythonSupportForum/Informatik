import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Arrays;

public class encryptedAsymtric{
    private int[] pubSchlüssel;
    private int[] priSchlüssel;
    public encryptedAsymtric()
    {
       this.GenerateSchluesselForRSAAlgorym();
    }
    private int ggt(int zahl1, int zahl2) {
        while (zahl2 != 0) {
           if (zahl1 > zahl2) {
               zahl1 = zahl1 - zahl2;
           } else {
               zahl2 = zahl2 - zahl1;
           }
        }
       return zahl1;
    }
    private long search_for_very_big_prim_number()
    {
        long p = 0;
        while (true){
            Random randNum = new Random();
            byte[] b = new byte[3];
            randNum.nextBytes(b);
            p = Math.abs(new BigInteger(b).longValue());
            System.out.println("Zahl:"+p);
            if(new MillerRabinTest().isPrime(p, 3)) {
                break;
            }
        }
        return p;
    }
    public void GenerateSchluesselForRSAAlgorym(){
        long p1 = this.search_for_very_big_prim_number();
        long p2 = this.search_for_very_big_prim_number();
        
        int n = (int)p1*(int)p2;
        int z = ((int)p1-1)*((int)p2-1);
        
        int e = 2;
        for (e = 2; e < z; e++) {
            if (this.ggt(e, z) == 1) {
                break;
            }
        }
        int d = 0;
        for (int i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        this.pubSchlüssel = new int[]{e, n};
        this.priSchlüssel = new int[]{d, n};
    }
    public double encrypt(int msg){
        int e = this.pubSchlüssel[0];
        int n = this.pubSchlüssel[1];
        return ((Math.pow(msg, e)) % n);
    }
    public BigInteger decrypt(double data){
        int d = this.pubSchlüssel[0];
        int n = this.pubSchlüssel[1];
        BigInteger N = BigInteger.valueOf(n);
        BigInteger C = BigDecimal.valueOf(data).toBigInteger();
        return (C.pow(d)).mod(N);
    }
}
