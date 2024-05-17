public class SwitchCaseExam{
	public static void main(String args[]){
	String month = args[0];
	switch(month){
		case "Jan":
		case "Feb":
		case "Mar":
			System.out.println(month + " is a month of the Spring");

		break;
// be continued next 	page ...
		case "Apr":
		case "May":
		case "Jun":
		System.out.println(month + " is a month of the Summer");
		break;
		case "Jul":
		case "Aug":
		case "Sep":
		System.out.println(month + " is a month of the Fall");

		break;
		default:
		System.out.println(month + " is a month of the Winter");

	}
	}
}