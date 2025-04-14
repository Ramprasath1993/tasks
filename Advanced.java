//1: Convert a list of Strings into uppercase using map()

import java.util.*;
import java.util.stream.*;

public class UppercaseConverter {
    public static void main(String[] args) {
        List<String> names = Stream.of("abc", "d", "ef")
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());

        System.out.println("Uppercase List: " + names);
    }
}


//2: Filter non-empty strings from a list

import java.util.*;
import java.util.stream.*;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abed", "", "jkl");

        List<String> nonEmpty = strings.stream()
                                       .filter(s -> !s.isEmpty())
                                       .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmpty);
    }
}


//3: Filter student names starting with "A"

import java.util.*;
import java.util.stream.*;

public class FilterStudents {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Amit", "Ravi", "Anjali", "Pooja", "Arun", "Manoj", "Ajay", "Deepak", "Aarti", "Neha");

        List<String> studentsWithA = students.stream()
                                             .filter(name -> name.startsWith("A"))
                                             .collect(Collectors.toList());

        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}


//4: Calculate age using LocalDate

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days.");
    }
}
