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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcResourceDashboardRequest extends AbstractModel{

    /**
    * Vpc instance ID, e.g. vpc-f1xjkw1b.
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
     * Get Vpc instance ID, e.g. vpc-f1xjkw1b. 
     * @return VpcIds Vpc instance ID, e.g. vpc-f1xjkw1b.
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set Vpc instance ID, e.g. vpc-f1xjkw1b.
     * @param VpcIds Vpc instance ID, e.g. vpc-f1xjkw1b.
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    public DescribeVpcResourceDashboardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcResourceDashboardRequest(DescribeVpcResourceDashboardRequest source) {
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);

    }
}

