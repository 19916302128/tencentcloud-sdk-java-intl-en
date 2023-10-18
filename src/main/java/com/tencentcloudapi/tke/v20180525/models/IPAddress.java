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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPAddress extends AbstractModel {

    /**
    * Type. Valid values: `advertise`, `public`, and others
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * IP Address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Network port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get Type. Valid values: `advertise`, `public`, and others 
     * @return Type Type. Valid values: `advertise`, `public`, and others
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values: `advertise`, `public`, and others
     * @param Type Type. Valid values: `advertise`, `public`, and others
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get IP Address 
     * @return Ip IP Address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP Address
     * @param Ip IP Address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Network port 
     * @return Port Network port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Network port
     * @param Port Network port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public IPAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPAddress(IPAddress source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

