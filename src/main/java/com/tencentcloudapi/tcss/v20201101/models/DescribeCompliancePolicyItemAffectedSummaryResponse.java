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

public class DescribeCompliancePolicyItemAffectedSummaryResponse extends AbstractModel {

    /**
    * Aggregated information of the assets affected by each check item
    */
    @SerializedName("PolicyItemSummary")
    @Expose
    private CompliancePolicyItemSummary PolicyItemSummary;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Aggregated information of the assets affected by each check item 
     * @return PolicyItemSummary Aggregated information of the assets affected by each check item
     */
    public CompliancePolicyItemSummary getPolicyItemSummary() {
        return this.PolicyItemSummary;
    }

    /**
     * Set Aggregated information of the assets affected by each check item
     * @param PolicyItemSummary Aggregated information of the assets affected by each check item
     */
    public void setPolicyItemSummary(CompliancePolicyItemSummary PolicyItemSummary) {
        this.PolicyItemSummary = PolicyItemSummary;
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

    public DescribeCompliancePolicyItemAffectedSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePolicyItemAffectedSummaryResponse(DescribeCompliancePolicyItemAffectedSummaryResponse source) {
        if (source.PolicyItemSummary != null) {
            this.PolicyItemSummary = new CompliancePolicyItemSummary(source.PolicyItemSummary);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PolicyItemSummary.", this.PolicyItemSummary);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

