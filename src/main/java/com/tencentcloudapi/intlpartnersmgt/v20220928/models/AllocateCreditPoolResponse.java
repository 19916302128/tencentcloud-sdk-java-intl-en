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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateCreditPoolResponse extends AbstractModel {

    /**
    * Current total remaining quota.
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * Total allocated quota.
    */
    @SerializedName("TotalCredit")
    @Expose
    private Float TotalCredit;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Current total remaining quota. 
     * @return RemainingCredit Current total remaining quota.
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set Current total remaining quota.
     * @param RemainingCredit Current total remaining quota.
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
    }

    /**
     * Get Total allocated quota. 
     * @return TotalCredit Total allocated quota.
     */
    public Float getTotalCredit() {
        return this.TotalCredit;
    }

    /**
     * Set Total allocated quota.
     * @param TotalCredit Total allocated quota.
     */
    public void setTotalCredit(Float TotalCredit) {
        this.TotalCredit = TotalCredit;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public AllocateCreditPoolResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateCreditPoolResponse(AllocateCreditPoolResponse source) {
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.TotalCredit != null) {
            this.TotalCredit = new Float(source.TotalCredit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "TotalCredit", this.TotalCredit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
