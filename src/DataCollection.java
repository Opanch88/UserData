import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class DataCollection {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data in the order listed:" + "\n" +
                "Last Name First Name Patronymic Date of Birth Phone Number Gender," + "\n" +
                "Separated by a space !");
        String dataNext = scanner.nextLine();
        String[] enteredData = dataNext.split("\\s");

        if (enteredData.length < 6) {
            ExclusionInput.exceptionIn();
            return;
        }
        String lastName = enteredData[0];
        String firstName = enteredData[1];
        String patronymic = enteredData[2];
        LocalDate dateBirth = LocalDate.parse(enteredData[3]);
        String phoneNumber = enteredData[4];
        try {
            if (phoneNumber.length() < 11|| !phoneNumber.matches("\\d+")) {
                throw new InvalidPhoneNumberException("Invalid phone number length. Must be at least 11 characters.");
            }
            Person.Gender gender = Person.Gender.valueOf(enteredData[5]);

            Path srcPath = Paths.get("src");

            String directoryName = "people";
            File directory = new File(srcPath.toFile(), directoryName);
            directory.mkdir();

            String fileName = directory.getAbsolutePath() + File.separator + lastName + ".txt";


            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(new Person(lastName, firstName, patronymic, dateBirth, phoneNumber, gender).toString() + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                System.out.println("File Error !!!");
            }

        } catch (InvalidPhoneNumberException e) {
            throw new RuntimeException(e);
        }

    }
}
