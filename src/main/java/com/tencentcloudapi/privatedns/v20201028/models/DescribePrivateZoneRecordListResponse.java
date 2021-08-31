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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateZoneRecordListResponse extends AbstractModel{

    /**
    * Number of DNS records
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of DNS records
    */
    @SerializedName("RecordSet")
    @Expose
    private PrivateZoneRecord [] RecordSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of DNS records 
     * @return TotalCount Number of DNS records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of DNS records
     * @param TotalCount Number of DNS records
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of DNS records 
     * @return RecordSet List of DNS records
     */
    public PrivateZoneRecord [] getRecordSet() {
        return this.RecordSet;
    }

    /**
     * Set List of DNS records
     * @param RecordSet List of DNS records
     */
    public void setRecordSet(PrivateZoneRecord [] RecordSet) {
        this.RecordSet = RecordSet;
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

    public DescribePrivateZoneRecordListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateZoneRecordListResponse(DescribePrivateZoneRecordListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RecordSet != null) {
            this.RecordSet = new PrivateZoneRecord[source.RecordSet.length];
            for (int i = 0; i < source.RecordSet.length; i++) {
                this.RecordSet[i] = new PrivateZoneRecord(source.RecordSet[i]);
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
        this.setParamArrayObj(map, prefix + "RecordSet.", this.RecordSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

