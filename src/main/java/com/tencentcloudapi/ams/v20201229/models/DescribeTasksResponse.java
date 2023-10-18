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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksResponse extends AbstractModel {

    /**
    * This field is used to return the total number of queried tasks in the format of `int` string.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * This field is used to return the detailed data of the tasks on the current page. For the specific output content, see the detailed description of the `TaskData` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private TaskData [] Data;

    /**
    * This field is used to return the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get This field is used to return the total number of queried tasks in the format of `int` string.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Total This field is used to return the total number of queried tasks in the format of `int` string.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set This field is used to return the total number of queried tasks in the format of `int` string.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Total This field is used to return the total number of queried tasks in the format of `int` string.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get This field is used to return the detailed data of the tasks on the current page. For the specific output content, see the detailed description of the `TaskData` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Data This field is used to return the detailed data of the tasks on the current page. For the specific output content, see the detailed description of the `TaskData` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TaskData [] getData() {
        return this.Data;
    }

    /**
     * Set This field is used to return the detailed data of the tasks on the current page. For the specific output content, see the detailed description of the `TaskData` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Data This field is used to return the detailed data of the tasks on the current page. For the specific output content, see the detailed description of the `TaskData` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setData(TaskData [] Data) {
        this.Data = Data;
    }

    /**
     * Get This field is used to return the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PageToken This field is used to return the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set This field is used to return the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PageToken This field is used to return the `Token` information used during pagination. It is automatically generated by the system and will be passed to the next generated page for easy and fast pagination. When you turn to the last page, this field will be empty.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
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

    public DescribeTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksResponse(DescribeTasksResponse source) {
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Data != null) {
            this.Data = new TaskData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TaskData(source.Data[i]);
            }
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

