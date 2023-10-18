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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportImagesResponse extends AbstractModel {

    /**
    * ID of the image export task
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * List of COS filenames of the exported images
    */
    @SerializedName("CosPaths")
    @Expose
    private String [] CosPaths;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the image export task 
     * @return TaskId ID of the image export task
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the image export task
     * @param TaskId ID of the image export task
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get List of COS filenames of the exported images 
     * @return CosPaths List of COS filenames of the exported images
     */
    public String [] getCosPaths() {
        return this.CosPaths;
    }

    /**
     * Set List of COS filenames of the exported images
     * @param CosPaths List of COS filenames of the exported images
     */
    public void setCosPaths(String [] CosPaths) {
        this.CosPaths = CosPaths;
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

    public ExportImagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportImagesResponse(ExportImagesResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.CosPaths != null) {
            this.CosPaths = new String[source.CosPaths.length];
            for (int i = 0; i < source.CosPaths.length; i++) {
                this.CosPaths[i] = new String(source.CosPaths[i]);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "CosPaths.", this.CosPaths);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

