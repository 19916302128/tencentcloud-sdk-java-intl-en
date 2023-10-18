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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceOriginData extends AbstractModel {

    /**
    * Resource name, which is classified as follows based on different query filters:
A specific domain name: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
Project ID: ID of the specifically queried project
`all`: Details at the account level
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Origin-pull data details
    */
    @SerializedName("OriginData")
    @Expose
    private CdnData [] OriginData;

    /**
     * Get Resource name, which is classified as follows based on different query filters:
A specific domain name: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
Project ID: ID of the specifically queried project
`all`: Details at the account level 
     * @return Resource Resource name, which is classified as follows based on different query filters:
A specific domain name: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
Project ID: ID of the specifically queried project
`all`: Details at the account level
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource name, which is classified as follows based on different query filters:
A specific domain name: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
Project ID: ID of the specifically queried project
`all`: Details at the account level
     * @param Resource Resource name, which is classified as follows based on different query filters:
A specific domain name: Details of the domain name
`multiDomains`: Aggregated details of multiple domain names
Project ID: ID of the specifically queried project
`all`: Details at the account level
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Origin-pull data details 
     * @return OriginData Origin-pull data details
     */
    public CdnData [] getOriginData() {
        return this.OriginData;
    }

    /**
     * Set Origin-pull data details
     * @param OriginData Origin-pull data details
     */
    public void setOriginData(CdnData [] OriginData) {
        this.OriginData = OriginData;
    }

    public ResourceOriginData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceOriginData(ResourceOriginData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.OriginData != null) {
            this.OriginData = new CdnData[source.OriginData.length];
            for (int i = 0; i < source.OriginData.length; i++) {
                this.OriginData[i] = new CdnData(source.OriginData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "OriginData.", this.OriginData);

    }
}

