package task;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import entity.Student;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task {
    public static List<Student> read(Sheets sheetsService, String spreadsheetId, String range) throws IOException {
        List<Student> students = new LinkedList<>();

        ValueRange response = sheetsService.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();

        List<List<Object>> values = response.getValues();

        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
            for (List row: values) {
                students.add(new Student(
                        row.get(0).toString(),
                        row.get(1).toString(),
                        row.get(2).toString(),
                        row.get(3).toString(),
                        row.get(4).toString(),
                        row.get(5).toString())
                );
            }
        }

        return students;
    }

    public static void add(Sheets sheetsService, String spreadsheetId, Student student) throws IOException {
        ValueRange appendStudent = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(
                                student.getName(),
                                student.getGender(),
                                student.getClassLevel(),
                                student.getHomeState(),
                                student.getMajor(),
                                student.getExtracurricularActivity()
                        )
                ));

        sheetsService.spreadsheets().values()
                .append(spreadsheetId, "congress", appendStudent)
                .setValueInputOption("USER_ENTERED")
                .setInsertDataOption("INSERT_ROWS")
                .setIncludeValuesInResponse(true)
                .execute();
    }
}
