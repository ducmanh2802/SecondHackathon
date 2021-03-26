import java.util.*;

public class ArrayListExcercise {
    public static void main(String[] args) throws Exception {
        /*
         * Hãy viết một ứng dụng dạng Console nhập từ bàn phím cho đến khi người dùng gõ
         * ký tự 'Q' hoặc 'q' Nếu chuỗi ký tự nhập vào có thể chuyển thành số tự nhiên,
         * thì hãy sắp xếp theo thứ tự tăng dần. Ví dụ nhập vào: 3 1 5 7 8 2 q Mảng ngay
         * sau khi nhập sẽ là 1, 2, 3, 5, 7, 8
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị vào: ");
        String input = sc.next();
        ArrayList<String> list = new ArrayList<>();
        while (!input.toLowerCase().equals("q")) {
            list.add(input);
            System.out.println("Nhập giá trị vào: ");
            input = sc.next();
        }
        if (input.toLowerCase().equals("q")) {
            Collections.sort(list);
            for (String element : list) {
                System.out.println(element);
            }
        }
        sc.close();
    }
}
