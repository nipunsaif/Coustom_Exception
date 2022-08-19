# A Real Life Scenario of Custom Exception Handling in Java     

# Abstract

World’s popular giant tech company “Google” have published their recruitment event for Senior Software Engineer in Cloud Computing. The company has set the minimum qualification to verify the applicants. To find out real applicants, they have to make an application management system which can detect exceptions in the application of participants. If there occurred any exception during the registration, the program will monitor and handle the exception, for further process. Based on that, it will say the application status of the applicant. The company has set some minimum qualification to verify the applicants. 

# Methodology

Custom Exception Handling in the system are:
* ### ExpertiseException:
If the applicant does not have any expertise in Software Development, Data Structure and Algorithm, and Technical Leadership, then it will generate this exception.

* ### AcademicQualificationException:
If the applicant does not have complete their Degree in Bachelors, Masters or PhD and the Graduation, Expected Graduation, or PhD complete year is 2023 or before that, then this exception will occur.   

*	### ExperienceException:
If the applicant does not have the particular year of experience in the field, then this exception will occur.   

*	### AgeException:
The Applicant need to be an adult. If the applicants age is below 18 years, then this exception will occur.

* ### EnglishFluncyException:
Applicant need to be fluent in English. If the applicant is not fluent in English, then this exception will occur.

