/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author rafii
 */
public class bubbleshort {
     public static void bubbleShort(int[] A){
        int i = 1,j ,n = A.length;
        int temp;
        while (i<n){
            j = n-1 ;
            while(j>=i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;               
        }
    }
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();        
    }
    public static void main(String[] args){
        int A[] = {3, 10, 4, 2, 8, 13};
        bubbleshort.tampil(A);
        bubbleshort.bubbleShort(A);
        bubbleshort.tampil(A);
    }
}
