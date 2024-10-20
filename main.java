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
        System.out.println("If entering multiple items at once, use \";\" to seperate each input. If you have nothing to put in a category please enter \"none\"");
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------\n");

        System.out.println("What's Your Name:");
        name = scan.nextLine();
        resume.setName(name);

        System.out.println("What's Your Address:");
        address = scan.nextLine();
        resume.setAddress(address);

        System.out.println("What's Your Phone:");
        phone = scan.nextLine();
        resume.setPhone(phone);

        System.out.println("What's Your Email:");
        email = scan.nextLine();
        resume.setEmail(email);

        System.out.println("What's Your Objective:");
        objective = scan.nextLine();
        resume.setObjective(objective);

        System.out.println("What's Your Education:");
        education = scan.nextLine();
        resume.setEducation(education);

        System.out.println("What's Your Work Experience:");
        workExperience = scan.nextLine();
        resume.setWorkExperience(workExperience);

        System.out.println("What's Your Skills:");
        skills = scan.nextLine();
        resume.setSkills(skills);

        System.out.println("What's Your Certifications:");
        certifications = scan.nextLine();
        resume.setCertification(certifications);

        System.out.println("What's Your Volunteering Experiencing:");
        volunteering = scan.nextLine(); 
        resume.setVolunteering(volunteering);  

        resume.print();
        
        System.out.println("Resume created! Check the directory for the seperate text file labled \"resume.txt\" containing your brand new resume!");


    }
}
