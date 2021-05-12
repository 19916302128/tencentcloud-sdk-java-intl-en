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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressesResponse extends AbstractModel{

    /**
    * Number of EIPs meeting the condition.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of EIPs details.
    */
    @SerializedName("AddressSet")
    @Expose
    private Address [] AddressSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of EIPs meeting the condition. 
     * @return TotalCount Number of EIPs meeting the condition.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of EIPs meeting the condition.
     * @param TotalCount Number of EIPs meeting the condition.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of EIPs details. 
     * @return AddressSet List of EIPs details.
     */
    public Address [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set List of EIPs details.
     * @param AddressSet List of EIPs details.
     */
    public void setAddressSet(Address [] AddressSet) {
        this.AddressSet = AddressSet;
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

    public DescribeAddressesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddressesResponse(DescribeAddressesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AddressSet != null) {
            this.AddressSet = new Address[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new Address(source.AddressSet[i]);
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
        this.setParamArrayObj(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

