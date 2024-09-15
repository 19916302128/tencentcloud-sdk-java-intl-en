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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrentPackagesResponse extends AbstractModel {

    /**
    * Total number.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Concurrency pack list.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConcurrentPackages")
    @Expose
    private ApplicationConcurrentPackage [] ConcurrentPackages;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Concurrency pack list.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConcurrentPackages Concurrency pack list.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationConcurrentPackage [] getConcurrentPackages() {
        return this.ConcurrentPackages;
    }

    /**
     * Set Concurrency pack list.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConcurrentPackages Concurrency pack list.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConcurrentPackages(ApplicationConcurrentPackage [] ConcurrentPackages) {
        this.ConcurrentPackages = ConcurrentPackages;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConcurrentPackagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrentPackagesResponse(DescribeConcurrentPackagesResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ConcurrentPackages != null) {
            this.ConcurrentPackages = new ApplicationConcurrentPackage[source.ConcurrentPackages.length];
            for (int i = 0; i < source.ConcurrentPackages.length; i++) {
                this.ConcurrentPackages[i] = new ApplicationConcurrentPackage(source.ConcurrentPackages[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ConcurrentPackages.", this.ConcurrentPackages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

