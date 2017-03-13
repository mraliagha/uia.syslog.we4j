package uia.syslog.we;

import java.util.Locale;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WindowsEvent4658Test extends WindowsEventTest {
	
	@Test
	public void testUS() throws Exception{
		String content = "Subject: " +
				"Security ID:  ACME\\Administrator " +
				"Account Name:  Administrator " +
				"Account Domain:  ACME " +
				"Logon ID:  0x1f41e " +
				"Object: " +
				"Object Server: Security " +
				"Handle ID: 0x40 " +
				"Process Information: " +
				"Process ID: 0x1ac " +
				"Process Name: C:\\Windows\\System32\\cmd.exe ";
		
		test("4658", content, Locale.US);
	}

	@Test
	public void testTW() throws Exception{
		String content = "主旨: " + 
				"安全性識別碼:  ACME\\Administrator " +
				"帳戶名稱:  Administrator " +
				"帳戶網域:  ACME " +
				"登入識別碼:  0x1f41e " +
				"物件: " +
				"物件伺服器: Security " +
				"控制代碼識別碼: 0x40 " +
				"處理程序資訊: " +
				"處理程序識別碼: 0x1ac " +
				"處理程序名稱: C:\\Windows\\System32\\cmd.exe ";
		
		test("4658", content, Locale.TAIWAN);
	}
	
	@Override
	protected void validate(Map<String, Object> result) {
		Assert.assertEquals(result.get("securityId"), "ACME\\Administrator");
		Assert.assertEquals(result.get("accountName"), "Administrator");
		Assert.assertEquals(result.get("accountDomain"), "ACME");
		Assert.assertEquals(result.get("logonId"), "0x1f41e");
		Assert.assertEquals(result.get("objectServer"), "Security");
		Assert.assertEquals(result.get("handleId"), "0x40");
		Assert.assertEquals(result.get("processId"), "0x1ac");
		Assert.assertEquals(result.get("processName"), "C:\\Windows\\System32\\cmd.exe");
	}
}