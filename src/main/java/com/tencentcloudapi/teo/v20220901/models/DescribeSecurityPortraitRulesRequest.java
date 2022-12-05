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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPortraitRulesRequest extends AbstractModel{

    /**
    * The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * The template ID. You must specify either this field or "ZoneId+Entity". 
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get The site ID. You must specify either "ZoneId+Entity" or "TemplateId". 
     * @return ZoneId The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
     * @param ZoneId The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId". 
     * @return Entity The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
     * @param Entity The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get The template ID. You must specify either this field or "ZoneId+Entity".  
     * @return TemplateId The template ID. You must specify either this field or "ZoneId+Entity". 
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The template ID. You must specify either this field or "ZoneId+Entity". 
     * @param TemplateId The template ID. You must specify either this field or "ZoneId+Entity". 
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public DescribeSecurityPortraitRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPortraitRulesRequest(DescribeSecurityPortraitRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}
