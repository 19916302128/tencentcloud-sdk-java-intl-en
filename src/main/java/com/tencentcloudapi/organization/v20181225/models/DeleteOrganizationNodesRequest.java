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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrganizationNodesRequest extends AbstractModel{

    /**
    * Organizational unit ID list
    */
    @SerializedName("NodeIds")
    @Expose
    private Long [] NodeIds;

    /**
     * Get Organizational unit ID list 
     * @return NodeIds Organizational unit ID list
     */
    public Long [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set Organizational unit ID list
     * @param NodeIds Organizational unit ID list
     */
    public void setNodeIds(Long [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    public DeleteOrganizationNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrganizationNodesRequest(DeleteOrganizationNodesRequest source) {
        if (source.NodeIds != null) {
            this.NodeIds = new Long[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new Long(source.NodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);

    }
}

