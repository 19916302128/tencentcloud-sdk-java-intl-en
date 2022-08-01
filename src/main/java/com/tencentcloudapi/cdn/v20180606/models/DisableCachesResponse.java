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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableCachesResponse extends AbstractModel{

    /**
    * Submission result
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheOptResult")
    @Expose
    private CacheOptResult CacheOptResult;

    /**
    * Task ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Submission result
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CacheOptResult Submission result
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public CacheOptResult getCacheOptResult() {
        return this.CacheOptResult;
    }

    /**
     * Set Submission result
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CacheOptResult Submission result
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCacheOptResult(CacheOptResult CacheOptResult) {
        this.CacheOptResult = CacheOptResult;
    }

    /**
     * Get Task ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TaskId Task ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TaskId Task ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public DisableCachesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableCachesResponse(DisableCachesResponse source) {
        if (source.CacheOptResult != null) {
            this.CacheOptResult = new CacheOptResult(source.CacheOptResult);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CacheOptResult.", this.CacheOptResult);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

