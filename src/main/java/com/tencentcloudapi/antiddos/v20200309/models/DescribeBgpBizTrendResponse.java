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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBgpBizTrendResponse extends AbstractModel {

    /**
    * Values of the samples
    */
    @SerializedName("DataList")
    @Expose
    private Long [] DataList;

    /**
    * Number of samples
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Statistical metric
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Maximum value of the arrays returned
    */
    @SerializedName("MaxData")
    @Expose
    private Long MaxData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Values of the samples 
     * @return DataList Values of the samples
     */
    public Long [] getDataList() {
        return this.DataList;
    }

    /**
     * Set Values of the samples
     * @param DataList Values of the samples
     */
    public void setDataList(Long [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get Number of samples 
     * @return Total Number of samples
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of samples
     * @param Total Number of samples
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Statistical metric 
     * @return MetricName Statistical metric
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Statistical metric
     * @param MetricName Statistical metric
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Maximum value of the arrays returned 
     * @return MaxData Maximum value of the arrays returned
     */
    public Long getMaxData() {
        return this.MaxData;
    }

    /**
     * Set Maximum value of the arrays returned
     * @param MaxData Maximum value of the arrays returned
     */
    public void setMaxData(Long MaxData) {
        this.MaxData = MaxData;
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

    public DescribeBgpBizTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBgpBizTrendResponse(DescribeBgpBizTrendResponse source) {
        if (source.DataList != null) {
            this.DataList = new Long[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new Long(source.DataList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MaxData != null) {
            this.MaxData = new Long(source.MaxData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MaxData", this.MaxData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

