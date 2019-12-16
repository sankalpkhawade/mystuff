
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm:ssa");
		LocalDateTime date1 = LocalDateTime.parse(date,formatter);
		LocalDateTime pres = LocalDateTime.now();
		Duration dur = Duration.between(date1, pres);
		if(dur.getSeconds()<60){
			System.out.println("Few Seconds ago");
		}else if(dur.toMinutes()>1 && dur.toMinutes()<60){
			System.out.println(dur.toMinutes()+" minutes ago");
		}else if(dur.toHours()>1 && dur.toHours()<8){
			System.out.println(dur.toHours()+" hours ago");
		}
		
	}

}
