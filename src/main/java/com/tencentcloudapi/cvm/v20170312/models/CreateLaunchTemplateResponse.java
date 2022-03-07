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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaunchTemplateResponse extends AbstractModel{

    /**
    * The ID of successfully created instance launch template. This parameter will be returned when the instance launch template is created through the `CreateLaunchTemplate` API.
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The ID of successfully created instance launch template. This parameter will be returned when the instance launch template is created through the `CreateLaunchTemplate` API. 
     * @return LaunchTemplateId The ID of successfully created instance launch template. This parameter will be returned when the instance launch template is created through the `CreateLaunchTemplate` API.
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set The ID of successfully created instance launch template. This parameter will be returned when the instance launch template is created through the `CreateLaunchTemplate` API.
     * @param LaunchTemplateId The ID of successfully created instance launch template. This parameter will be returned when the instance launch template is created through the `CreateLaunchTemplate` API.
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateLaunchTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLaunchTemplateResponse(CreateLaunchTemplateResponse source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
