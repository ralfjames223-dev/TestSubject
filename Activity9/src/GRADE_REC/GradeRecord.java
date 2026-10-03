package GRADE_REC;

class GradeRecord {
    private String subject;
    private double[] scores;
    private double average;

    public GradeRecord(String subject, double q1, double q2, double q3) {
        this.subject = subject;

        if (q1 < 0 || q1 > 100 || q2 < 0 || q2 > 100 || q3 < 0 || q3 > 100) {
            System.out.println("Invalid Score! All scores must be between 0 and 100.");
            this.scores = new double[]{0.0, 0.0, 0.0};
            this.average = 0.0;
        } else {
            this.scores = new double[]{q1, q2, q3};
            this.average = (q1 + q2 + q3) / 3.0;
        }
    }

    public String getSubject() {
        return subject;
    }

    public double[] getScores() {
        return scores.clone();
    }

    public double getAverage() {
        return average;
    }

    public void displayReport() {
        System.out.printf("%s | Quizzes: [%.1f, %.1f, %.1f] | Average: %.2f%n", subject, scores[0], scores[1], scores[2], average);
    }

}