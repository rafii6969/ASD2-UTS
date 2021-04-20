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
public class Selectionsort {
    public static void selectionsort(int[] A){
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        for(pass = 0; pass < n -1; pass++){
            smallIndex = pass;
            for (j = pass + 1; j < n; j++){
                if (A[j] < A[smallIndex]){
                    smallIndex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {3, 10, 4, 2, 8, 13};
        Selectionsort.tampil(A);
        Selectionsort.selectionsort(A);
        Selectionsort.tampil(A);
    }   
}
