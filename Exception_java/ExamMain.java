import java.time.LocalDateTime;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class ExamPortal {
    private LocalDateTime deadline = LocalDateTime.of(2025, 11, 3, 18, 0); // 6:00 PM deadline

    public void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format.");
        }

        if (submissionTime.isAfter(deadline)) {
            throw new LateSubmissionException("Submission failed: submission is late.");
        }

        System.out.println("Exam submitted successfully!");
    }
}

public class ExamMain {
    public static void main(String[] args) {
        ExamPortal portal = new ExamPortal();
        LocalDateTime studentTime = LocalDateTime.of(2025, 11, 3, 19, 0); // 7:00 PM

        try {
            portal.submitExam("answer.docx", studentTime);
        } catch (InvalidFileFormatException | LateSubmissionException e) {
            System.out.println(e.getMessage());
        }
    }
}
