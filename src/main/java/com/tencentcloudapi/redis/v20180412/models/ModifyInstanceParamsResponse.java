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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamsResponse extends AbstractModel {

    /**
    * Whether the parameter is modified successfully. <br><li>`True`: Yes<br><li>`False`: No<br>
    */
    @SerializedName("Changed")
    @Expose
    private Boolean Changed;

    /**
    * ID of the task
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the parameter is modified successfully. <br><li>`True`: Yes<br><li>`False`: No<br> 
     * @return Changed Whether the parameter is modified successfully. <br><li>`True`: Yes<br><li>`False`: No<br>
     */
    public Boolean getChanged() {
        return this.Changed;
    }

    /**
     * Set Whether the parameter is modified successfully. <br><li>`True`: Yes<br><li>`False`: No<br>
     * @param Changed Whether the parameter is modified successfully. <br><li>`True`: Yes<br><li>`False`: No<br>
     */
    public void setChanged(Boolean Changed) {
        this.Changed = Changed;
    }

    /**
     * Get ID of the task 
     * @return TaskId ID of the task
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the task
     * @param TaskId ID of the task
     */
    public void setTaskId(Long TaskId) {
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

    public ModifyInstanceParamsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamsResponse(ModifyInstanceParamsResponse source) {
        if (source.Changed != null) {
            this.Changed = new Boolean(source.Changed);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Changed", this.Changed);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

