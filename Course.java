/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Course {
    String s1="SENG 11233-Programming concepts";
    String s2="SENG 11232-Fundamentals of computer";
    String s3="SENG 11223-Statistics";
    
    
    public void Courseno(int x){
        switch(x){
            case 1:
                System.out.println("Subject:"+s1);
                break;
                 case 2:
                System.out.println("Subject:"+s2);
                break;
                 case 3:
                System.out.println("Subject:"+s3);
                break;
        }
        
    }
}
