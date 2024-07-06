//- Email : cần có ký tự @ và dấu chấm (.)
//ví dụ hợp lệ: eric@hoidanit.com.vn
//không hợp lệ: abc#blabla (không chứa @ và dấu chấm)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai20 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
        Matcher matcher = pattern.matcher("Kieuhieu@vnua.edu.vn");
        System.out.println("Input String matches regex - " + matcher.matches());
    }
}
