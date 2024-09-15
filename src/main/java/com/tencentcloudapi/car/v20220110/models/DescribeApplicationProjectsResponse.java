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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationProjectsResponse extends AbstractModel {

    /**
    * Project list.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Projects")
    @Expose
    private ApplicationProject [] Projects;

    /**
    * Total number.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Project list.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Projects Project list.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationProject [] getProjects() {
        return this.Projects;
    }

    /**
     * Set Project list.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Projects Project list.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjects(ApplicationProject [] Projects) {
        this.Projects = Projects;
    }

    /**
     * Get Total number.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Total number.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeApplicationProjectsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationProjectsResponse(DescribeApplicationProjectsResponse source) {
        if (source.Projects != null) {
            this.Projects = new ApplicationProject[source.Projects.length];
            for (int i = 0; i < source.Projects.length; i++) {
                this.Projects[i] = new ApplicationProject(source.Projects[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

