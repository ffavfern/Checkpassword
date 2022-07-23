import java.io.Console;
import java.util.ArrayList;

public class CheckPassword {
    public static void main(String[] args) {
        // ประกาศตัวแปรและค่าตัวแปร
        String[] badWords = { "modern", "java" };
        String password;
        boolean ok;
        int i, j;

        // output
        System.out.println("Enter you password");
        // รับค่าเข้าเป็น String เก็บใน password
        password = System.console().readLine();
        // ประกาศ ok มีค่าเท่ากับ ถูกต้อง
        ok = true;

        // เช็คความยาว
        if (ok) { // ถ้า ok
            if (password.length() < 8) { // ถ้า password น้อยกว่า 8 ตัวอักษร
                ok = false; // ถ้าน้อยกว่า 8 ตัวอักษร ok จะเท่ากับไม่ถูกต้อง
                System.out.println("Password must more than 8 chars"); // รหัสผ่านต้องมากกว่า 8 ตัวอักษร
            }
        }
        // เช็ค bad words
        if (ok) {
            for (i = 0; i < badWords.length; i++) // ให้จำนวนของ i เท่ากับจำนวนความยาว badWorlds
                if (password.equals(badWords)) { // ถ้า password เหมือนกับ badWords
                    ok = false; // จะไม่ถูกต้อง
                    break;
                }
        }
        if (ok) {
            char[] charpass = password.toCharArray();
            ArrayList<Character> WorldNotDuplicate = new ArrayList<Character>();
            ArrayList<Character> WorldDuplicate = new ArrayList<Character>();
            for (Character v : charpass) {
                if (!WorldNotDuplicate.contains(v)) {
                    WorldNotDuplicate.add(v);
                } else {
                    WorldDuplicate.add(v);
                }
            }
            int [] WorldDuplicate(v) = new String()
            System.out.println("ค่าซ้ำใน ArrayList คือ " + WorldDuplicate.toint());
        }
        if (ok)
            System.out.println("Your password is OK"); // ถ้า password ไม่เหมือน badWorlds และมากกว่า 8 ตัวอักษร
        else
            System.out.println("Your password is NOT OK"); // ถ้า password เหมือน badWorlds หรือมากกว่า 8 ตัวอักษร
    }
}
