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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CidrForCcn extends AbstractModel {

    /**
    * Local CIDR block, including subnet CIDR block and secondary CIDR block
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * Whether the routing policy of the VPC subnet is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PublishedToVbc")
    @Expose
    private Boolean PublishedToVbc;

    /**
     * Get Local CIDR block, including subnet CIDR block and secondary CIDR block
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Cidr Local CIDR block, including subnet CIDR block and secondary CIDR block
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set Local CIDR block, including subnet CIDR block and secondary CIDR block
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Cidr Local CIDR block, including subnet CIDR block and secondary CIDR block
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get Whether the routing policy of the VPC subnet is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PublishedToVbc Whether the routing policy of the VPC subnet is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getPublishedToVbc() {
        return this.PublishedToVbc;
    }

    /**
     * Set Whether the routing policy of the VPC subnet is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PublishedToVbc Whether the routing policy of the VPC subnet is published to CCN.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPublishedToVbc(Boolean PublishedToVbc) {
        this.PublishedToVbc = PublishedToVbc;
    }

    public CidrForCcn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CidrForCcn(CidrForCcn source) {
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.PublishedToVbc != null) {
            this.PublishedToVbc = new Boolean(source.PublishedToVbc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "PublishedToVbc", this.PublishedToVbc);

    }
}

