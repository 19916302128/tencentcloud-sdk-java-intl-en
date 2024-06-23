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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealTimeTaskSpeedResponse extends AbstractModel {

    /**
    * Synchronous Speed Bar/s List
    */
    @SerializedName("RecordsSpeedList")
    @Expose
    private RecordsSpeed [] RecordsSpeedList;

    /**
    * Synchronous Speed Bytes/s List
    */
    @SerializedName("BytesSpeedList")
    @Expose
    private BytesSpeed [] BytesSpeedList;

    /**
    * Synchronous Speed, including RecordsSpeedList and BytesSpeedList
    */
    @SerializedName("Data")
    @Expose
    private RealTimeTaskSpeed Data;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Synchronous Speed Bar/s List 
     * @return RecordsSpeedList Synchronous Speed Bar/s List
     */
    public RecordsSpeed [] getRecordsSpeedList() {
        return this.RecordsSpeedList;
    }

    /**
     * Set Synchronous Speed Bar/s List
     * @param RecordsSpeedList Synchronous Speed Bar/s List
     */
    public void setRecordsSpeedList(RecordsSpeed [] RecordsSpeedList) {
        this.RecordsSpeedList = RecordsSpeedList;
    }

    /**
     * Get Synchronous Speed Bytes/s List 
     * @return BytesSpeedList Synchronous Speed Bytes/s List
     */
    public BytesSpeed [] getBytesSpeedList() {
        return this.BytesSpeedList;
    }

    /**
     * Set Synchronous Speed Bytes/s List
     * @param BytesSpeedList Synchronous Speed Bytes/s List
     */
    public void setBytesSpeedList(BytesSpeed [] BytesSpeedList) {
        this.BytesSpeedList = BytesSpeedList;
    }

    /**
     * Get Synchronous Speed, including RecordsSpeedList and BytesSpeedList 
     * @return Data Synchronous Speed, including RecordsSpeedList and BytesSpeedList
     */
    public RealTimeTaskSpeed getData() {
        return this.Data;
    }

    /**
     * Set Synchronous Speed, including RecordsSpeedList and BytesSpeedList
     * @param Data Synchronous Speed, including RecordsSpeedList and BytesSpeedList
     */
    public void setData(RealTimeTaskSpeed Data) {
        this.Data = Data;
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

    public DescribeRealTimeTaskSpeedResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealTimeTaskSpeedResponse(DescribeRealTimeTaskSpeedResponse source) {
        if (source.RecordsSpeedList != null) {
            this.RecordsSpeedList = new RecordsSpeed[source.RecordsSpeedList.length];
            for (int i = 0; i < source.RecordsSpeedList.length; i++) {
                this.RecordsSpeedList[i] = new RecordsSpeed(source.RecordsSpeedList[i]);
            }
        }
        if (source.BytesSpeedList != null) {
            this.BytesSpeedList = new BytesSpeed[source.BytesSpeedList.length];
            for (int i = 0; i < source.BytesSpeedList.length; i++) {
                this.BytesSpeedList[i] = new BytesSpeed(source.BytesSpeedList[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new RealTimeTaskSpeed(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordsSpeedList.", this.RecordsSpeedList);
        this.setParamArrayObj(map, prefix + "BytesSpeedList.", this.BytesSpeedList);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

