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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLinkFlowRealtimeStatusResponse extends AbstractModel {

    /**
    * The timestamp (seconds) of the query.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * A list of the real-time data.
    */
    @SerializedName("Datas")
    @Expose
    private FlowRealtimeStatusItem [] Datas;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The timestamp (seconds) of the query. 
     * @return Timestamp The timestamp (seconds) of the query.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set The timestamp (seconds) of the query.
     * @param Timestamp The timestamp (seconds) of the query.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get A list of the real-time data. 
     * @return Datas A list of the real-time data.
     */
    public FlowRealtimeStatusItem [] getDatas() {
        return this.Datas;
    }

    /**
     * Set A list of the real-time data.
     * @param Datas A list of the real-time data.
     */
    public void setDatas(FlowRealtimeStatusItem [] Datas) {
        this.Datas = Datas;
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

    public DescribeStreamLinkFlowRealtimeStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowRealtimeStatusResponse(DescribeStreamLinkFlowRealtimeStatusResponse source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Datas != null) {
            this.Datas = new FlowRealtimeStatusItem[source.Datas.length];
            for (int i = 0; i < source.Datas.length; i++) {
                this.Datas[i] = new FlowRealtimeStatusItem(source.Datas[i]);
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
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArrayObj(map, prefix + "Datas.", this.Datas);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

