public class LinkDind {
     String profileDetails;
     String educationDetails;
     String personalDetails;
     String skills;
     int percentageOfDegree;

    public LinkDind profileDetails(String profileDetails) {
        this.profileDetails = profileDetails;
        return this;
    }

    public LinkDind educationDetails(String educationDetails) {
        this.educationDetails = educationDetails;
        return this;
    }

    public LinkDind personalDetails(String personalDetails) {
        this.personalDetails = personalDetails;
        return this;
    }

    public LinkDind skills(String skills) {
        this.skills = skills;
        return this;
    }

    public LinkDind percentageOfDegree(int percentageOfDegree) {
        this.percentageOfDegree = percentageOfDegree;
        return this;
    }

    public void displayDetails() {
        System.out.println("Profile Details: " + profileDetails);
        System.out.println("Education Details: " + educationDetails);
        System.out.println("Personal Details: " + personalDetails);
        System.out.println("Skills: " + skills);
        System.out.println("Percentage Of Degree: " + percentageOfDegree);
    }

    public static void main(String[] args) {
        LinkDind linkDind = new LinkDind();
        linkDind.profileDetails("Software Engineer");
          linkDind.educationDetails("Bachelor's Degree");
             linkDind.personalDetails("Male, 30 years old");
             linkDind.skills("Java, Python, JavaScript");
               linkDind.percentageOfDegree(80);
                linkDind.displayDetails();
    }
}


