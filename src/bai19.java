//Mật khẩu: có ít nhất 6 ký tự
//        ví dụ hợp lệ: 123456
//        không hợp lệ: 12345 (chứa 5 ký tự)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai19 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{6,}");
        Matcher matcher = pattern.matcher("123456789123");
        System.out.println("Input String matches regex - "+matcher.matches());
    }
}

