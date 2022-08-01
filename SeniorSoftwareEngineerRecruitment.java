package javaexceptionproject;
import java.util.Scanner;

class AcademicQualificationException extends Exception 
{
    public  AcademicQualificationException(String str)
    {
        super(str);
    }
}

class ExpertiseException extends Exception 
{
    public  ExpertiseException(String str)
    {
        super(str);
    }
}

class AgeException extends Exception 
{
    public  AgeException(String str)
    {
        super(str);
    }
}




class ExperienceException extends Exception 
{
    public  ExperienceException(String str)
    {
        super(str);
    }
}

class EnglishFluencyException extends Exception 
{
    public EnglishFluencyException (String str)
    {
        super(str);
    }
}




public class SeniorSoftwareEngineerRecruitment
{
    
    static void age(int a) throws AgeException
    {
        if(a<18)
        {
           throw new AgeException("Applicant's age need to be over 18 years old.");
        }
        else 
            System.out.println("Applicant's age is eligible for registration ");
    }
    
    
    static void fluency(String l) throws EnglishFluencyException
    {
        String s="English";
        if(s.equals(l))
           System.out.println("Applicant's communication fluency  is eligible for registration.");
    
        
        else 
            throw new EnglishFluencyException("Applicant need to be fluent in English.");
    }
    
    static void academicDegree(String degree, int year) throws AcademicQualificationException
    {
        String d1="Bachelors";
        String d2="Masters";
        String d3="PhD";
                
       
        if((d1.equals(degree) || d2.equals(degree) || d3.equals(degree))&& year<=2023)
            System.out.println("Applicant's Academic Degree is eligible for registration ");
           
        else 
            throw new AcademicQualificationException("Applicant's Academic Degree is not eligible for registration");
    }
    

    static void expertise(String st1, String st2,String st3) throws ExpertiseException
    {
      String  p1="Software Development";
      String  p2="Data Structure and Algorithm" ;
      String  p3="Technical Leadership";
      
              
        if(p1.equals(st1) &&  p2.equals(st2) && p3.equals(st3))
        {
            System.out.println("Applicant's Experties are eligible for registration");
        }
           
        else 
            throw new ExpertiseException("Applicant's Experties are not eligible for registration ");
    }
  
    
    static void experience(int e1, int e2, int e3) throws ExperienceException
    {
       
        if(e1<5 && e2<3 && e3<1)
        {
           throw new ExperienceException(" Applicant's Expriences are not eligible for registration");
        }
        else 
            System.out.println("Applicant's Expriences is eligible for registration");
    }
    


public static void main(String args[])
    {
        
        System.out.println("\t\t\t\tSenior Software Engineer Recruitment @Google");
        System.out.println("Applicant must need to enter valid information.\n(For giving any type of wrong information an exception will occured and the application will be rejected)\n");
  
        
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("1.Professional Expertise: ");
         System.out.print("i.");
         String st1 = input.nextLine();
         System.out.print("ii.");
         String st2 = input.nextLine();
         System.out.print("iii.");
         String st3 = input.nextLine();
         
       
         System.out.print("\n2.Educationcal Degeree: ");
         String degree= input.nextLine();
  
         System.out.print("\n3.Graduation year/Expected Graduation Year/PhD: ");
         int year= input.nextInt();
         
   
         
         System.out.print("\n4.Exprience in Software Development: ");
         int e1= input.nextInt();
         
         System.out.print("5.Exprience in Data Structure and Algorithm: ");
         int e2 = input.nextInt();
         
         System.out.print("6.Exprience in Technical Leadership: ");
         int e3= input.nextInt();
         
        
         
         System.out.print("\n7.Applicant age: ");
         int a = input.nextInt();
         
         System.out.print("\n8.Language Expertise: ");
         String l = input.next();
         
       
         
         boolean as= false;
      System.out.println("\n\n");
      
      try{
         expertise(st1, st2, st3);
         }catch(ExpertiseException e){
              as=true;
             System.out.println(e);
         }
          
      try{
         academicDegree(degree, year);
         }catch(AcademicQualificationException e){
             as =true;
             System.out.println(e);
         }
      
       try{
             experience(e1,e2,e3);
         }catch(ExperienceException e){
              as=true;
             System.out.println(e);
         }
          
        
         try{
         age(a);
         }catch(AgeException e){
            as=true;
             System.out.println(e);
         }
         
         
         try{
         fluency(l);
         }catch(EnglishFluencyException e){
             as=true;
             System.out.println(e);
         }

          
          
          if(as==true)
          {
              System.out.println("\nApplication Satus: Rejected"); 
          }
          else {
              System.out.println("\nApplication Status: Accepted");
              
          }
         
         
    }
    
 }




       
    

