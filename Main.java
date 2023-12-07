public class Main {

    public static void main(String[] args) {

        String[] array1 = {"Hello", "2", "world", ":-)", ">_<", "d(O_O)b"};
        String[] array2 = {"1234", "1567", "-2", "computer science", "56", "123"};
        String[] array3 = {"Russia", "Denmark", "Kazan", "USA", "UFA", "Saratov"};

        System.out.println("-----------------------");
        System.out.println(CheckLength.checkLength(array1));
        System.out.println("-----------------------");
        System.out.println(CheckLength.checkLength(array2));
        System.out.println("-----------------------");
        System.out.println(CheckLength.checkLength(array3));
    }
}