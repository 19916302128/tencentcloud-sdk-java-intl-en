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

public class DescribeInstanceListResponse extends AbstractModel {

    /**
    * Result
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * Instance ListNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceList")
    @Expose
    private InstanceList [] InstanceList;

    /**
    * Total number of itemsNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Result 
     * @return Data Result
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Result
     * @param Data Result
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get Instance ListNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceList Instance ListNote: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceList [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set Instance ListNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceList Instance ListNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceList(InstanceList [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get Total number of itemsNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total number of itemsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of itemsNote: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total number of itemsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeInstanceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceListResponse(DescribeInstanceListResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.InstanceList != null) {
            this.InstanceList = new InstanceList[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new InstanceList(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

