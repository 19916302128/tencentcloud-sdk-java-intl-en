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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseProxyRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database proxy u200dgroup ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Whether only to disable read/write separation. Valid values: `true`, `false`.
    */
    @SerializedName("OnlyCloseRW")
    @Expose
    private Boolean OnlyCloseRW;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database proxy u200dgroup ID 
     * @return ProxyGroupId Database proxy u200dgroup ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database proxy u200dgroup ID
     * @param ProxyGroupId Database proxy u200dgroup ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Whether only to disable read/write separation. Valid values: `true`, `false`. 
     * @return OnlyCloseRW Whether only to disable read/write separation. Valid values: `true`, `false`.
     */
    public Boolean getOnlyCloseRW() {
        return this.OnlyCloseRW;
    }

    /**
     * Set Whether only to disable read/write separation. Valid values: `true`, `false`.
     * @param OnlyCloseRW Whether only to disable read/write separation. Valid values: `true`, `false`.
     */
    public void setOnlyCloseRW(Boolean OnlyCloseRW) {
        this.OnlyCloseRW = OnlyCloseRW;
    }

    public CloseProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseProxyRequest(CloseProxyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.OnlyCloseRW != null) {
            this.OnlyCloseRW = new Boolean(source.OnlyCloseRW);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "OnlyCloseRW", this.OnlyCloseRW);

    }
}

