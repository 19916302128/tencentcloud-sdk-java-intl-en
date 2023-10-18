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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerHealth extends AbstractModel {

    /**
    * Listener ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * List of forwarding rules of the listener
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private RuleHealth [] Rules;

    /**
     * Get Listener ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListenerId Listener ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListenerId Listener ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListenerName Listener name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListenerName Listener name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener protocol
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Listener port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Listener port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get List of forwarding rules of the listener
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rules List of forwarding rules of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RuleHealth [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of forwarding rules of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rules List of forwarding rules of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(RuleHealth [] Rules) {
        this.Rules = Rules;
    }

    public ListenerHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerHealth(ListenerHealth source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Rules != null) {
            this.Rules = new RuleHealth[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleHealth(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

