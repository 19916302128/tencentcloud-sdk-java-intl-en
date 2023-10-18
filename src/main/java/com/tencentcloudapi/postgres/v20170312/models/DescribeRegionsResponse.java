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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionsResponse extends AbstractModel {

    /**
    * Number of returned results.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Region information set.
    */
    @SerializedName("RegionSet")
    @Expose
    private RegionInfo [] RegionSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of returned results. 
     * @return TotalCount Number of returned results.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of returned results.
     * @param TotalCount Number of returned results.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Region information set. 
     * @return RegionSet Region information set.
     */
    public RegionInfo [] getRegionSet() {
        return this.RegionSet;
    }

    /**
     * Set Region information set.
     * @param RegionSet Region information set.
     */
    public void setRegionSet(RegionInfo [] RegionSet) {
        this.RegionSet = RegionSet;
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

    public DescribeRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionsResponse(DescribeRegionsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RegionSet != null) {
            this.RegionSet = new RegionInfo[source.RegionSet.length];
            for (int i = 0; i < source.RegionSet.length; i++) {
                this.RegionSet[i] = new RegionInfo(source.RegionSet[i]);
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
        this.setParamArrayObj(map, prefix + "RegionSet.", this.RegionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

