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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancerOverviewResponse extends AbstractModel {

    /**
    * Total number of CLB instances
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Number of CLB instances that are running
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * Number of CLB instances that are isolated
    */
    @SerializedName("IsolationCount")
    @Expose
    private Long IsolationCount;

    /**
    * Number of CLB instances that are about to expire
    */
    @SerializedName("WillExpireCount")
    @Expose
    private Long WillExpireCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of CLB instances 
     * @return TotalCount Total number of CLB instances
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of CLB instances
     * @param TotalCount Total number of CLB instances
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Number of CLB instances that are running 
     * @return RunningCount Number of CLB instances that are running
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set Number of CLB instances that are running
     * @param RunningCount Number of CLB instances that are running
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get Number of CLB instances that are isolated 
     * @return IsolationCount Number of CLB instances that are isolated
     */
    public Long getIsolationCount() {
        return this.IsolationCount;
    }

    /**
     * Set Number of CLB instances that are isolated
     * @param IsolationCount Number of CLB instances that are isolated
     */
    public void setIsolationCount(Long IsolationCount) {
        this.IsolationCount = IsolationCount;
    }

    /**
     * Get Number of CLB instances that are about to expire 
     * @return WillExpireCount Number of CLB instances that are about to expire
     */
    public Long getWillExpireCount() {
        return this.WillExpireCount;
    }

    /**
     * Set Number of CLB instances that are about to expire
     * @param WillExpireCount Number of CLB instances that are about to expire
     */
    public void setWillExpireCount(Long WillExpireCount) {
        this.WillExpireCount = WillExpireCount;
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

    public DescribeLoadBalancerOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancerOverviewResponse(DescribeLoadBalancerOverviewResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.IsolationCount != null) {
            this.IsolationCount = new Long(source.IsolationCount);
        }
        if (source.WillExpireCount != null) {
            this.WillExpireCount = new Long(source.WillExpireCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "IsolationCount", this.IsolationCount);
        this.setParamSimple(map, prefix + "WillExpireCount", this.WillExpireCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

