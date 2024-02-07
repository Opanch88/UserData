public class ExclusionInput extends Exception {
    public static void exceptionIn() {
        System.out.println("""
                Invalid input. Please provide all required data.in the format of:\s
                    lastName space
                    firstName space
                    patronymic space
                    dateBirth (<yyyy-mm-dd>) space
                    phoneNumber space
                    gender (MALE or FEMALE);""");
    }
}
