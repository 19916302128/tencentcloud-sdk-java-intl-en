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

public class DescribeVulLevelSummaryResponse extends AbstractModel {

    /**
    * Number of high-risk vulnerabilities
    */
    @SerializedName("HighLevelVulCount")
    @Expose
    private Long HighLevelVulCount;

    /**
    * Number of medium-risk vulnerabilities
    */
    @SerializedName("MediumLevelVulCount")
    @Expose
    private Long MediumLevelVulCount;

    /**
    * Number of low-risk vulnerabilities
    */
    @SerializedName("LowLevelVulCount")
    @Expose
    private Long LowLevelVulCount;

    /**
    * Number of critical vulnerabilities
    */
    @SerializedName("CriticalLevelVulCount")
    @Expose
    private Long CriticalLevelVulCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of high-risk vulnerabilities 
     * @return HighLevelVulCount Number of high-risk vulnerabilities
     */
    public Long getHighLevelVulCount() {
        return this.HighLevelVulCount;
    }

    /**
     * Set Number of high-risk vulnerabilities
     * @param HighLevelVulCount Number of high-risk vulnerabilities
     */
    public void setHighLevelVulCount(Long HighLevelVulCount) {
        this.HighLevelVulCount = HighLevelVulCount;
    }

    /**
     * Get Number of medium-risk vulnerabilities 
     * @return MediumLevelVulCount Number of medium-risk vulnerabilities
     */
    public Long getMediumLevelVulCount() {
        return this.MediumLevelVulCount;
    }

    /**
     * Set Number of medium-risk vulnerabilities
     * @param MediumLevelVulCount Number of medium-risk vulnerabilities
     */
    public void setMediumLevelVulCount(Long MediumLevelVulCount) {
        this.MediumLevelVulCount = MediumLevelVulCount;
    }

    /**
     * Get Number of low-risk vulnerabilities 
     * @return LowLevelVulCount Number of low-risk vulnerabilities
     */
    public Long getLowLevelVulCount() {
        return this.LowLevelVulCount;
    }

    /**
     * Set Number of low-risk vulnerabilities
     * @param LowLevelVulCount Number of low-risk vulnerabilities
     */
    public void setLowLevelVulCount(Long LowLevelVulCount) {
        this.LowLevelVulCount = LowLevelVulCount;
    }

    /**
     * Get Number of critical vulnerabilities 
     * @return CriticalLevelVulCount Number of critical vulnerabilities
     */
    public Long getCriticalLevelVulCount() {
        return this.CriticalLevelVulCount;
    }

    /**
     * Set Number of critical vulnerabilities
     * @param CriticalLevelVulCount Number of critical vulnerabilities
     */
    public void setCriticalLevelVulCount(Long CriticalLevelVulCount) {
        this.CriticalLevelVulCount = CriticalLevelVulCount;
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

    public DescribeVulLevelSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulLevelSummaryResponse(DescribeVulLevelSummaryResponse source) {
        if (source.HighLevelVulCount != null) {
            this.HighLevelVulCount = new Long(source.HighLevelVulCount);
        }
        if (source.MediumLevelVulCount != null) {
            this.MediumLevelVulCount = new Long(source.MediumLevelVulCount);
        }
        if (source.LowLevelVulCount != null) {
            this.LowLevelVulCount = new Long(source.LowLevelVulCount);
        }
        if (source.CriticalLevelVulCount != null) {
            this.CriticalLevelVulCount = new Long(source.CriticalLevelVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighLevelVulCount", this.HighLevelVulCount);
        this.setParamSimple(map, prefix + "MediumLevelVulCount", this.MediumLevelVulCount);
        this.setParamSimple(map, prefix + "LowLevelVulCount", this.LowLevelVulCount);
        this.setParamSimple(map, prefix + "CriticalLevelVulCount", this.CriticalLevelVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

