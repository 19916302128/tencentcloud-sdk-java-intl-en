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

public class DescribeIntegrationTaskResponse extends AbstractModel {

    /**
    * Task InformationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskInfo")
    @Expose
    private IntegrationTaskInfo TaskInfo;

    /**
    * Collector statistics
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AgentStatus")
    @Expose
    private AgentStatus AgentStatus;

    /**
    * Task version information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskVersion")
    @Expose
    private TaskVersionInstance TaskVersion;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task InformationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskInfo Task InformationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set Task InformationNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskInfo Task InformationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskInfo(IntegrationTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get Collector statistics
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AgentStatus Collector statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AgentStatus getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set Collector statistics
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AgentStatus Collector statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAgentStatus(AgentStatus AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get Task version information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskVersion Task version information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskVersionInstance getTaskVersion() {
        return this.TaskVersion;
    }

    /**
     * Set Task version information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskVersion Task version information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskVersion(TaskVersionInstance TaskVersion) {
        this.TaskVersion = TaskVersion;
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

    public DescribeIntegrationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationTaskResponse(DescribeIntegrationTaskResponse source) {
        if (source.TaskInfo != null) {
            this.TaskInfo = new IntegrationTaskInfo(source.TaskInfo);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new AgentStatus(source.AgentStatus);
        }
        if (source.TaskVersion != null) {
            this.TaskVersion = new TaskVersionInstance(source.TaskVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamObj(map, prefix + "AgentStatus.", this.AgentStatus);
        this.setParamObj(map, prefix + "TaskVersion.", this.TaskVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

