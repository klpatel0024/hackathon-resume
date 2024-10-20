import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Resume
{
    private String name;
    private String address;
    private String phone;
    private String email;
    private String objective;
    private String education;
    private String workExperience;
    private String skills;
    private String certifications;
    private String volunteering;
    


    public String getName(){return name;}
    public void setName(String n){name = n;}

    public String getAddress(){return address;}
    public void setAddress(String a){address = a;}

    public String getPhone(){return phone;}
    public void setPhone(String p){phone = p;}

    public String getEmail(){return email;}
    public void setEmail(String e){email = e;}

    public String getObjective(){return objective;}
    public void setObjective(String o){objective = o;}

    public String getEducation(){return education;}
    public void setEducation(String e){
        String[] eduLines = e.split(";");
        for(int i = 0; i<eduLines.length; i++)
        {
            education+= eduLines[i] + "\n";
        }
         
    }


    public String getWorkExperience(){return workExperience;}
    public void setWorkExperience(String w){
        String[] workLines = w.split(";");
        for(int i = 0; i<workLines.length; i++)
        {
            workExperience+= workLines[i] + "\n";
        }
    }

    public String getSkills(){return skills;}
    public void setSkills(String s){
        String[] skillLines = s.split(";");
        for(int i = 0; i<skillLines.length; i++)
        {
            skills+= "-\t" + skillLines[i] + "\n";
        }
    }

    public String getCertifications(){return certifications;}
    public void setCertification(String c){
        String[] certLines = c.split(";");
        for(int i = 0; i<certLines.length; i++)
        {
            certifications += "-\t" + certLines[i] + "\n";
        }
    }

    public String getVolunteering(){return volunteering;}
    public void setVolunteering(String v){
        String[] volLines = v.split(";");
        for(int i = 0; i<volLines.length; i++)
        {
            volunteering+= volLines[i] + "\n";
        }
    }

    public void print()
    {
        
        try {
            PrintWriter writer = new PrintWriter("resume.txt", "UTF-8");
            writer.printf("%-25s\n", name.toUpperCase());
            writer.printf("%s\t|\t%s\t|\t%s\n\n", address, email, phone);
            if(objective == null)
            writer.printf("%s\n%s", "OBJECTIVE", objective);
            writer.printf("%s\n%s", "EDUCATION", education);
            writer.printf("%s\n%s", "WORK EXPERIENCE", workExperience);
            writer.printf("%s\n%s", "SKILLS", skills);
            writer.printf("%s\n%s", "CERTIFICATIONS", certifications);
            writer.printf("%s\n%s", "VOLUNTEERING", volunteering);
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("File not Found");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }


    }

    public String toString()
    {
        return String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", "RESUME:", name, address, phone, email, 
                                objective, education, workExperience, skills, certifications, volunteering); 
    }

}
/**
 * SEJAL PATEL
 Yardley, PA 19067 | spatel1209@hotmail.com 

OBJECTIVE 
A hard-working, driven high school student with interpersonal and analytical skills with at least a 4.0 GPA. 
Looking to apply my academic and creative skills and passion for architecture at Minno & Wasko to learn more about the architectural world and to gain applicable skills and experience for my professional future. 
EDUCATION
George School											        Aug 2020- Current
Newtown, PA 18940		   
GPA: 4.3
Nominated to the Head of School’s List. Rigorous coursework with multiple AP classes.
LEADERSHIP
Student Council                                                                                       			          		
Representative: Sept 2020- Jun 2022 
-	Aided in student events and changes that benefit the community such as grade policies.
-	Managed and planned activities during Spirit Week and Student Council Weekend.  
Treasurer: Sept 2022- Current 
-	Managed finances, approved clubs, and funding 
Peer Group Leader										        Sept 2022- Current      
-	Aided the freshman class to adjust to high school, provided a role model for younger students, and led them through on-campus community service. 
SAMOSA Leader/Student Inclusion					 			        Sept 2022- Current         
-	Promoted diversity and inclusion for students throughout campus.
-	Provided a safe place for South Asian students that encouraged conversation and self-expression.
EXPERIENCE
Tutor												         Jun 2022- Current
Tutored elementary and middle school students in math over the summer. Currently tutor math at my school for math classes ranging from Algebra 1 to Precalculus. 
Small Business 									                     Sept 2022- Current
Made and sold jewelry at craft sales, through social media, and by demand. Made jewelry since I was 9 and started my business when I was 11.
SKILLS/ACCOMPLISHMENTS
-	Art skills, Ceramics, Woodworking 
-	Leadership, Organization and Planning 
-	Computer skills, including coding.
-	Spanish speaking skills
-	Adaptable, able to quickly grasp new concepts and reteach them.
-	Time Management


 */