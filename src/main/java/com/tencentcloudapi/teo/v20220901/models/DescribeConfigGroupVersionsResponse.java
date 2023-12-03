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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigGroupVersionsResponse extends AbstractModel {

    /**
    * Total versions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Version information list.
    */
    @SerializedName("ConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] ConfigGroupVersionInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total versions. 
     * @return TotalCount Total versions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total versions.
     * @param TotalCount Total versions.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Version information list. 
     * @return ConfigGroupVersionInfos Version information list.
     */
    public ConfigGroupVersionInfo [] getConfigGroupVersionInfos() {
        return this.ConfigGroupVersionInfos;
    }

    /**
     * Set Version information list.
     * @param ConfigGroupVersionInfos Version information list.
     */
    public void setConfigGroupVersionInfos(ConfigGroupVersionInfo [] ConfigGroupVersionInfos) {
        this.ConfigGroupVersionInfos = ConfigGroupVersionInfos;
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

    public DescribeConfigGroupVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigGroupVersionsResponse(DescribeConfigGroupVersionsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ConfigGroupVersionInfos != null) {
            this.ConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.ConfigGroupVersionInfos.length];
            for (int i = 0; i < source.ConfigGroupVersionInfos.length; i++) {
                this.ConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.ConfigGroupVersionInfos[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ConfigGroupVersionInfos.", this.ConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

