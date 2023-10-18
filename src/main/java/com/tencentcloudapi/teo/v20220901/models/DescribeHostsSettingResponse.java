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

public class DescribeHostsSettingResponse extends AbstractModel {

    /**
    * List of domain names.
    */
    @SerializedName("DetailHosts")
    @Expose
    private DetailHost [] DetailHosts;

    /**
    * Number of domain names
    */
    @SerializedName("TotalNumber")
    @Expose
    private Long TotalNumber;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of domain names. 
     * @return DetailHosts List of domain names.
     */
    public DetailHost [] getDetailHosts() {
        return this.DetailHosts;
    }

    /**
     * Set List of domain names.
     * @param DetailHosts List of domain names.
     */
    public void setDetailHosts(DetailHost [] DetailHosts) {
        this.DetailHosts = DetailHosts;
    }

    /**
     * Get Number of domain names 
     * @return TotalNumber Number of domain names
     */
    public Long getTotalNumber() {
        return this.TotalNumber;
    }

    /**
     * Set Number of domain names
     * @param TotalNumber Number of domain names
     */
    public void setTotalNumber(Long TotalNumber) {
        this.TotalNumber = TotalNumber;
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

    public DescribeHostsSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostsSettingResponse(DescribeHostsSettingResponse source) {
        if (source.DetailHosts != null) {
            this.DetailHosts = new DetailHost[source.DetailHosts.length];
            for (int i = 0; i < source.DetailHosts.length; i++) {
                this.DetailHosts[i] = new DetailHost(source.DetailHosts[i]);
            }
        }
        if (source.TotalNumber != null) {
            this.TotalNumber = new Long(source.TotalNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailHosts.", this.DetailHosts);
        this.setParamSimple(map, prefix + "TotalNumber", this.TotalNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

