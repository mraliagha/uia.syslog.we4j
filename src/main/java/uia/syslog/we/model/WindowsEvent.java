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

import java.util.Date;

/**
 * System log.
 *
 * @author Kyle K. Lin
 *
 */
public abstract class WindowsEvent {

    // private String hostAddr;

    private String hostName;

    private String logInfo;

    private Date timestamp;

    private String eventSource;

    private String eventId;

    /**
     * Constructor.
     *
     * @param eventSource
     * @param eventId
     */
    public WindowsEvent(String eventSource, String eventId) {
        this.eventSource = eventSource;
        this.eventId = eventId;
    }

    public String getEventSource() {
        return this.eventSource;
    }

    public String getEventId() {
        return this.eventId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    public String getHostAddr() {
        return this.hostAddr;
    }

    public void setHostAddr(String hostAddr) {
        this.hostAddr = hostAddr;
    }
    */

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getLogInfo() {
        return this.logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }
}