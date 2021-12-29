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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterDetail extends AbstractModel{

    /**
    * Cluster's basic information
    */
    @SerializedName("Info")
    @Expose
    private RocketMQClusterInfo Info;

    /**
    * Cluster configuration information
    */
    @SerializedName("Config")
    @Expose
    private RocketMQClusterConfig Config;

    /**
    * Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Cluster's basic information 
     * @return Info Cluster's basic information
     */
    public RocketMQClusterInfo getInfo() {
        return this.Info;
    }

    /**
     * Set Cluster's basic information
     * @param Info Cluster's basic information
     */
    public void setInfo(RocketMQClusterInfo Info) {
        this.Info = Info;
    }

    /**
     * Get Cluster configuration information 
     * @return Config Cluster configuration information
     */
    public RocketMQClusterConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Cluster configuration information
     * @param Config Cluster configuration information
     */
    public void setConfig(RocketMQClusterConfig Config) {
        this.Config = Config;
    }

    /**
     * Get Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public RocketMQClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterDetail(RocketMQClusterDetail source) {
        if (source.Info != null) {
            this.Info = new RocketMQClusterInfo(source.Info);
        }
        if (source.Config != null) {
            this.Config = new RocketMQClusterConfig(source.Config);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

