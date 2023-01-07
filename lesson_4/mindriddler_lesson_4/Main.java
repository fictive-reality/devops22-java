package mindriddler_lesson_4;

public class Main {
    public static void main(String[] args) {
        // create a new instance of the HRSystem class
        HRSystem hrSystem = new HRSystem();

        // create a new instance of the Resume class
        Resume resume = new Resume();

        // submit the resume to the HRSystem
        hrSystem.submitResume(resume);

        // schedule an interview
        hrSystem.scheduleInterview();

        // create a new instance of the JobOffer class
        JobOffer jobOffer = new JobOffer();

        // set the salary and benefits for the job offer
        jobOffer.setSalary(50000);
        jobOffer.setBenefits(new Benefits());

        // offer the job to the candidate
        hrSystem.offerJob(jobOffer);

        // review the benefits
        hrSystem.reviewBenefits();

        // negotiate the salary
        hrSystem.negotiateSalary(55000);

        // hire the candidate
        hrSystem.hire();

        // conduct a performance review
        hrSystem.conductPerformanceReview();

        // promote the employee
        hrSystem.promote();

        // print a message to show that the employee was promoted
        System.out.println("Employee was promoted!");

        // terminate the employee
        hrSystem.terminate();

        // print a message to show that the employee was terminated
        System.out.println("Employee was terminated.");
    }
}
