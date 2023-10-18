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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdentifyZoneRequest extends AbstractModel {

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * A subdomain name under the site. Specify this field if you want to verify the ownership of a subdomain name. Otherwise you can leave it blank.

    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get A subdomain name under the site. Specify this field if you want to verify the ownership of a subdomain name. Otherwise you can leave it blank.
 
     * @return Domain A subdomain name under the site. Specify this field if you want to verify the ownership of a subdomain name. Otherwise you can leave it blank.

     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set A subdomain name under the site. Specify this field if you want to verify the ownership of a subdomain name. Otherwise you can leave it blank.

     * @param Domain A subdomain name under the site. Specify this field if you want to verify the ownership of a subdomain name. Otherwise you can leave it blank.

     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public IdentifyZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdentifyZoneRequest(IdentifyZoneRequest source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

