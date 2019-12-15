public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);

        System.out.println(sumDigits(2112342342));
    }

    public static Integer sumDigits(Integer number) {
        //@TODO: write code here

        int sum = 0;
        String a = Integer.toString(number);
        int b = a.length();
        for (int i = 0; i < b; i++) {
            sum = Integer.parseInt(Character.toString(a.charAt(i))) + sum;
        }
        return sum;
    }
}
