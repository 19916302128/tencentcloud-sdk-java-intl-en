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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyGroupDomainRequest extends AbstractModel{

    /**
    * Connection group ID of the domain name to be enabled.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Connection group ID of the domain name to be enabled. 
     * @return GroupId Connection group ID of the domain name to be enabled.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID of the domain name to be enabled.
     * @param GroupId Connection group ID of the domain name to be enabled.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

