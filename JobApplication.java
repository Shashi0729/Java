
public class JobApplication {
   String applicantName;
   int age;
   String qualification;
   double sslcPercentage;
   double degreePercentage;
   String[] skills;
   String currentJob;
   String appliedJob;

  public JobApplication() {}

  public JobApplication(String applicantName, int age, String qualification, double sslcPercentage, double degreePercentage, String[] skills, String currentJob, String appliedJob) {
    this.applicantName = applicantName;
    this.age = age;
    this.qualification = qualification;
    this.sslcPercentage = sslcPercentage;
    this.degreePercentage = degreePercentage;
    this.skills = skills;
    this.currentJob = currentJob;
    this.appliedJob = appliedJob;
  }

  public void checkAgeEligibility() {
    if (age < 18) {
      System.out.println(applicantName + " is not eligible for the job due to age.");
    } else {
      System.out.println(applicantName + " is eligible for the job.");
    }
  }

  public void checkSoftwareJobEligibility() {
    if (age > 21 && qualification == "BE") {
      System.out.println(applicantName + " is eligible to apply for Software jobs.");
    } else {
      System.out.println(applicantName + " is not eligible to apply for Software jobs.");
    }
  }

  public void checkJavaDeveloperEligibility() {
    boolean skillMatch = false;
    for (String skill : skills) {
      if (skill=="Java") {
        skillMatch = true;
        break;
      }
    }
    if (qualification=="BE" && skillMatch) {
      System.out.println(applicantName + " is eligible to apply for Java developer.");
    } else {
      System.out.println(applicantName + " is not eligible to apply for Java developer.");
    }
  }
  
public void calculateSslcPercentage(int gotmarks, int totalmarks) {
  if (totalmarks == 0) {
    System.out.println("Cannot calculate percentage: total marks is zero");
    return;
  }
  sslcPercentage = ((double) gotmarks / totalmarks) * 100;
  System.out.println(applicantName + "'s SSLC percentage is " + sslcPercentage + "%");
}



  public void checkSoftwareDeveloperEligibility() {
    if (degreePercentage > 50.0 && qualification.equals("BE")) {
      System.out.println(applicantName + " is eligible to apply for Software developer.");
    } else {
      System.out.println(applicantName + " is not eligible to apply for Software developer.");
    }
  }
}
