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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveCallbackTemplateRequest extends AbstractModel{

    /**
    * Template ID.
1. Get the template ID in the returned value of the [CreateLiveCallbackTemplate](/document/product/267/32637) API call.
2. You can query the list of created templates through the [DescribeLiveCallbackTemplates](/document/product/267/32632) API.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get Template ID.
1. Get the template ID in the returned value of the [CreateLiveCallbackTemplate](/document/product/267/32637) API call.
2. You can query the list of created templates through the [DescribeLiveCallbackTemplates](/document/product/267/32632) API. 
     * @return TemplateId Template ID.
1. Get the template ID in the returned value of the [CreateLiveCallbackTemplate](/document/product/267/32637) API call.
2. You can query the list of created templates through the [DescribeLiveCallbackTemplates](/document/product/267/32632) API.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
1. Get the template ID in the returned value of the [CreateLiveCallbackTemplate](/document/product/267/32637) API call.
2. You can query the list of created templates through the [DescribeLiveCallbackTemplates](/document/product/267/32632) API.
     * @param TemplateId Template ID.
1. Get the template ID in the returned value of the [CreateLiveCallbackTemplate](/document/product/267/32637) API call.
2. You can query the list of created templates through the [DescribeLiveCallbackTemplates](/document/product/267/32632) API.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

