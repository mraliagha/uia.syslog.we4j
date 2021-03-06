/*******************************************************************************
 * Copyright 2017 UIA
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package uia.syslog.we;

import java.util.Locale;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import uia.syslog.we.model.WindowsEvent5058;

public class WindowsEvent5058Test extends WindowsEventTest {

    @Test
    public void testObject() throws Exception {
        String content = "Subject: " +
                "Security ID: S-1-5-20 " +
                "Account Name: 103PRSDB " +
                "Account Domain: WORKGROUP " +
                "Logon ID: 0x3e4 " +
                "Cryptographic Parameters: " +
                "Provider Name: Microsoft Software Key Storage Provider " +
                "Algorithm Name: 無法使用。 " +
                "Key Name: TSSecKeySet1 " +
                "Key Type: 電腦金鑰。 " +
                "Key File Operation Information: " +
                "File Path: C:\\ProgramData\\Microsoft\\Crypto\\RSA\\MachineKeys\\3edd-4e4b571f " +
                "Operation: 從檔案讀取必要金鑰。 " +
                "Return Code: 0x0";

        WindowsEvent5058 evt = parse2Object("5058", content, Locale.US);
        Assert.assertEquals("5058", evt.getEventId());

        Assert.assertEquals("S-1-5-20", evt.getSecurityId());
        Assert.assertEquals("103PRSDB", evt.getAccountName());
        Assert.assertEquals("WORKGROUP", evt.getAccountDomain());
        Assert.assertEquals("0x3e4", evt.getLogonId());

        Assert.assertEquals("Microsoft Software Key Storage Provider", evt.getProviderName());
        Assert.assertEquals("無法使用。", evt.getAlgorithmName());
        Assert.assertEquals("TSSecKeySet1", evt.getKeyName());
        Assert.assertEquals("電腦金鑰。", evt.getKeyType());

        Assert.assertEquals("C:\\ProgramData\\Microsoft\\Crypto\\RSA\\MachineKeys\\3edd-4e4b571f", evt.getFilePath());
        Assert.assertEquals("從檔案讀取必要金鑰。", evt.getOperation());
        Assert.assertEquals("0x0", evt.getReturnCode());
    }

    @Test
    public void testUS() throws Exception {
        String content = "Subject: " +
                "Security ID: S-1-5-20 " +
                "Account Name: 103PRSDB " +
                "Account Domain: WORKGROUP " +
                "Logon ID: 0x3e4 " +
                "Cryptographic Parameters: " +
                "Provider Name: Microsoft Software Key Storage Provider " +
                "Algorithm Name: 無法使用。 " +
                "Key Name: TSSecKeySet1 " +
                "Key Type: 電腦金鑰。 " +
                "Key File Operation Information: " +
                "File Path: C:\\ProgramData\\Microsoft\\Crypto\\RSA\\MachineKeys\\3edd-4e4b571f " +
                "Operation: 從檔案讀取必要金鑰。 " +
                "Return Code: 0x0";

        Assert.assertNotNull(parse2Map("5058", content, Locale.US));
    }

    @Test
    public void testTW() throws Exception {
        String content = "主旨: " +
                "安全性識別碼: S-1-5-20 " +
                "帳戶名稱: 103PRSDB " +
                "帳戶網域: WORKGROUP " +
                "登入識別碼: 0x3e4 " +
                "加密編譯參數: " +
                "提供者名稱: Microsoft Software Key Storage Provider " +
                "演算法名稱: 無法使用。 " +
                "金鑰名稱: TSSecKeySet1 " +
                "金鑰類型: 電腦金鑰。 " +
                "金鑰檔案操作資訊: " +
                "檔案路徑: C:\\ProgramData\\Microsoft\\Crypto\\RSA\\MachineKeys\\3edd-4e4b571f " +
                "操作: 從檔案讀取必要金鑰。 " +
                "傳回碼: 0x0";

        Assert.assertNotNull(parse2Map("5058", content, Locale.TAIWAN));
    }

    @Override
    protected void validate(Map<String, Object> result) {
        Assert.assertEquals(result.get("securityId"), "S-1-5-20");
        Assert.assertEquals(result.get("accountName"), "103PRSDB");
        Assert.assertEquals(result.get("accountDomain"), "WORKGROUP");
        Assert.assertEquals(result.get("logonId"), "0x3e4");

        Assert.assertEquals(result.get("providerName"), "Microsoft Software Key Storage Provider");
        Assert.assertEquals(result.get("algorithmName"), "無法使用。");
        Assert.assertEquals(result.get("keyName"), "TSSecKeySet1");
        Assert.assertEquals(result.get("keyType"), "電腦金鑰。");

        Assert.assertEquals(result.get("filePath"), "C:\\ProgramData\\Microsoft\\Crypto\\RSA\\MachineKeys\\3edd-4e4b571f");
        Assert.assertEquals(result.get("operation"), "從檔案讀取必要金鑰。");
        Assert.assertEquals(result.get("returnCode"), "0x0");
    }
}
