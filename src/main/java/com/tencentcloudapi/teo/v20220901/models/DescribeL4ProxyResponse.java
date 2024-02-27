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

public class DescribeL4ProxyResponse extends AbstractModel {

    /**
    * The number of Layer 4 proxy instances.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of Layer 4 proxy instances.
    */
    @SerializedName("L4Proxies")
    @Expose
    private L4Proxy [] L4Proxies;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of Layer 4 proxy instances. 
     * @return TotalCount The number of Layer 4 proxy instances.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of Layer 4 proxy instances.
     * @param TotalCount The number of Layer 4 proxy instances.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of Layer 4 proxy instances. 
     * @return L4Proxies List of Layer 4 proxy instances.
     */
    public L4Proxy [] getL4Proxies() {
        return this.L4Proxies;
    }

    /**
     * Set List of Layer 4 proxy instances.
     * @param L4Proxies List of Layer 4 proxy instances.
     */
    public void setL4Proxies(L4Proxy [] L4Proxies) {
        this.L4Proxies = L4Proxies;
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

    public DescribeL4ProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4ProxyResponse(DescribeL4ProxyResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.L4Proxies != null) {
            this.L4Proxies = new L4Proxy[source.L4Proxies.length];
            for (int i = 0; i < source.L4Proxies.length; i++) {
                this.L4Proxies[i] = new L4Proxy(source.L4Proxies[i]);
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
        this.setParamArrayObj(map, prefix + "L4Proxies.", this.L4Proxies);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

