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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveDomainRequest extends AbstractModel{

    /**
    * Domain name to be deleted.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Type. 0: push, 1: playback.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get Domain name to be deleted. 
     * @return DomainName Domain name to be deleted.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name to be deleted.
     * @param DomainName Domain name to be deleted.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Type. 0: push, 1: playback. 
     * @return DomainType Type. 0: push, 1: playback.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Type. 0: push, 1: playback.
     * @param DomainType Type. 0: push, 1: playback.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public DeleteLiveDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLiveDomainRequest(DeleteLiveDomainRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

