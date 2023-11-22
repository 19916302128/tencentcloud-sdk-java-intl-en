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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageHarvestJobRequest extends AbstractModel {

    /**
    * Task ID, a globally unique identifier.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get Task ID, a globally unique identifier. 
     * @return ID Task ID, a globally unique identifier.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Task ID, a globally unique identifier.
     * @param ID Task ID, a globally unique identifier.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public DescribeStreamPackageHarvestJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageHarvestJobRequest(DescribeStreamPackageHarvestJobRequest source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

