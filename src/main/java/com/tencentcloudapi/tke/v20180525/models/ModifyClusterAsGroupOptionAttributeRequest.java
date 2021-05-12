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

public class ModifyClusterAsGroupOptionAttributeRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster auto scaling attributes
    */
    @SerializedName("ClusterAsGroupOption")
    @Expose
    private ClusterAsGroupOption ClusterAsGroupOption;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster auto scaling attributes 
     * @return ClusterAsGroupOption Cluster auto scaling attributes
     */
    public ClusterAsGroupOption getClusterAsGroupOption() {
        return this.ClusterAsGroupOption;
    }

    /**
     * Set Cluster auto scaling attributes
     * @param ClusterAsGroupOption Cluster auto scaling attributes
     */
    public void setClusterAsGroupOption(ClusterAsGroupOption ClusterAsGroupOption) {
        this.ClusterAsGroupOption = ClusterAsGroupOption;
    }

    public ModifyClusterAsGroupOptionAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAsGroupOptionAttributeRequest(ModifyClusterAsGroupOptionAttributeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterAsGroupOption != null) {
            this.ClusterAsGroupOption = new ClusterAsGroupOption(source.ClusterAsGroupOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "ClusterAsGroupOption.", this.ClusterAsGroupOption);

    }
}

