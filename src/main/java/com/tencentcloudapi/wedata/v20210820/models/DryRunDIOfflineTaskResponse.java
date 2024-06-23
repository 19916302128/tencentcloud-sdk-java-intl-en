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

public class DryRunDIOfflineTaskResponse extends AbstractModel {

    /**
    * Data Timestamp
    */
    @SerializedName("CurrentRunDate")
    @Expose
    private String CurrentRunDate;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Unique Key for Task Instance
    */
    @SerializedName("TaskInstanceKey")
    @Expose
    private String TaskInstanceKey;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data Timestamp 
     * @return CurrentRunDate Data Timestamp
     */
    public String getCurrentRunDate() {
        return this.CurrentRunDate;
    }

    /**
     * Set Data Timestamp
     * @param CurrentRunDate Data Timestamp
     */
    public void setCurrentRunDate(String CurrentRunDate) {
        this.CurrentRunDate = CurrentRunDate;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task Status 
     * @return Status Task Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task Status
     * @param Status Task Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Unique Key for Task Instance 
     * @return TaskInstanceKey Unique Key for Task Instance
     */
    public String getTaskInstanceKey() {
        return this.TaskInstanceKey;
    }

    /**
     * Set Unique Key for Task Instance
     * @param TaskInstanceKey Unique Key for Task Instance
     */
    public void setTaskInstanceKey(String TaskInstanceKey) {
        this.TaskInstanceKey = TaskInstanceKey;
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

    public DryRunDIOfflineTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DryRunDIOfflineTaskResponse(DryRunDIOfflineTaskResponse source) {
        if (source.CurrentRunDate != null) {
            this.CurrentRunDate = new String(source.CurrentRunDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskInstanceKey != null) {
            this.TaskInstanceKey = new String(source.TaskInstanceKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentRunDate", this.CurrentRunDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskInstanceKey", this.TaskInstanceKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

