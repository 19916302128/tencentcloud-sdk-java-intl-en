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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCThresholdListResponse extends AbstractModel{

    /**
    * Total number of cleansing threshold policies
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Details of cleansing threshold policies
    */
    @SerializedName("ThresholdList")
    @Expose
    private CCThresholdPolicy [] ThresholdList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of cleansing threshold policies 
     * @return Total Total number of cleansing threshold policies
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of cleansing threshold policies
     * @param Total Total number of cleansing threshold policies
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Details of cleansing threshold policies 
     * @return ThresholdList Details of cleansing threshold policies
     */
    public CCThresholdPolicy [] getThresholdList() {
        return this.ThresholdList;
    }

    /**
     * Set Details of cleansing threshold policies
     * @param ThresholdList Details of cleansing threshold policies
     */
    public void setThresholdList(CCThresholdPolicy [] ThresholdList) {
        this.ThresholdList = ThresholdList;
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

    public DescribeCCThresholdListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCThresholdListResponse(DescribeCCThresholdListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ThresholdList != null) {
            this.ThresholdList = new CCThresholdPolicy[source.ThresholdList.length];
            for (int i = 0; i < source.ThresholdList.length; i++) {
                this.ThresholdList[i] = new CCThresholdPolicy(source.ThresholdList[i]);
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
        this.setParamArrayObj(map, prefix + "ThresholdList.", this.ThresholdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

