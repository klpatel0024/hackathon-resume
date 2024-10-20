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
        name = "none";
        address = "none";
        phone = "none";
        email = "none";
        objective = "none";
        education = "none";
        workExperience = "none";
        skills = "none";
        certifications = "none";
        volunteering = "none";
    }
    public Resume(String n, String a, String p, String e, String o, String ed, String w, String s,  String c, String v){
        name = n; address = a; phone = p; email = e; objective = o; education = ed; workExperience = w; skills = s; certifications = c; volunteering = v;
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
    public void setEducation(String e){education = e;}

    public String getWorkExperience(){return workExperience;}
    public void setWorkExperience(String w){workExperience = w;}

    public String getSkills(){return skills;}
    public void setSkills(String s){skills = s;}

    public String getCertifications(){return certifications;}
    public void setCertification(String c){certifications = c;}

    public String getVolunteering(){return volunteering;}
    public void setVolunteering(String v){volunteering = v;}

}