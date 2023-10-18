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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientIp extends AbstractModel {

    /**
    * Specifies whether to enable client IP header
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Name of the origin-pull client IP request header
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
     * Get Specifies whether to enable client IP header
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Switch Specifies whether to enable client IP header
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Specifies whether to enable client IP header
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Switch Specifies whether to enable client IP header
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Name of the origin-pull client IP request header
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HeaderName Name of the origin-pull client IP request header
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set Name of the origin-pull client IP request header
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HeaderName Name of the origin-pull client IP request header
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public ClientIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientIp(ClientIp source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

