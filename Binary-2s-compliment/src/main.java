public class main {
    public static void main(String[] args) throws Exception {
        decimalToBinary(12);  
        decimalToBinary(-12); 
    }

    public static void decimalToBinary(int n) {
        String binary = "";
        boolean twosConverted = false;

        if (n < 0) {
            twosConverted = true;
            n = Math.abs(n);  
        }

        if (n == 0) {
            binary = "0"; 
        } else {
            while (n > 0) {
                if (n % 2 == 0) {
                    binary = "0" + binary;  
                } else {
                    binary = "1" + binary; 
                }
                n = n / 2;
            }
        }

        if (twosConverted) {
            
            char[] twosConversion = binary.toCharArray();

            for (int i = 0; i < twosConversion.length; i++) {
                if (twosConversion[i] == '0') {
                    twosConversion[i] = '1';
                } else {
                    twosConversion[i] = '0';
                }
            }

           
            boolean carry = true;  
            for (int i = twosConversion.length - 1; i >= 0; i--) {
                if (carry) {
                    if (twosConversion[i] == '0') {
                        twosConversion[i] = '1';
                        carry = false;  
                    } else {
                        twosConversion[i] = '0'; 
                    }
                }
            }

          
            System.out.println("Two's complement binary: " + new String(twosConversion));
        } else {

            System.out.println("Binary: " + binary);
        }
    }
}