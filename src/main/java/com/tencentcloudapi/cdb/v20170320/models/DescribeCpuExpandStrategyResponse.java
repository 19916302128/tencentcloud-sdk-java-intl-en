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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCpuExpandStrategyResponse extends AbstractModel {

    /**
    * Policy type. Valid values: `auto`, `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Manually expanded CPU, which is valid when `Type` is `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpandCpu")
    @Expose
    private String ExpandCpu;

    /**
    * Automatic expansion policy, which is valid when `Type` is `auto`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoStrategy")
    @Expose
    private String AutoStrategy;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Policy type. Valid values: `auto`, `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Type Policy type. Valid values: `auto`, `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Policy type. Valid values: `auto`, `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Type Policy type. Valid values: `auto`, `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Manually expanded CPU, which is valid when `Type` is `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ExpandCpu Manually expanded CPU, which is valid when `Type` is `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set Manually expanded CPU, which is valid when `Type` is `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ExpandCpu Manually expanded CPU, which is valid when `Type` is `manual`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setExpandCpu(String ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get Automatic expansion policy, which is valid when `Type` is `auto`.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return AutoStrategy Automatic expansion policy, which is valid when `Type` is `auto`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getAutoStrategy() {
        return this.AutoStrategy;
    }

    /**
     * Set Automatic expansion policy, which is valid when `Type` is `auto`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param AutoStrategy Automatic expansion policy, which is valid when `Type` is `auto`.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoStrategy(String AutoStrategy) {
        this.AutoStrategy = AutoStrategy;
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

    public DescribeCpuExpandStrategyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCpuExpandStrategyResponse(DescribeCpuExpandStrategyResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new String(source.ExpandCpu);
        }
        if (source.AutoStrategy != null) {
            this.AutoStrategy = new String(source.AutoStrategy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamSimple(map, prefix + "AutoStrategy", this.AutoStrategy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

