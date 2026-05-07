package bank_system;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BankTest {
  @Test
  public void testInitialBalance() {
    // Kiểm tra xem tài khoản khởi tạo có đúng số dư không
    Account account = new CheckingAccount(101, 500.0);
    assertEquals(500.0, account.getBalance(), "Số dư khởi tạo phải là 500");
  }
  @Test
  public void testFilePathFailure() {
    // Cố tình dùng dấu gạch chéo ngược kiểu Windows
    String path = "src\\main\\resources\\data.txt";

    java.io.File file = new java.io.File(path);
    org.junit.jupiter.api.Assertions.assertTrue(file.getPath().contains("\\"),
            "Đường dẫn này chỉ đúng trên Windows!");
  }
}