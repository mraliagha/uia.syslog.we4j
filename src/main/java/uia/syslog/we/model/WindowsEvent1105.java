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
 * The state of a transaction has changed
 *
 * @author Kyle K. Lin
 *
 */
public class WindowsEvent1105 extends WindowsEvent {

    private String logSecurity;

    private String file;

    public WindowsEvent1105() {
        super("Eventlog", "1105");
    }

    public String getLogSecurity() {
        return this.logSecurity;
    }

    public void setLogSecurity(String logSecurity) {
        this.logSecurity = logSecurity;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}