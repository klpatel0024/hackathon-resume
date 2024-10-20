import java.util.Scanner;

public class main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Resume resume = new Resume();

        String name;
        String address;
        String phone;
        String email;
        String objective;
        String education;
        String workExperience;
        String skills;
        String certifications; 
        String volunteering;

        System.out.println("ResYOUme: Resume Builder");
        System.out.println("If entering multiple items at once, use \\; to seperate each input.");

        System.out.println("What's Your Name:");
        name = scan.next();
        resume.setName(name);

        System.out.println("What's Your Address:");
        address = scan.next();
        resume.setAddress(address);

        System.out.println("What's Your Phone:");
        phone = scan.next();
        resume.setPhone(phone);

        System.out.println("What's Your Email:");
        email = scan.next();
        resume.setEmail(email);

        System.out.println("What's Your Objective:");
        objective = scan.next();
        resume.setObjective(objective);

        System.out.println("What's Your Education:");
        education = scan.next();
        resume.setEducation(education);

        System.out.println("What's Your Work Experience:");
        workExperience = scan.next();
        resume.setWorkExperience(workExperience);

        System.out.println("What's Your Skills:");
        skills = scan.next();
        resume.setSkills(skills);

        System.out.println("What's Your Certifications:");
        certifications = scan.next();
        resume.setCertification(certifications);

        System.out.println("What's Your Volunteering Experiencing:");
        volunteering = scan.next(); 
        resume.setVolunteering(volunteering);  
        


    }
}