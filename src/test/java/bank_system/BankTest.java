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
  public void testOSSpecificSeparator() {
    char expectedSeparator = '\\';
    char actualSeparator = java.io.File.separatorChar;
    org.junit.jupiter.api.Assertions.assertEquals(expectedSeparator, actualSeparator,
            "Lỗi: Hệ điều hành này không sử dụng dấu gạch chéo ngược của Windows!");
  }
}