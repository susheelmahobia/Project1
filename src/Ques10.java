import java.util.Arrays;

public class Ques10 {
//    static final int MAX_CHAR = 256;
    static final int N = 256;

    static void getOccuringChar(String str) {

        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[256];

        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(
                        "Number of Occurrence of "
                                + str.charAt(i)
                                + " is:" + count[str.charAt(i)]);
        }
    }

    static char MaxOccuringChar(String str1) {
        int ctr[] = new int[N];   // N=256;
        int l = str1.length();
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = " hello world I am hereee";
     //  getOccuringChar(str);

        System.out.println("Max occurring character is " +
                MaxOccuringChar(str));

    }
}





