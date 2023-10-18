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

public class DescribeDataTransformInfoResponse extends AbstractModel {

    /**
    * List of data processing tasks
    */
    @SerializedName("DataTransformTaskInfos")
    @Expose
    private DataTransformTaskInfo [] DataTransformTaskInfos;

    /**
    * Total tasks
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of data processing tasks 
     * @return DataTransformTaskInfos List of data processing tasks
     */
    public DataTransformTaskInfo [] getDataTransformTaskInfos() {
        return this.DataTransformTaskInfos;
    }

    /**
     * Set List of data processing tasks
     * @param DataTransformTaskInfos List of data processing tasks
     */
    public void setDataTransformTaskInfos(DataTransformTaskInfo [] DataTransformTaskInfos) {
        this.DataTransformTaskInfos = DataTransformTaskInfos;
    }

    /**
     * Get Total tasks 
     * @return TotalCount Total tasks
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total tasks
     * @param TotalCount Total tasks
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeDataTransformInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataTransformInfoResponse(DescribeDataTransformInfoResponse source) {
        if (source.DataTransformTaskInfos != null) {
            this.DataTransformTaskInfos = new DataTransformTaskInfo[source.DataTransformTaskInfos.length];
            for (int i = 0; i < source.DataTransformTaskInfos.length; i++) {
                this.DataTransformTaskInfos[i] = new DataTransformTaskInfo(source.DataTransformTaskInfos[i]);
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
        this.setParamArrayObj(map, prefix + "DataTransformTaskInfos.", this.DataTransformTaskInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

