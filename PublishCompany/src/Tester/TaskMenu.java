package Tester;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import CustomException.CustomException;
import PublishCompany.Book;
import PublishCompany.Publication;
import ValidationUtils.ValidationRules;
public class TaskMenu {
	public static void main(String[] args) throws CustomException {
		Map<String, Publication> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("Choose Task to be performed!\n" + "1.Publish New Book\n" + "2.Publish new tape\n"
					+ "3.List all book publication ordered by publish date in descending order\n"
					+ "4.List top 5 publications of current year based on ratings\n"
					+ "5.Remove all publications which are 5 years old\n" + "6.Display all available publications!\n"
					+ "0.Exit");
			switch (sc.nextInt()) {
			case 1:
//				Book b1 = new Book("REWrerwg", 34435, LocalDate.parse("1999-11-03"), 10, 360);
//				Book b2 = new Book("sdgjh", 15452, LocalDate.parse("2023-12-11"), 05, 255);
//				Book b3 = new Book("asjui", 57415, LocalDate.parse("2003-05-03"), 06, 1050);
//				Book b4 = new Book("yyhasgdjh", 96544, LocalDate.parse("2007-08-08"), 02, 257);
//				Book b5 = new Book("zsg", 1254, LocalDate.parse("2023-03-19"), 9, 369);
//				map.put(b1.getId(), b1);
//				map.put(b2.getId(), b2);
//				map.put(b3.getId(), b3);
//				map.put(b4.getId(), b4);
//				map.put(b5.getId(), b5);

				System.out.println("Enter sll details\n"
						+ "Name , price, PublishDate, rating, pages");
				Book b1=ValidationRules.validateAllInputs(sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt(),map);
				break;

			case 2:
//				Tape t1 = new Tape("REWrerwg", 34435, LocalDate.parse("1999-11-03"), 10, 1.25);
//				Tape t2 = new Tape("sdgjh", 15452, LocalDate.parse("2000-12-11"), 05, 5.3);
//				Tape t3 = new Tape("asjui", 57415, LocalDate.parse("2023-05-03"), 06, 6.54);
//				Tape t4 = new Tape("yyhasgdjh", 96544, LocalDate.parse("2023-08-08"), 02, 6.88);
//				Tape t5 = new Tape("zsg", 1254, LocalDate.parse("2023-03-19"), 9, 9.54);
//				map.put(t1.getId(), t1);
//				map.put(t2.getId(), t2);
//				map.put(t3.getId(), t3);
//				map.put(t4.getId(), t4);
//				map.put(t5.getId(), t5);
				break;

			case 3:
				System.out.println("List all book publication ordered by publish date in descending order\n");
				map.values().stream()
				.filter(p -> p instanceof Book).sorted(Comparator.comparing(Publication::getPublishDate)).forEach(p->System.out.println(p));
				
				break;

			case 4:
				System.out.println("List top 5 publications of current year based on ratings\n");
				
				map.values().stream()
				.filter(p->p.getPublishDate().getYear()==LocalDate.now().getYear())
				.sorted(Comparator.comparing(Publication::getRating).reversed())
				.forEach(p -> System.out.println(p));
				break;

				
				
			case 5:
				System.out.println("Remove all publications which are 5 years old");
				LocalDate fiveYrsAgo = LocalDate.now().minusYears(5);
				System.out.println(map.values().removeIf(p -> p.getPublishDate().isBefore(fiveYrsAgo)));
				break;
			case 6:
				map.values().forEach(p -> System.out.println(p));
				break;
			case 0:

				exit = true;

			default:
				exit = true;
			}

		}
	}
}
