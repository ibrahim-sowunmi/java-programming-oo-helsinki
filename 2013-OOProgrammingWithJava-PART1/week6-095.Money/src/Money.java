
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int val = this.euros + added.euros;
        int val2 = this.cents + added.cents;
        int val3 = 0;
        if (val2 < 100) {
            val3 = val2 % 100;
            val2 = val2 - val3;
            val2 = val2/100;
           
        } else {
             val3 = val2;
        }
        
        return new Money(val, val3);
    }
    
    public boolean less(Money compared) {
        int tcents = this.euros * 100 + this.cents;
        int ccents = compared.euros * 100 + compared.cents;
         
        return tcents < ccents;
    }
    
    public Money minus(Money decremented) {
        int tcents = this.euros * 100 + this.cents;
        int ccents = decremented.euros * 100 + decremented.cents;
        int val = tcents - ccents;
        if (val < 0) {
            return new Money(0,0);
        }
        String sval = Integer.toString(val);
        String fchar = sval.substring(1);
        sval = sval.replace(fchar, "");
        int isval = Integer.valueOf(sval);
        int ifchar = Integer.valueOf(fchar);
        
        
        
        return new Money(isval,ifchar);
        
       
    }
    
    

}
