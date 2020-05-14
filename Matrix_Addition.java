/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_addition;

/**
 *
 * @author Supreme
 */
public class Matrix_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
    int c[][]=new int[3][3];  
    
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
     c[i][j]=a[i][j]+b[i][j];
    System.out.print(c[i][j]+"\t ");    
}    
System.out.println();
    }
    
    }
}
