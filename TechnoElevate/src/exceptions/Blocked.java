package exceptions;

public class Blocked extends RuntimeException {
String messege;
public Blocked(String messege) {
	this.messege=messege;
}

}
