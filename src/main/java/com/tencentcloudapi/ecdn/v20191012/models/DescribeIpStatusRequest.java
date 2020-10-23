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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpStatusRequest extends AbstractModel{

    /**
    * Acceleration domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Target region of the query:
mainland: nodes in Mainland China
overseas: nodes outside Mainland China
global: global nodes
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Acceleration domain name 
     * @return Domain Acceleration domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Acceleration domain name
     * @param Domain Acceleration domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Target region of the query:
mainland: nodes in Mainland China
overseas: nodes outside Mainland China
global: global nodes 
     * @return Area Target region of the query:
mainland: nodes in Mainland China
overseas: nodes outside Mainland China
global: global nodes
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Target region of the query:
mainland: nodes in Mainland China
overseas: nodes outside Mainland China
global: global nodes
     * @param Area Target region of the query:
mainland: nodes in Mainland China
overseas: nodes outside Mainland China
global: global nodes
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

