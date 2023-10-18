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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogHistogramResponse extends AbstractModel {

    /**
    * Statistical period in milliseconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * The number of logs that hit the keywords
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Statistical result details within the period
    */
    @SerializedName("HistogramInfos")
    @Expose
    private HistogramInfo [] HistogramInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Statistical period in milliseconds 
     * @return Interval Statistical period in milliseconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Statistical period in milliseconds
     * @param Interval Statistical period in milliseconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get The number of logs that hit the keywords 
     * @return TotalCount The number of logs that hit the keywords
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of logs that hit the keywords
     * @param TotalCount The number of logs that hit the keywords
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Statistical result details within the period 
     * @return HistogramInfos Statistical result details within the period
     */
    public HistogramInfo [] getHistogramInfos() {
        return this.HistogramInfos;
    }

    /**
     * Set Statistical result details within the period
     * @param HistogramInfos Statistical result details within the period
     */
    public void setHistogramInfos(HistogramInfo [] HistogramInfos) {
        this.HistogramInfos = HistogramInfos;
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

    public DescribeLogHistogramResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogHistogramResponse(DescribeLogHistogramResponse source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HistogramInfos != null) {
            this.HistogramInfos = new HistogramInfo[source.HistogramInfos.length];
            for (int i = 0; i < source.HistogramInfos.length; i++) {
                this.HistogramInfos[i] = new HistogramInfo(source.HistogramInfos[i]);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "HistogramInfos.", this.HistogramInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

