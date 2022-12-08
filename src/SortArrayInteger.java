import java.util.Arrays;
public class SortArrayInteger {
    public static void main(String[] args) {
        int [] intarray = {45,67,43,3,2};
      /*
        // sorting using applying concept--numeric array
        int i,j;
        for(i=0;i<intarray.length-1;i++)
            for(j=0;j<intarray.length-i-1;j++)
            {

                if(intarray[j]>intarray[j+1])
                {
                    int temp;
                    temp=intarray[j];
                    intarray[j]=intarray[j+1];
                    intarray[j+1]=temp;
                }
            }
        for (int k=0;k<intarray.length;k++)
            System.out.format("%d  ",intarray[k]);
*/

        // approach 2 :

        System.out.println("array elements before sort "+Arrays.toString(intarray));
        Arrays.parallelSort(intarray);
        System.out.println("after sort"+Arrays.toString(intarray));

    }
}
