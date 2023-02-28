/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ab_testing;
 import java.util.Random;
/**
 *
 * @author pfoteinopoulos
 */
public class AB_Testing {
     // The number of visitors to the website
  static final int NUM_VISITORS = 1000;

  // The number of visitors who converted (i.e., completed a desired action, such as making a purchase)
  static int numConversionsA = 0;
  static int numConversionsB = 0;
    public static void main(String[] args) {
        


 

  
    // Randomly assign each visitor to either version A or B of the website
    Random rand = new Random();
    for (int i = 0; i < NUM_VISITORS; i++) {
      if (rand.nextBoolean()) {
        visitSiteA();
      } else {
        visitSiteB();
      }
    }

    // Calculate the conversion rate for each version of the website
    double conversionRateA = (double) numConversionsA / NUM_VISITORS;
    double conversionRateB = (double) numConversionsB / NUM_VISITORS;

    // Determine which version of the website had a higher conversion rate
    if (conversionRateA > conversionRateB) {
      System.out.println("Version A had a higher conversion rate: " + conversionRateA);
    } else {
      System.out.println("Version B had a higher conversion rate: " + conversionRateB);
    }
  }

  // Simulates a visitor to the A version of the website
  static void visitSiteA() {
    // Randomly decide whether the visitor converts
    Random rand = new Random();
    if (rand.nextDouble() < 0.1) {  // Conversion rate for A is 10%
      numConversionsA++;
    }
  }

  // Simulates a visitor to the B version of the website
  static void visitSiteB() {
    // Randomly decide whether the visitor converts
    Random rand = new Random();
    if (rand.nextDouble() < 0.2) {  // Conversion rate for B is 20%
      numConversionsB++;
    }
  }
}

    

