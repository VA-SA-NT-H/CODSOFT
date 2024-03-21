package com.mycompany.student_grade_evaluation;

import java.util.Scanner;


public class Student_grade_evaluation
{

    public static void main(String[] args)
    {
        int no_of_students,no_of_subjects;
      
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects : ");
        no_of_subjects = in.nextInt();
        
        System.out.print("Enter the number of students : ");
        no_of_students = in.nextInt();
        
        int[][] marks = new int[no_of_students][no_of_subjects];
        int[] sum = new int[no_of_students];
        double[] average = new double[no_of_students];
        char[] grade = new char[no_of_students];
        String[] name = new String[no_of_students];
        
        
        System.out.println("\nEnter the details of the students");
        for(int i=0;i<no_of_students;i++)
        {
            System.out.print("\nEnter the name of the student "+ (i+1) + " : ");
            in.nextLine();
            name[i] = in.nextLine();
            System.out.println("\nEnter the marks ");
            sum[i] = 0;
            for(int j=0;j<no_of_subjects;j++)
            {
                System.out.print("\tSubject "+ (j+1) +" : ");
                marks[i][j] = in.nextInt();
                
                sum[i] += marks[i][j];
            } 
            average[i] = 0;
            average[i] =  sum[i]/no_of_subjects;
        }
        
        for(int i=0;i<no_of_students;i++)
        {
                if(average[i]>=90)
                {
                     grade[i]='A';
                }
                else if(average[i]>=80 && average[i]<90)
                {
                    grade[i]='B';
                }
                else if(average[i]>=70 && average[i]<80)
                {
                    grade[i]='C';
                }
                else if(average[i]>=60 && average[i]<70)
                {
                    grade[i]='D';
                }
                else
                {
                    grade[i]='E';
                }
        }
        
        for(int i=0;i<no_of_students;i++)
        {
            System.out.println("\nMarks of "+ name[i] +" : " );
            System.out.println("\t Average : "+ average[i]);
            System.out.println("\t Grade : "+ grade[i]);
        }
        
    }
}