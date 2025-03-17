/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationHook extends AbstractModel {

    /**
    * Event.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Events")
    @Expose
    private String [] Events;

    /**
    * Callback URL.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
     * Get Event.

Note: This field may return null, indicating that no valid value is found. 
     * @return Events Event.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getEvents() {
        return this.Events;
    }

    /**
     * Set Event.

Note: This field may return null, indicating that no valid value is found.
     * @param Events Event.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setEvents(String [] Events) {
        this.Events = Events;
    }

    /**
     * Get Callback URL.

Note: This field may return null, indicating that no valid value is found. 
     * @return URL Callback URL.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Callback URL.

Note: This field may return null, indicating that no valid value is found.
     * @param URL Callback URL.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    public NotificationHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotificationHook(NotificationHook source) {
        if (source.Events != null) {
            this.Events = new String[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new String(source.Events[i]);
            }
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "URL", this.URL);

    }
}

