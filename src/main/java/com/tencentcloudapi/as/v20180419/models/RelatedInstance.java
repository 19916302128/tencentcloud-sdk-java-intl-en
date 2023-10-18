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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelatedInstance extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Status of the instance in the scaling activity. Valid values:
`INIT`: Initializing
`RUNNING`: u200dProcessing u200dthe instance
`SUCCESSFUL`: Task succeeded on the instance
`FAILED`: Task failed on the instance
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Status of the instance in the scaling activity. Valid values:
`INIT`: Initializing
`RUNNING`: u200dProcessing u200dthe instance
`SUCCESSFUL`: Task succeeded on the instance
`FAILED`: Task failed on the instance 
     * @return InstanceStatus Status of the instance in the scaling activity. Valid values:
`INIT`: Initializing
`RUNNING`: u200dProcessing u200dthe instance
`SUCCESSFUL`: Task succeeded on the instance
`FAILED`: Task failed on the instance
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Status of the instance in the scaling activity. Valid values:
`INIT`: Initializing
`RUNNING`: u200dProcessing u200dthe instance
`SUCCESSFUL`: Task succeeded on the instance
`FAILED`: Task failed on the instance
     * @param InstanceStatus Status of the instance in the scaling activity. Valid values:
`INIT`: Initializing
`RUNNING`: u200dProcessing u200dthe instance
`SUCCESSFUL`: Task succeeded on the instance
`FAILED`: Task failed on the instance
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public RelatedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelatedInstance(RelatedInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

