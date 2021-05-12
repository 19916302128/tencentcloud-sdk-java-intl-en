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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterAsGroupOptionResponse extends AbstractModel{

    /**
    * Cluster auto scaling attributes
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("ClusterAsGroupOption")
    @Expose
    private ClusterAsGroupOption ClusterAsGroupOption;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster auto scaling attributes
Note: this field may return null, indicating that no valid value was found. 
     * @return ClusterAsGroupOption Cluster auto scaling attributes
Note: this field may return null, indicating that no valid value was found.
     */
    public ClusterAsGroupOption getClusterAsGroupOption() {
        return this.ClusterAsGroupOption;
    }

    /**
     * Set Cluster auto scaling attributes
Note: this field may return null, indicating that no valid value was found.
     * @param ClusterAsGroupOption Cluster auto scaling attributes
Note: this field may return null, indicating that no valid value was found.
     */
    public void setClusterAsGroupOption(ClusterAsGroupOption ClusterAsGroupOption) {
        this.ClusterAsGroupOption = ClusterAsGroupOption;
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

    public DescribeClusterAsGroupOptionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterAsGroupOptionResponse(DescribeClusterAsGroupOptionResponse source) {
        if (source.ClusterAsGroupOption != null) {
            this.ClusterAsGroupOption = new ClusterAsGroupOption(source.ClusterAsGroupOption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterAsGroupOption.", this.ClusterAsGroupOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

