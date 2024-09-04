package Day04;

public class SwitchCaseExample {
    public static void main(String[] args) {

        System.out.println(
                switch (args[0]) {
                    case "월요일" -> "Start of the work week";
                    case "금요일" -> "Almost weekend";
                    default -> "Midweek";
                }
        );
        /*
        switch (args[0]) {
            case "월요일":
                System.out.println("start of the work week");
                break;
            case "금요일":
                System.out.println("Almost weekend");
                break;
            default:
                System.out.println("midweek");
                break;
        }
        */
    }
}
