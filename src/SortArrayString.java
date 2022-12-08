import java.util.Arrays;
import java.util.Collections;

public class SortArrayString {
    public static void main(String[] args) {
        String [] students={"zack","kavya","rahul","astha"};
        /*
        int i,j;
        for(i=0;i<students.length-1;i++)
            for(j=0;j<students.length-i-1;j++)
            {

                if(students[j].compareToIgnoreCase(students[j+1])>0)
                {
                    String temp;
                    temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        for(int k=0;k<students.length;k++)
            System.out.print(students[k]+ " ");
            */
     Arrays.sort(students);
        for(int k=0;k<students.length;k++)
            System.out.print(students[k]+ " ");
    }
}
