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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationDetail extends AbstractModel{

    /**
    * Original instance configuration information
    */
    @SerializedName("OldInfo")
    @Expose
    private KeyValue [] OldInfo;

    /**
    * Updated instance configuration information
    */
    @SerializedName("NewInfo")
    @Expose
    private KeyValue [] NewInfo;

    /**
     * Get Original instance configuration information 
     * @return OldInfo Original instance configuration information
     */
    public KeyValue [] getOldInfo() {
        return this.OldInfo;
    }

    /**
     * Set Original instance configuration information
     * @param OldInfo Original instance configuration information
     */
    public void setOldInfo(KeyValue [] OldInfo) {
        this.OldInfo = OldInfo;
    }

    /**
     * Get Updated instance configuration information 
     * @return NewInfo Updated instance configuration information
     */
    public KeyValue [] getNewInfo() {
        return this.NewInfo;
    }

    /**
     * Set Updated instance configuration information
     * @param NewInfo Updated instance configuration information
     */
    public void setNewInfo(KeyValue [] NewInfo) {
        this.NewInfo = NewInfo;
    }

    public OperationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationDetail(OperationDetail source) {
        if (source.OldInfo != null) {
            this.OldInfo = new KeyValue[source.OldInfo.length];
            for (int i = 0; i < source.OldInfo.length; i++) {
                this.OldInfo[i] = new KeyValue(source.OldInfo[i]);
            }
        }
        if (source.NewInfo != null) {
            this.NewInfo = new KeyValue[source.NewInfo.length];
            for (int i = 0; i < source.NewInfo.length; i++) {
                this.NewInfo[i] = new KeyValue(source.NewInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OldInfo.", this.OldInfo);
        this.setParamArrayObj(map, prefix + "NewInfo.", this.NewInfo);

    }
}

