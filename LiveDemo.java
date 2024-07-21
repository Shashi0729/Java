
public class SocialJustice {
    String title;
    String summary;
    int year;
    String category;
    String clause;
    String details;

    SocialJustice(String title) {
        this.title = title;
        System.out.println("Title: " + title);
        System.out.println("\n");
    }

    SocialJustice(String title, String summary) {
        this(title);
        this.summary = summary;
        System.out.println("Summary: " + summary);
        System.out.println("\n");
    }

    SocialJustice(String title, String summary, int year) {
        this(title, summary);
        this.year = year;
        System.out.println("Year: " + year);
        System.out.println("\n");
    }

    SocialJustice(String title, String summary, int year, String category) {
        this(title, summary, year);
        this.category = category;
        System.out.println("Category: " + category);
        System.out.println("\n");
    }

    SocialJustice(String title, String summary, int year, String category, String clause) {
        this(title, summary, year, category);
        this.clause = clause;
        System.out.println("Clause: " + clause);
        System.out.println("\n");
    }

    SocialJustice(String title, String summary, int year, String category, String clause, String details) {
        this(title, summary, year, category, clause);
        this.details = details;
        System.out.println("Details: " + details);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        SocialJustice sj = new SocialJustice("Right to Equality", "Equal treatment under the law", 1950, "Fundamental Rights", "Article 14", "Equal treatment under the law regardless of race, gender, religion, etc.");
    }
}
