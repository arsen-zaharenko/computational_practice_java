package run;

import action.SheetsGetter;
import com.google.api.services.sheets.v4.Sheets;
import entity.Student;
import task.Task;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class Main {
    private static final String SPREADSHEET_ID = "1YcFgajkOvKnS5r9O054rqrnACnqloooMr4iKjDA31Sw";
    private static final String RANGE  = "Class Data!A2:F";

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        Sheets sheetsService = SheetsGetter.getSheetsService();

        //write data
        Task.add(sheetsService, SPREADSHEET_ID, new Student("John","Male","4. Senior","LA","Math","Football"));

        //read data
        List<Student> students = Task.read(sheetsService, SPREADSHEET_ID, RANGE);

        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student + "\n");
            }
        } else {
            System.out.println("List is empty.");
        }
    }
}
