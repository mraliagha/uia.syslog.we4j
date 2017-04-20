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
 * A change has been made to Windows Firewall exception list. A rule was modified.
 *
 * @author Kyle K. Lin
 *
 */
public class WindowsEvent4947 extends WindowsEvent {

    private String profileChanged;

    private String ruleId;

    private String ruleName;

    public WindowsEvent4947() {
        super("Security-Auditing", "4947");
    }

    public String getProfileChanged() {
        return this.profileChanged;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public String getRuleName() {
        return this.ruleName;
    }
}
