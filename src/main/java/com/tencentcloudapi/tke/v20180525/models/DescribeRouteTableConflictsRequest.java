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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteTableConflictsRequest extends AbstractModel{

    /**
    * Route table CIDR
    */
    @SerializedName("RouteTableCidrBlock")
    @Expose
    private String RouteTableCidrBlock;

    /**
    * VPC bound to the route table
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get Route table CIDR 
     * @return RouteTableCidrBlock Route table CIDR
     */
    public String getRouteTableCidrBlock() {
        return this.RouteTableCidrBlock;
    }

    /**
     * Set Route table CIDR
     * @param RouteTableCidrBlock Route table CIDR
     */
    public void setRouteTableCidrBlock(String RouteTableCidrBlock) {
        this.RouteTableCidrBlock = RouteTableCidrBlock;
    }

    /**
     * Get VPC bound to the route table 
     * @return VpcId VPC bound to the route table
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC bound to the route table
     * @param VpcId VPC bound to the route table
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public DescribeRouteTableConflictsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteTableConflictsRequest(DescribeRouteTableConflictsRequest source) {
        if (source.RouteTableCidrBlock != null) {
            this.RouteTableCidrBlock = new String(source.RouteTableCidrBlock);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableCidrBlock", this.RouteTableCidrBlock);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

