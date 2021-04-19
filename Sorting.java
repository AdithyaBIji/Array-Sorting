package com.example.java;
import java.util.Scanner;

public class Sorting{

    public static void main(String []args){


        int i, j, temp, n;
        int [] arr = new int [15];
        Scanner sc = new Scanner(System.in);
        System.out.println("Give an array no.:");
        n=sc.nextInt();
        System.out.println("Enter elements of array:");

        for(i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(i=0 ; i<n ; i++)
        {

            for(j=i+1; j<n; j++)
            {

                if(arr[i]>arr[j])
                {

                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("The nos. arranged in ascending order are as follows: ");

        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
