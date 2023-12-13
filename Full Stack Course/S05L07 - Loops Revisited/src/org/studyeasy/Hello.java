package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        for(int i=1, j=1; i<10 && j<10; i++,j++){
            j++;
            System.out.println("i="+i+" and j="+j);
        }
        System.out.println();
        for(int i=1, j=1; i<10 || j<10; i++,j++){
            j++;
            System.out.println("i="+i+" and j="+j);
        }
        System.out.println();
        int i=1,j=1;
        while (i<10 && j<10){
            i++;
            j++;
            System.out.println("i="+i+" and j="+j);
        }

    }
}
