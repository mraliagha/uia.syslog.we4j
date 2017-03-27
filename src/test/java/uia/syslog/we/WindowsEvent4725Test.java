package uia.syslog.we;

import java.util.Locale;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WindowsEvent4725Test extends WindowsEventTest {

    @Test
    public void testUS() throws Exception {
		String content = "Subject: " +
				"Security ID:  SYSTEM " +
				"Account Name:  ONE " +
				"Account Domain:  WORKGROUP " +
				"Logon ID:  0x1f41e " +
				"Target Account: " +
				"Security ID:  MAIN\\Jack " +
				"Account Name:  Jack " +
				"Account Domain:  MAIN";

        test("4725", content, Locale.US);
    }

    @Test
    public void testTW() throws Exception {
		String content = "主旨: " + 
				"安全性識別碼:  SYSTEM " +
				"帳戶名稱:  ONE " +
				"帳戶網域:  WORKGROUP " +
				"登入識別碼:  0x1f41e " +
				"目標帳戶: " +
				"安全性識別碼:  MAIN\\Jack " +
				"帳戶名稱:  Jack " +
				"帳戶網域:  MAIN ";

        test("4725", content, Locale.TAIWAN);
    }

    @Override
    protected void validate(Map<String, Object> result) {
		Assert.assertEquals(result.get("securityId"), "SYSTEM");
		Assert.assertEquals(result.get("accountName"), "ONE");
		Assert.assertEquals(result.get("accountDomain"), "WORKGROUP");
		Assert.assertEquals(result.get("logonId"), "0x1f41e");
		Assert.assertEquals(result.get("targetSecurityId"), "MAIN\\Jack");
		Assert.assertEquals(result.get("targetAccountName"), "Jack");
		Assert.assertEquals(result.get("targetAccountDomain"), "MAIN");
    }
}