import Scanner.util.java;

public class main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

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


        System.out.println("What's Your Name:");
        name = scan.next();

        System.out.println("What's Your Address:");
        address = scan.next();

        System.out.println("What's Your Phone:");
        phone = scan.next();

        System.out.println("What's Your Email:");
        email = scan.next();

        System.out.println("What's Your Objective:");
        objective = scan.next();

        System.out.println("What's Your Education:");
        education = scan.next();

        System.out.println("What's Your Work Experience:");
        workExperience = scan.next();

        System.out.println("What's Your Skills:");
        skills = scan.next();

        System.out.println("What's Your Certifications:");
        certifications = scan.next();

        System.out.println("What's Your Volunteering Experiencing:");
        volunteering = scan.next();   
        

    }
}