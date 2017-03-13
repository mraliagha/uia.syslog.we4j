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
package uia.syslog.we.model.xml;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

/**
 *
 * @author Kyle K. Lin
 *
 */
public class PropertySetType extends AbstractPropertyType {

    @ElementListUnion({
            @ElementList(entry = "PropertySet", inline = true, type = PropertySetType.class, required = false),
            @ElementList(entry = "Property", inline = true, type = PropertyType.class, required = false)
    })
    protected List<AbstractPropertyType> propertySetOrProperty;

    public List<AbstractPropertyType> getPropertySetOrProperty() {
        if (this.propertySetOrProperty == null) {
            this.propertySetOrProperty = new ArrayList<AbstractPropertyType>();
        }
        return this.propertySetOrProperty;
    }

}
