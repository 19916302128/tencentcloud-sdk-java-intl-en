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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableCcnRoutesRequest extends AbstractModel {

    /**
    * The CCN instance ID, such as `ccn-f49l6u0z`.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
    */
    @SerializedName("RouteIds")
    @Expose
    private String [] RouteIds;

    /**
     * Get The CCN instance ID, such as `ccn-f49l6u0z`. 
     * @return CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The CCN instance ID, such as `ccn-f49l6u0z`.
     * @param CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`. 
     * @return RouteIds The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
     */
    public String [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
     * @param RouteIds The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
     */
    public void setRouteIds(String [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    public DisableCcnRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableCcnRoutesRequest(DisableCcnRoutesRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.RouteIds != null) {
            this.RouteIds = new String[source.RouteIds.length];
            for (int i = 0; i < source.RouteIds.length; i++) {
                this.RouteIds[i] = new String(source.RouteIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);

    }
}

