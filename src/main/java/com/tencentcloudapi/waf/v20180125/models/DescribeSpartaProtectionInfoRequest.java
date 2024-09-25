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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpartaProtectionInfoRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Version
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Instance
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Version 
     * @return Edition Version
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Version
     * @param Edition Version
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Instance 
     * @return InstanceID Instance
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance
     * @param InstanceID Instance
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public DescribeSpartaProtectionInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpartaProtectionInfoRequest(DescribeSpartaProtectionInfoRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

