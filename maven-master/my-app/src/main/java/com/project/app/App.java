package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int number=53;
        System.out.println( "Jenkins DevOps! " + number);
         try {
            for ( int i = number; i < number*2; i++ ){
                Thread.sleep(1000);
                System.out.println( "Doing " + i);
            }
        }
        catch (Exception e) {

            System.out.println(e);
        }
        System.out.println("Finished Activities");
    }
}
