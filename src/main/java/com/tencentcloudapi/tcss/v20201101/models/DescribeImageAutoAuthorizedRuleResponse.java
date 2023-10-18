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

public class DescribeImageAutoAuthorizedRuleResponse extends AbstractModel {

    /**
    * Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * Number of servers when the scope is `MANUAL`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Maximum number of image licenses per day. `0`: Unlimited.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDailyCount")
    @Expose
    private Long MaxDailyCount;

    /**
    * Rule ID, which is `0` if not specified.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the rule takes effect. Valid values: `0` (no); `1` (yes). 
     * @return IsEnabled Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     * @param IsEnabled Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RangeType Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RangeType Scope. Valid values: `MANUAL` (specified servers); `ALL` (all images).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get Number of servers when the scope is `MANUAL`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCount Number of servers when the scope is `MANUAL`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of servers when the scope is `MANUAL`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCount Number of servers when the scope is `MANUAL`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Maximum number of image licenses per day. `0`: Unlimited.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxDailyCount Maximum number of image licenses per day. `0`: Unlimited.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDailyCount() {
        return this.MaxDailyCount;
    }

    /**
     * Set Maximum number of image licenses per day. `0`: Unlimited.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxDailyCount Maximum number of image licenses per day. `0`: Unlimited.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDailyCount(Long MaxDailyCount) {
        this.MaxDailyCount = MaxDailyCount;
    }

    /**
     * Get Rule ID, which is `0` if not specified.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Rule ID, which is `0` if not specified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID, which is `0` if not specified.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Rule ID, which is `0` if not specified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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

    public DescribeImageAutoAuthorizedRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAutoAuthorizedRuleResponse(DescribeImageAutoAuthorizedRuleResponse source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.MaxDailyCount != null) {
            this.MaxDailyCount = new Long(source.MaxDailyCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "MaxDailyCount", this.MaxDailyCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

