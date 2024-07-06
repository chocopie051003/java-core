//- Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc
//biệt
//Ví dụ hợp lệ: 099145697413
//không hợp lệ: 09914569741a (chứa ký tự là chữ số)
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class bai18 {
    public static void main(String[] args) {
    Pattern pattern = Pattern.compile("[0-9]{12}");
    Matcher matcher = pattern.matcher("123456789123");
    System.out.println("Input String matches regex - "+matcher.matches());
    }
}
