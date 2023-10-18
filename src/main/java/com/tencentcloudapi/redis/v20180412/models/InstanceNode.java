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

public class InstanceNode extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Node details
    */
    @SerializedName("InstanceClusterNode")
    @Expose
    private InstanceClusterNode [] InstanceClusterNode;

    /**
     * Get Instance ID 
     * @return Id Instance ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Instance ID
     * @param Id Instance ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Node details 
     * @return InstanceClusterNode Node details
     */
    public InstanceClusterNode [] getInstanceClusterNode() {
        return this.InstanceClusterNode;
    }

    /**
     * Set Node details
     * @param InstanceClusterNode Node details
     */
    public void setInstanceClusterNode(InstanceClusterNode [] InstanceClusterNode) {
        this.InstanceClusterNode = InstanceClusterNode;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceClusterNode != null) {
            this.InstanceClusterNode = new InstanceClusterNode[source.InstanceClusterNode.length];
            for (int i = 0; i < source.InstanceClusterNode.length; i++) {
                this.InstanceClusterNode[i] = new InstanceClusterNode(source.InstanceClusterNode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "InstanceClusterNode.", this.InstanceClusterNode);

    }
}

