/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyknapsack;

/**
 *
 * @author HP
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.*;
public class Greedyknapsack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner input = new Scanner(Paths.get("inst2.txt"));

            int num = input.nextInt();
            double cap = input.nextInt();
            
            double[] arrw = new double[num];
            double[] arrv = new double[num];
            double[] ratio = new double[num];
            double[] r = new double[num];
            int count = 0;
           
            
            while (count<num) { // read from file 
                arrv[count]= input.nextInt();
                arrw[count]= input.nextInt();
                count++;
    }
  
       for (int i =0 ; i<arrw.length ;i++){// get ratio
              ratio[i]= arrv[i]/arrw[i] ;
              }
      
       //sort ratio
        double[] sortratio = ratio.clone(); 
        Arrays.sort(sortratio);
        for(int i=sortratio.length-1;i>=0;i--) // max [ratio]
      {
          for(int j = 0; j < ratio.length; j++){ // get element index
              
              if(sortratio[i]==ratio[j]) // if sortratio ==ratio
              { 
                  if(cap>0){
                  cap =cap - arrw[j];
                  r[j]=1; 
                  }
              }
          }
  
      }
     
// converte from double to int 
      int[] res= new int[num];
      for (int i=0; i<r.length; ++i)
        res[i] = (int) r[i];
        System.out.println("the result : "+Arrays.toString(res));

         
    }
    
}
