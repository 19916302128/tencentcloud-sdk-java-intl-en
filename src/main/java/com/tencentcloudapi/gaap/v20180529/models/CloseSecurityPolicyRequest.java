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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseSecurityPolicyRequest extends AbstractModel{

    /**
    * Connection ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Security group policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get Connection ID 
     * @return ProxyId Connection ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID
     * @param ProxyId Connection ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Security group policy ID 
     * @return PolicyId Security group policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Security group policy ID
     * @param PolicyId Security group policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public CloseSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseSecurityPolicyRequest(CloseSecurityPolicyRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

