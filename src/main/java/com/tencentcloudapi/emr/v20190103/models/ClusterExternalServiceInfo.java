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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterExternalServiceInfo extends AbstractModel {

    /**
    * Dependency. `0`: Other clusters depend on the current cluster. `1`: The current cluster depends on other clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DependType")
    @Expose
    private Long DependType;

    /**
    * Shared component
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Sharing cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Sharing cluster status
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
     * Get Dependency. `0`: Other clusters depend on the current cluster. `1`: The current cluster depends on other clusters.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DependType Dependency. `0`: Other clusters depend on the current cluster. `1`: The current cluster depends on other clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDependType() {
        return this.DependType;
    }

    /**
     * Set Dependency. `0`: Other clusters depend on the current cluster. `1`: The current cluster depends on other clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DependType Dependency. `0`: Other clusters depend on the current cluster. `1`: The current cluster depends on other clusters.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDependType(Long DependType) {
        this.DependType = DependType;
    }

    /**
     * Get Shared component
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Service Shared component
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Shared component
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Service Shared component
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Sharing cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterId Sharing cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Sharing cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterId Sharing cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Sharing cluster status
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterStatus Sharing cluster status
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Sharing cluster status
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterStatus Sharing cluster status
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    public ClusterExternalServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterExternalServiceInfo(ClusterExternalServiceInfo source) {
        if (source.DependType != null) {
            this.DependType = new Long(source.DependType);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DependType", this.DependType);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);

    }
}

