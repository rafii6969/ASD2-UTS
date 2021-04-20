/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

/**
 *
 * @author rafii
 */
public class Matriks {
    public static void printMatriks(int[][] matriks){
        //menampilkan matriks agar keren
        for (int[] matrik : matriks) {
            for (int j = 0; j<matriks[0].length; j++) {
                System.out.print(matrik[j] + " ");
            }
            System.out.println();
        }
System.out.println("RAFI DIMAS RAMADANI");
    }
    
    public static void main (String[] args) {
        int [][] A = {
            {1,2,3},
            {4,5,6}     
        }; 
        
        System.out.println("=== Matriks A ===");
        printMatriks(A);
        
        int [][] B = {
            {6,5,4},
            {3,2,1}
        };
        System.out.println("=== Matriks B ===");
        printMatriks(B);
       
        int [][] c = {
            {5,6},
            {7,8},
            {9,10}
        };
        System.out.println("=== Matriks C ===");
        printMatriks(c);
        int hasil_tambah [][]= new int [A.length][A[0].length];
        System.out.println("Hasil Penjumlahan :");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                hasil_tambah[i][j]= A[i][j] + B[i][j];
                System.out.print(hasil_tambah[i][j]+" ");   
            }System.out.println();  
        }
        int hasil_kali [][] = new int [hasil_tambah.length][c[0].length];
        System.out.println("Hasil Perkalian :");
        for (int i = 0; i < hasil_tambah.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < hasil_tambah[0].length; k++) {
                  hasil_kali[i][j] += hasil_tambah[i][k]*c[k][j];           
                    } System.out.print(hasil_kali[i][j]+" ");    
                }
            System.out.println();
                
            }
        int[][] transpose = new int [7][7];
        System.out.println("Hasil Transpose  : ");
        for (int f = 0; f < hasil_kali.length; f++) {
            for (int r = 0; r < hasil_kali[0].length; r++) {
                transpose[r][f] = hasil_kali[f][r];     
            }  
        }
        for (int f = 0; f < hasil_kali[0].length; f++) {
            for (int r = 0; r < hasil_kali.length; r++) {
                System.out.print(transpose[f][r]+" ");      
            }
            System.out.println();
        }  
        System.out.println("RAFI DIMAS RAMADANI");
    }   
}
