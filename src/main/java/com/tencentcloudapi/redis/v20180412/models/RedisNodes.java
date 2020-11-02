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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisNodes extends AbstractModel{

    /**
    * Node ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node role
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * Shard ID
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
     * Get Node ID 
     * @return NodeId Node ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID
     * @param NodeId Node ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node role 
     * @return NodeRole Node role
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Node role
     * @param NodeRole Node role
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get Shard ID 
     * @return ClusterId Shard ID
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Shard ID
     * @param ClusterId Shard ID
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}
