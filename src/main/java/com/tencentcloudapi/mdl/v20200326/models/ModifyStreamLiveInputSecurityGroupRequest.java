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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLiveInputSecurityGroupRequest extends AbstractModel {

    /**
    * Input security group ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Input security group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Allowlist entries (max: 10)
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
     * Get Input security group ID 
     * @return Id Input security group ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Input security group ID
     * @param Id Input security group ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Input security group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level 
     * @return Name Input security group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Input security group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     * @param Name Input security group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the region level
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Allowlist entries (max: 10) 
     * @return Whitelist Allowlist entries (max: 10)
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set Allowlist entries (max: 10)
     * @param Whitelist Allowlist entries (max: 10)
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    public ModifyStreamLiveInputSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLiveInputSecurityGroupRequest(ModifyStreamLiveInputSecurityGroupRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new String[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new String(source.Whitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);

    }
}

