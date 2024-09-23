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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceOffline extends AbstractModel {

    /**
    * Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
    * Resource decommissioning time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceDeleteTime")
    @Expose
    private String ResourceDeleteTime;

    /**
    * Resource decommissioning reminder
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceDeleteMessage")
    @Expose
    private String ResourceDeleteMessage;

    /**
     * Get Resource ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceId Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource decommissioning time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceDeleteTime Resource decommissioning time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceDeleteTime() {
        return this.ResourceDeleteTime;
    }

    /**
     * Set Resource decommissioning time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceDeleteTime Resource decommissioning time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceDeleteTime(String ResourceDeleteTime) {
        this.ResourceDeleteTime = ResourceDeleteTime;
    }

    /**
     * Get Resource decommissioning reminder
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceDeleteMessage Resource decommissioning reminder
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceDeleteMessage() {
        return this.ResourceDeleteMessage;
    }

    /**
     * Set Resource decommissioning reminder
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceDeleteMessage Resource decommissioning reminder
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceDeleteMessage(String ResourceDeleteMessage) {
        this.ResourceDeleteMessage = ResourceDeleteMessage;
    }

    public ResourceOffline() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceOffline(ResourceOffline source) {
        if (source.ResourceId != null) {
            this.ResourceId = new Long(source.ResourceId);
        }
        if (source.ResourceDeleteTime != null) {
            this.ResourceDeleteTime = new String(source.ResourceDeleteTime);
        }
        if (source.ResourceDeleteMessage != null) {
            this.ResourceDeleteMessage = new String(source.ResourceDeleteMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceDeleteTime", this.ResourceDeleteTime);
        this.setParamSimple(map, prefix + "ResourceDeleteMessage", this.ResourceDeleteMessage);

    }
}
