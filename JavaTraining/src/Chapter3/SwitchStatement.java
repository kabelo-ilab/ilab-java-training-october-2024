package Chapter3;

public class SwitchStatement {
    public static void main(String[] args) {
        String prefix = "W";
        String day = "None";
        int departmentId = 2;
        String supervisor; //(1 - Mike, 2 - Lerato, 3 - Thabo, 4 - Carol)

//        if (prefix == "M"){
//            day = "Monday";
//        } else if (prefix == "T") {
//            day = "Tuesday";
//        }else if (prefix == "W"){
//            day = "wednesday";
//        }else{
//            day = "Day not selected";
//        }
        //switch statement
        switch (prefix){
            case "M": day = "Monday";
            break;
            case "T" : day = "Tuesday";
            break;
            case "W" : day = "Wednesday";
            break;
            default: day = "Day not selected";
        }

        //(1 - Mike, 2 - Lerato, 3 - Thabo, 4 - Carol)
        switch (departmentId){
            case 1 : supervisor = "Mike";
            break;
            case 2 : supervisor = "Lerato";
            break;
            case 3 : supervisor = "Thabo";
            break;
            case 4 : supervisor = "Carol";
            break;
            default:
                supervisor = "No supervisor";
        }

        System.out.println("Day: " + day);
        System.out.println("Department ID: " + departmentId +
                "\nSupervisor: " + supervisor);

    }
}
