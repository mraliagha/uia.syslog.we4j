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
package uia.syslog.we.model;

/**
 * An attempt was made to duplicate a handle to an object
 *
 * @author Kyle K. Lin
 *
 */
public class WindowsEvent4690 extends WindowsEvent {

    private String securityId;

    private String accountName;

    private String accountDomain;

    private String logonId;

    private String sourceHandleId;

    private String sourceProcessId;

    private String targetHandleId;

    private String targetProcessId;

    public WindowsEvent4690() {
        super("Security-Auditing", "4690");
    }

    public String getSecurityId() {
        return this.securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountDomain() {
        return this.accountDomain;
    }

    public void setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
    }

    public String getLogonId() {
        return this.logonId;
    }

    public void setLogonId(String logonId) {
        this.logonId = logonId;
    }

    public String getSourceHandleId() {
        return this.sourceHandleId;
    }

    public void setSourceHandleId(String sourceHandleId) {
        this.sourceHandleId = sourceHandleId;
    }

    public String getSourceProcessId() {
        return this.sourceProcessId;
    }

    public void setSourceProcessId(String sourceProcessId) {
        this.sourceProcessId = sourceProcessId;
    }

    public String getTargetHandleId() {
        return this.targetHandleId;
    }

    public void setTargetHandleId(String targetHandleId) {
        this.targetHandleId = targetHandleId;
    }

    public String getTargetProcessId() {
        return this.targetProcessId;
    }

    public void setTargetProcessId(String targetProcessId) {
        this.targetProcessId = targetProcessId;
    }

}