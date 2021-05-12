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

public class DescribeProxyDetailRequest extends AbstractModel{

    /**
    * Connection ID to be queried.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get Connection ID to be queried. 
     * @return ProxyId Connection ID to be queried.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID to be queried.
     * @param ProxyId Connection ID to be queried.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    public DescribeProxyDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyDetailRequest(DescribeProxyDetailRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

