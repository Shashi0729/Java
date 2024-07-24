public class JobApplicationRunner{
  public static void main(String[] args) {
   String[] skills ={"Java", "Python"};
    JobApplication application1 = new JobApplication("Pratiksha", 25, "BE", 80.0, 60.0,skills , "Software Engineer", "Software Developer");
    application1.checkAgeEligibility();
    application1.checkSoftwareJobEligibility();
    application1.checkJavaDeveloperEligibility();
    application1.calculateSslcPercentage(491,625);
    application1.checkSoftwareDeveloperEligibility();


    String[] skills2 = {"C++", "JavaScript"};
    JobApplication application2 = new JobApplication("Anamica", 22, "MCA", 70.0, 55.0, skills2, "Software Tester", "Software Developer");
    application2.checkAgeEligibility();
    application2.checkSoftwareJobEligibility();
    application2.checkJavaDeveloperEligibility();
    application2.calculateSslcPercentage(300,625);
    application2.checkSoftwareDeveloperEligibility();
  }
}

