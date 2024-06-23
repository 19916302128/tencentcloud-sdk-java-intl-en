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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatasourceRequest extends AbstractModel {

    /**
    * Unique Object ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * production: production, development: development
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
     * Get Unique Object ID 
     * @return Id Unique Object ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique Object ID
     * @param Id Unique Object ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get production: production, development: development 
     * @return Env production: production, development: development
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set production: production, development: development
     * @param Env production: production, development: development
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    public DescribeDatasourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasourceRequest(DescribeDatasourceRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Env", this.Env);

    }
}

