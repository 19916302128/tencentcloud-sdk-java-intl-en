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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * Resource type
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get Resource type 
     * @return ResourceType Resource type
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
     * @param ResourceType Resource type
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource name
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ResourceName Resource name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ResourceName Resource name
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

