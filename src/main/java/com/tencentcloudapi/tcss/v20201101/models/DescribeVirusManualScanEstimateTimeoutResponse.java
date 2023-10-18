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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusManualScanEstimateTimeoutResponse extends AbstractModel {

    /**
    * Estimated timeout period (hour)
    */
    @SerializedName("Timeout")
    @Expose
    private Float Timeout;

    /**
    * Number of containers scanned in parallel on a single server
    */
    @SerializedName("ContainerScanConcurrencyCount")
    @Expose
    private Long ContainerScanConcurrencyCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Estimated timeout period (hour) 
     * @return Timeout Estimated timeout period (hour)
     */
    public Float getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Estimated timeout period (hour)
     * @param Timeout Estimated timeout period (hour)
     */
    public void setTimeout(Float Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Number of containers scanned in parallel on a single server 
     * @return ContainerScanConcurrencyCount Number of containers scanned in parallel on a single server
     */
    public Long getContainerScanConcurrencyCount() {
        return this.ContainerScanConcurrencyCount;
    }

    /**
     * Set Number of containers scanned in parallel on a single server
     * @param ContainerScanConcurrencyCount Number of containers scanned in parallel on a single server
     */
    public void setContainerScanConcurrencyCount(Long ContainerScanConcurrencyCount) {
        this.ContainerScanConcurrencyCount = ContainerScanConcurrencyCount;
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

    public DescribeVirusManualScanEstimateTimeoutResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusManualScanEstimateTimeoutResponse(DescribeVirusManualScanEstimateTimeoutResponse source) {
        if (source.Timeout != null) {
            this.Timeout = new Float(source.Timeout);
        }
        if (source.ContainerScanConcurrencyCount != null) {
            this.ContainerScanConcurrencyCount = new Long(source.ContainerScanConcurrencyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ContainerScanConcurrencyCount", this.ContainerScanConcurrencyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

