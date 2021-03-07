/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        //exercise 2.35
        Scanner s =new Scanner(System.in);


         int miles, gasCost, mpg, parkFee,tolls,total; // total cost

         System.out.print( "Please enter the total miles driven per day: "); 
         miles =s.nextInt();

         System.out.print( "Please enter the cost per gallon of gasoline: "); 
         gasCost =s.nextInt(); 

         System.out.print( "Please enter average miles per gallon: "); 
         mpg =s.nextInt();

         System.out.print( "Please enter the parking fees per day: " );
         parkFee=s.nextInt();

         System.out.print( "Please enter the tolls per day: " );
         tolls=s.nextInt();

         total = tolls + parkFee + ( miles / mpg ) * gasCost;

         System.out.printf( "Your daily cost: $%d\n", total );
 
         
        
        /*
        
        //exercise 2.29
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
        System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
        System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
        System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
        System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
        System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
        
        //exercise 2.33
      Scanner s = new Scanner( System.in );
      System.out.print( "Enter your weight with kilograms: ");
      double weightInKilograms=s.nextDouble();
      System.out.print( "Enter your height with meters: ");
      double heightInMeters=s.nextDouble();
      double BMI = weightInKilograms/(heightInMeters*heightInMeters);
      
      if(BMI<18.5){
          System.out.printf( "Underweight. Your BMI values: %.1f\n",BMI);
      }
      if(BMI>18.5 && BMI<24.9){
          System.out.printf( "Normal. Your BMI values: %.1f\n",BMI);
      }
      if(BMI>25 && BMI<29.9){
          System.out.printf( "Overweight.Your BMI values: %.1f\n",BMI);
      }
      if(BMI>=30){
          System.out.printf( "Obese. Your BMI values: %.1f\n",BMI);
      }
        
        //exercise 2.34
      Scanner s = new Scanner( System.in );
      double year1,year2,year3,year4,year5;
      float growthRate;

      System.out.print( "Enter the current world population: ");
      double current_population = s.nextDouble();

      System.out.print( "Enter the annual world population growth rate(with percent): ");
      growthRate = s.nextFloat();
      growthRate = growthRate / 100;

      year1 = current_population + ( current_population * growthRate );
      System.out.printf( "World population after one year: %.0f\n", year1 );

      current_population = year1;
      
      year2 = current_population + ( current_population * growthRate );
      System.out.printf( "World population after two years: %.0f\n", year2 );

      current_population = year2;

      year3 = current_population + ( current_population * growthRate );
      System.out.printf( "World population after three years: %.0f\n", year3 );

      current_population = year3;
      
      year4 = current_population + ( current_population * growthRate );
      System.out.printf( "World population after four years: %.0f\n", year4 );

      current_population = year4;

      year5 = current_population + ( current_population * growthRate );
      System.out.printf( "World population after five years: %.0f\n", year5 );
        
        //exercise 2.32
        Scanner s = new Scanner(System.in);
        int [] arr = new int[5];
        int total_p=0,total_n=0,total_z=0;
        System. out. println("Enter all the elements:");
        for(int i = 0; i < 5; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < 5; i++){
           if(arr[i]>0){
               total_p++;
                       }
           else if(arr[i]<0){
               total_n++;
                       }
           else{
               total_z++;
                       }
        }
        System.out.println("Number of positive numbers input: "+total_p);
        System.out.println("Number of negative numbers input: "+total_n);
        System.out.println("Number of zeros input: "+total_z);
        
        //exercise 2.31
        System.out.println("Number"+"\t"+"Square"+"\t"+"Cube");
        for(int n=0;n<=10;n++){
            System.out.println(n+"\t"+n*n+"\t"+n*n*n);
        }
        
        //exercise 2.30
        Scanner s = new Scanner(System.in);
	System.out.print("Enter five-digits number: ");
	int num = s.nextInt();
        
        if(num>=10000 && num<=99999){
            System.out.print(num/10000+"  ");
            System.out.print((num/1000)%10+"  ");
            System.out.print((num/100)%10+"  ");
            System.out.print((num/10)%10+"  ");
            System.out.print(num%10+"\n");
        }
        if(num<=10000){
            System.out.println("Number is less than 10000");
        }
        if(num>=99999){
            System.out.println("Number is more than 10000");
        }
        
        //exercise 2.28
        double pi =Math.PI;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r =s.nextDouble();
        
        double diametr=2*r;
        double circumference = 2*pi*r;
        double area = pi*Math.pow(r,2);
        
        System.out.format("Diametr=%.3f\n",diametr);
        System.out.format("Circumference=%.3f\n",circumference);
        System.out.format("Area=%.3f\n",area);
        
        //exercise2.17
                int n1,n2,n3,sum,average,smallest,largest,product;
		
                Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		n1 = s.nextInt();
		System.out.print("Enter second integer: ");	
		n2 = s.nextInt();
		System.out.print("Enter third integer: ");	
		n3 = s.nextInt();	
		
		sum = n1 + n2 + n3;	
		average = sum/3;	
		product = n1 * n2 * n3;	
		
		if(n1>=n2 && n1>=n3){
                    largest = n1;
                }
                else if(n2>=n1 && n2>=n3){
                    largest = n2;
                }
                else{
                    largest = n3;
                }
                
                
		if(n1<=n2 && n1<=n3){
                    smallest = n1;
                }
                else if(n2<=n1 && n2<=n3){
                    smallest = n2;
                }
                else{
                    smallest = n3;
                }	
		
		System.out.printf("Sum is %d\n", sum);	
		System.out.printf("Average is %d\n", average);	
		System.out.printf("Product is %d\n", product);	
		System.out.printf("Smallest is %d\n", smallest);
		System.out.printf("Largest is %d\n", largest);
		
	}

}
    
        //exercise2.19
    System.out.printf("*%n**%n***%n****%n*****%n");    
        
        //exercise2.18
        System.out.print ("*********      ***        *          * \n");
        System.out.print ("*       *    *     *     ***        * * \n");
        System.out.print ("*       *   *       *   *****      *   * \n");
        System.out.print ("*       *   *       *     *       *     * \n");
        System.out.print ("*       *   *       *     *      *       * \n");
        System.out.print ("*       *   *       *     *       *     * \n");
        System.out.print ("*       *   *       *     *        *   * \n");
        System.out.print ("*       *    *     *      *         * * \n");
        System.out.print ("*********      ***        *          * \n");
        
        //exercise2.21
    System.out.print("*");
    System.out.print("***");
    System.out.print("*****");
    System.out.print("****");
    System.out.println("**");     
        
        //exercise2.20
    System.out.println("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.println("****");
    System.out.println("**");
        
        //exercise2.22
    System.out.print("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.print("****");
    System.out.println("**");
        
    //exercise2.23
    System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");    
        
    //exercise2.25
    System.out.print("Enter a number: "); 
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
        if(num%2==0){
            System.out.println("This number is even. "); 
        }
        else{
            System.out.println("This number is odd. "); 
          }    
        */
        /*//exercise2.24
        System.out.print("Enter five numbers: "); 
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();
        int num5 = s.nextInt();
        
        if(num1>num2 && num1>num3 && num1>num4 && num1>num5){
            System.out.println("Maximum of numbers: "+num1);
        }
        else if(num2>num1 && num2>num3 && num2>num4 && num2>num5){
            System.out.println("Maximum of numbers: "+num2);
        }
        else if(num3>num1 && num3>num2 && num3>num4 && num3>num5){
            System.out.println("Maximum of numbers: "+num3);
        }
        else if(num4>num1 && num4>num2 && num4>num3 && num4>num5){
            System.out.println("Maximum of numbers: "+num4);
        }
        else{
            System.out.println("Maximum of numbers: "+num5);
        }
        
        
        
        if(num1<num2 && num1<num3 && num1<num4 && num1<num5){
            System.out.println("Minimum of numbers: "+num1);
        }
        else if(num2<num1 && num2<num3 && num2<num4 && num2<num5){
            System.out.println("Minimum of numbers: "+num2);
        }
        else if(num3<num1 && num3<num2 && num3<num4 && num3<num5){
            System.out.println("Minimum of numbers: "+num3);
        }
        else if(num4<num1 && num4<num2 && num4<num3 && num4<num5){
            System.out.println("Minimum of numbers: "+num4);
        }
        else{
            System.out.println("Minimum of numbers: "+num5);
        }
         
        
        int[] num = {56,34,98,23,103};
        int max=num[0],min=num[0];
         for(int i=0;i<num.length;i++){
             if(max > num[i]){
                max=num[i]; 
         }
             if(min<num[i]){
                 min=num[i];
             }
         }
         System.out.println("Maximum of numbers: "+max); 
         System.out.println("Minimum of numbers: "+min); 
        
        
        //exercise2.27
    System.out.print ("* * * * * * * *\n");
    System.out.print (" * * * * * * * *\n");
    System.out.print ("* * * * * * * *\n");
    System.out.print (" * * * * * * * *\n");
    System.out.print ("* * * * * * * *\n");
    System.out.print (" * * * * * * * *\n");
    System.out.print ("* * * * * * * *\n");
    System.out.print (" * * * * * * * *\n");
        
        
         //exercise2.26
    System.out.println("Enter two number: "); 
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2= s.nextInt();
    if(num1%num2==0){
        int mult = num1/num2;
        System.out.println("The first number is "+mult+" multiples of the second . "); 
        }
    else{
        System.out.println("The first number isn't a multiple of the second . "); 
          }
        
          */    }
}
                
         
    
        
 
        
          
    
