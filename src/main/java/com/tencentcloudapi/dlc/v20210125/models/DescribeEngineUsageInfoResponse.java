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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEngineUsageInfoResponse extends AbstractModel {

    /**
    * The total cluster spec.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The used cluster spec.
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * The available cluster spec.
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total cluster spec. 
     * @return Total The total cluster spec.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total cluster spec.
     * @param Total The total cluster spec.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The used cluster spec. 
     * @return Used The used cluster spec.
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set The used cluster spec.
     * @param Used The used cluster spec.
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get The available cluster spec. 
     * @return Available The available cluster spec.
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set The available cluster spec.
     * @param Available The available cluster spec.
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEngineUsageInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEngineUsageInfoResponse(DescribeEngineUsageInfoResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

