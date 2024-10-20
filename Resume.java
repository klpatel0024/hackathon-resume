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
    
    public Resume(){
        name = "";
        address = "";
        phone = "";
        email = "";
        objective = "";
        education = "";
        workExperience = "";
        skills = "";
        certifications = "";
        volunteering = "";
    }


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
            writer.printf("%25s\n", name.toUpperCase());
            writer.printf("%s\t|\t%s\t|\t%s\n\n", address, email, phone);
            if(objective == null)
            writer.printf("%s\n%s", "OBJECTIVE", objective);
            writer.printf("\n%s\n%s", "EDUCATION", education);
            writer.printf("\n%s\n%s", "WORK EXPERIENCE", workExperience);
            writer.printf("\n%s\n%s", "SKILLS", skills);
            writer.printf("\n%s\n%s", "CERTIFICATIONS", certifications);
            writer.printf("\n%s\n%s", "VOLUNTEERING", volunteering);
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
