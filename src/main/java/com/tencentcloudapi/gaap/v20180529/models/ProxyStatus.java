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

public class ProxyStatus extends AbstractModel{

    /**
    * Connection instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Connection status.
Where:
RUNNING: running;
CREATING: creating;
DESTROYING: terminating;
OPENING: enabling;
CLOSING: disabling;
CLOSED: disabled;
ADJUSTING: adjusting configuration
ISOLATING: isolating;
ISOLATED: isolated;
UNKNOWN: unknown status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Connection instance ID. 
     * @return InstanceId Connection instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Connection instance ID.
     * @param InstanceId Connection instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Connection status.
Where:
RUNNING: running;
CREATING: creating;
DESTROYING: terminating;
OPENING: enabling;
CLOSING: disabling;
CLOSED: disabled;
ADJUSTING: adjusting configuration
ISOLATING: isolating;
ISOLATED: isolated;
UNKNOWN: unknown status. 
     * @return Status Connection status.
Where:
RUNNING: running;
CREATING: creating;
DESTROYING: terminating;
OPENING: enabling;
CLOSING: disabling;
CLOSED: disabled;
ADJUSTING: adjusting configuration
ISOLATING: isolating;
ISOLATED: isolated;
UNKNOWN: unknown status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Connection status.
Where:
RUNNING: running;
CREATING: creating;
DESTROYING: terminating;
OPENING: enabling;
CLOSING: disabling;
CLOSED: disabled;
ADJUSTING: adjusting configuration
ISOLATING: isolating;
ISOLATED: isolated;
UNKNOWN: unknown status.
     * @param Status Connection status.
Where:
RUNNING: running;
CREATING: creating;
DESTROYING: terminating;
OPENING: enabling;
CLOSING: disabling;
CLOSED: disabled;
ADJUSTING: adjusting configuration
ISOLATING: isolating;
ISOLATED: isolated;
UNKNOWN: unknown status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

