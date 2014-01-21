/*
 * Copyright (c) 2006, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.registry.common.beans;

import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import org.wso2.carbon.registry.common.beans.utils.EventType;

@SuppressWarnings({"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class EventTypeBean {

    private EventType[] eventTypes = null;

    private String errorMessage = null;

    public EventType[] getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(EventType[] eventTypes) {
        this.eventTypes = eventTypes;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
